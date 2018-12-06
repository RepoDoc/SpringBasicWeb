/**
 * 
 */
package com.in28minutes.springboot.service;

import org.springframework.ui.ModelMap;

import com.in28minutes.springboot.model.Feedback;

/**
 * @author minda
 *
 */
public interface IFeedbackService {
	void submitFeedback(ModelMap model,Feedback feedback);
}
