/**
 * 
 */
package com.in28minutes.springboot.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.in28minutes.springboot.model.Feedback;
import com.in28minutes.springboot.service.IFeedbackService;

/**
 * @author minda
 *
 */
@Controller
public class FeedbackController {
	
	@Autowired
	IFeedbackService feedbackService;
	
	@RequestMapping(value = "/feedback", method = RequestMethod.GET)
    public ModelAndView showForm() {
        return new ModelAndView("feedback", "feedback", new Feedback());
    }
 
    @RequestMapping(value = "/addFeedback", method = RequestMethod.POST)
    public String submitFeedback(@Valid @ModelAttribute("feedback")Feedback feedback,BindingResult result, ModelMap model) {
        if (result.hasErrors()) {
            return "error";
        }
        
        feedbackService.submitFeedback(model,feedback);        
        return "feedbackHome";
    }
    
    @RequestMapping(value="/listFeedback", method = RequestMethod.GET)
    public String getListFeedback(@Valid @ModelAttribute("feedback")Feedback feedback,BindingResult result, ModelMap model) {
    	if (result.hasErrors()) {
            return "error";
        }
    	feedbackService.listFeedback();
    	return "feedbackList";
    }

}
