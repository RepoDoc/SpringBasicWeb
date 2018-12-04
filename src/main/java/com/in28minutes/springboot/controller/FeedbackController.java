/**
 * 
 */
package com.in28minutes.springboot.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.in28minutes.springboot.model.Feedback;

/**
 * @author minda
 *
 */
@Controller
public class FeedbackController {
	@RequestMapping(value = "/feedback", method = RequestMethod.GET)
    public ModelAndView showForm() {
        return new ModelAndView("feedback", "feedback", new Feedback());
    }
 
    @RequestMapping(value = "/spring-mvc-xml/addFeedback", method = RequestMethod.POST)
    public String submit(@Valid @ModelAttribute("feedback")Feedback feedback, 
      BindingResult result, ModelMap model) {
        if (result.hasErrors()) {
            return "error";
        }
        model.addAttribute("name", feedback.getName());
        model.addAttribute("village", feedback.getVillage());
        return "feedbackHome";
    }

}
