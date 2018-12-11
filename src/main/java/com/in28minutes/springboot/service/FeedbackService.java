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
        model.addAttribute("roPlantname", feedback.getRoPlantname());
        model.addAttribute("costOfJarTwentyLtr", feedback.getCostOfJarTwentyLtr());
        model.addAttribute("memberShipFee", feedback.getMemberShipFee());
        model.addAttribute("normalDeliveryTimeOfWater",feedback.getNormalDeliveryTimeOfWater());
        model.addAttribute("deliveryTimelyWhenRequired", feedback.getDeliveryTimelyWhenRequired());
        model.addAttribute("inSummerWaterCold", feedback.isInSummerWaterCold());
        model.addAttribute("ifPriceIncreasedWillYouBuy", feedback.isIfPriceIncreasedWillYouBuy());
        model.addAttribute("paymentMethodOfJar", feedback.getPaymentMethodOfJar());
        model.addAttribute("tasteOfWater", feedback.getTasteOfWater());
        model.addAttribute("colorOfWater", feedback.getColorOfWater());
        model.addAttribute("odourOfWater", feedback.getOdourOfWater());
        model.addAttribute("operatorBehavior", feedback.getOperatorBehavior());
        model.addAttribute("driverBehavior", feedback.getDriverBehavior());
        model.addAttribute("roPlantTiming", feedback.getRoPlantTiming());
        model.addAttribute("waterATMWorksAllTheTime", feedback.isWaterATMWorksAllTheTime());
        model.addAttribute("waterQualityReportChecked", feedback.isWaterQualityReportChecked());        
        model.addAttribute("intervalOfBuyingJar", feedback.getIntervalOfBuyingJar());
        model.addAttribute("suggestion", feedback.getSuggestion());          
		feedbackRepository.save(feedback);
	}
	
	public void listFeedback() {
		feedbackRepository.findAll();
	}
}


