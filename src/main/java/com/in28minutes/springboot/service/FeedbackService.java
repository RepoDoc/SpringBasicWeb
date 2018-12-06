/**
 * 
 */
package com.in28minutes.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.ModelMap;

import com.in28minutes.springboot.model.Feedback;
import com.in28minutes.springboot.repositories.FeedbackRepository;

/**
 * @author minda
 *
 */
@Service("feedbackService")
@Transactional
public class FeedbackService implements IFeedbackService{	
	
	@Autowired
	FeedbackRepository feedbackRepository;
		 
	public void submitFeedback(ModelMap model,Feedback feedback) {
		model.addAttribute("name", feedback.getName());
        model.addAttribute("village", feedback.getVillage());
		feedbackRepository.save(feedback);
	}
}


