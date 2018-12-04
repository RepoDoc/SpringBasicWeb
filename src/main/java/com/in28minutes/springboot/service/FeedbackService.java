/**
 * 
 */
package com.in28minutes.springboot.service;

import com.in28minutes.springboot.model.Feedback;

/**
 * @author minda
 *
 */
public class FeedbackService {	
		 
	public void save(Feedback feedback) {
		String name = feedback.getName();
		  String village = feedback.getVillage();
		  System.out.println("Name : "+ name+"" );
		  System.out.println("Village : "+ village+"" );
   }
}


