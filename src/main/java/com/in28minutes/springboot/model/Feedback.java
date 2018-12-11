/**
 * 
 */
package com.in28minutes.springboot.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.in28minutes.springboot.model.Feedback;

/**
 * @author minda
 *
 */
@Entity
@Table(name="APP_FEEDBACK")
public class Feedback implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3328129348325226819L;
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="NAME", nullable=false)
	private String name;
	
	@Column(name="VILLAGE", nullable=false)
	private String village;
	
	private String normalDeliveryTimeOfWater;
	
	private String deliveryTimelyWhenRequired;
	
	private String costOfJarTwentyLtr;
	
	private String inSummerWaterCold;
	
	private String ifPriceIncreasedWillYouBuy;
	
	private String paymentMethodOfJar;
	
	private String tasteOfWater;
	
	private String colorOfWater;
	
	private String odourOfWater;
	
	private String memberShipFee;
	
	private String isTheJarCleaned;
	
	private String operatorBehavior;
	
	private String driverBehavior;
	
	private String roPlantTiming;
	
	private String waterATMWorksAllTheTime;
	
	private String waterQualityReportChecked;
	
	private String suggestion;
	
	private String intervalOfBuyingJar;
	
	private String roPlantname;
	
	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * @return the normalDeliveryTimeOfWater
	 */
	public String getNormalDeliveryTimeOfWater() {
		return normalDeliveryTimeOfWater;
	}
	/**
	 * @param normalDeliveryTimeOfWater the normalDeliveryTimeOfWater to set
	 */
	public void setNormalDeliveryTimeOfWater(String normalDeliveryTimeOfWater) {
		this.normalDeliveryTimeOfWater = normalDeliveryTimeOfWater;
	}
	/**
	 * @return the isDeliveryTimelyWhenRequired
	 */
	public String getDeliveryTimelyWhenRequired() {
		return deliveryTimelyWhenRequired;
	}
	/**
	 * @param isDeliveryTimelyWhenRequired the isDeliveryTimelyWhenRequired to set
	 */
	public void setDeliveryTimelyWhenRequired(String deliveryTimelyWhenRequired) {
		this.deliveryTimelyWhenRequired = deliveryTimelyWhenRequired;
	}
	/**
	 * @return the costOfJarTwentyLtr
	 */
	public String getCostOfJarTwentyLtr() {
		return costOfJarTwentyLtr;
	}
	/**
	 * @param costOfJarTwentyLtr the costOfJarTwentyLtr to set
	 */
	public void setCostOfJarTwentyLtr(String costOfJarTwentyLtr) {
		this.costOfJarTwentyLtr = costOfJarTwentyLtr;
	}
	/**
	 * @return the inSummerWaterCold
	 */
	public String isInSummerWaterCold() {
		return inSummerWaterCold;
	}
	/**
	 * @param inSummerWaterCold the inSummerWaterCold to set
	 */
	public void setInSummerWaterCold(String inSummerWaterCold) {
		this.inSummerWaterCold = inSummerWaterCold;
	}
	/**
	 * @return the ifPriceIncreasedWillYouBuy
	 */
	public String isIfPriceIncreasedWillYouBuy() {
		return ifPriceIncreasedWillYouBuy;
	}
	/**
	 * @param ifPriceIncreasedWillYouBuy the ifPriceIncreasedWillYouBuy to set
	 */
	public void setIfPriceIncreasedWillYouBuy(String ifPriceIncreasedWillYouBuy) {
		this.ifPriceIncreasedWillYouBuy = ifPriceIncreasedWillYouBuy;
	}
	/**
	 * @return the paymentMethodOfJar
	 */
	public String getPaymentMethodOfJar() {
		return paymentMethodOfJar;
	}
	/**
	 * @param paymentMethodOfJar the paymentMethodOfJar to set
	 */
	public void setPaymentMethodOfJar(String paymentMethodOfJar) {
		this.paymentMethodOfJar = paymentMethodOfJar;
	}
	/**
	 * @return the tasteOfWater
	 */
	public String getTasteOfWater() {
		return tasteOfWater;
	}
	/**
	 * @param tasteOfWater the tasteOfWater to set
	 */
	public void setTasteOfWater(String tasteOfWater) {
		this.tasteOfWater = tasteOfWater;
	}
	/**
	 * @return the colorOfWater
	 */
	public String getColorOfWater() {
		return colorOfWater;
	}
	/**
	 * @param colorOfWater the colorOfWater to set
	 */
	public void setColorOfWater(String colorOfWater) {
		this.colorOfWater = colorOfWater;
	}
	/**
	 * @return the odourOfWater
	 */
	public String getOdourOfWater() {
		return odourOfWater;
	}
	/**
	 * @param odourOfWater the odourOfWater to set
	 */
	public void setOdourOfWater(String odourOfWater) {
		this.odourOfWater = odourOfWater;
	}
	/**
	 * @return the memberShipFee
	 */
	public String getMemberShipFee() {
		return memberShipFee;
	}
	/**
	 * @param memberShipFee the memberShipFee to set
	 */
	public void setMemberShipFee(String memberShipFee) {
		this.memberShipFee = memberShipFee;
	}
	/**
	 * @return the isTheJarCleaned
	 */
	public String isTheJarCleaned() {
		return isTheJarCleaned;
	}
	/**
	 * @param isTheJarCleaned the isTheJarCleaned to set
	 */
	public void setTheJarCleaned(String isTheJarCleaned) {
		this.isTheJarCleaned = isTheJarCleaned;
	}
	/**
	 * @return the operatorBehavior
	 */
	public String getOperatorBehavior() {
		return operatorBehavior;
	}
	/**
	 * @param operatorBehavior the operatorBehavior to set
	 */
	public void setOperatorBehavior(String operatorBehavior) {
		this.operatorBehavior = operatorBehavior;
	}
	/**
	 * @return the driverBehavior
	 */
	public String getDriverBehavior() {
		return driverBehavior;
	}
	/**
	 * @param driverBehavior the driverBehavior to set
	 */
	public void setDriverBehavior(String driverBehavior) {
		this.driverBehavior = driverBehavior;
	}
	/**
	 * @return the roPlantTiming
	 */
	public String getRoPlantTiming() {
		return roPlantTiming;
	}
	/**
	 * @param roPlantTiming the roPlantTiming to set
	 */
	public void setRoPlantTiming(String roPlantTiming) {
		this.roPlantTiming = roPlantTiming;
	}
	/**
	 * @return the waterATMWorksAllTheTime
	 */
	public String isWaterATMWorksAllTheTime() {
		return waterATMWorksAllTheTime;
	}
	/**
	 * @param waterATMWorksAllTheTime the waterATMWorksAllTheTime to set
	 */
	public void setWaterATMWorksAllTheTime(String waterATMWorksAllTheTime) {
		this.waterATMWorksAllTheTime = waterATMWorksAllTheTime;
	}
	/**
	 * @return the waterQualityReportChecked
	 */
	public String isWaterQualityReportChecked() {
		return waterQualityReportChecked;
	}
	/**
	 * @param waterQualityReportChecked the waterQualityReportChecked to set
	 */
	public void setWaterQualityReportChecked(String waterQualityReportChecked) {
		this.waterQualityReportChecked = waterQualityReportChecked;
	}
	/**
	 * @return the suggestion
	 */
	public String getSuggestion() {
		return suggestion;
	}
	/**
	 * @param suggestion the suggestion to set
	 */
	public void setSuggestion(String suggestion) {
		this.suggestion = suggestion;
	}
	/**
	 * @return the intervalOfBuyingJar
	 */
	public String getIntervalOfBuyingJar() {
		return intervalOfBuyingJar;
	}
	/**
	 * @param intervalOfBuyingJar the intervalOfBuyingJar to set
	 */
	public void setIntervalOfBuyingJar(String intervalOfBuyingJar) {
		this.intervalOfBuyingJar = intervalOfBuyingJar;
	}
	/**
	 * @return the roPlantname
	 */
	public String getRoPlantname() {
		return roPlantname;
	}
	/**
	 * @param roPlantname the roPlantname to set
	 */
	public void setRoPlantname(String roPlantname) {
		this.roPlantname = roPlantname;
	}

	
	
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the village
	 */
	public String getVillage() {
		return village;
	}
	/**
	 * @param village the village to set
	 */
	public void setVillage(String village) {
		this.village = village;
	}
	
	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		Feedback Feedback = (Feedback) o;

//		if (Double.compare(Feedback.salary, salary) != 0) return false;
//		if (id != null ? !id.equals(Feedback.id) : Feedback.id != null) return false;
//		if (name != null ? !name.equals(Feedback.name) : Feedback.name != null) return false;
//		return age != null ? age.equals(Feedback.age) : Feedback.age == null;
		return id != null ? id.equals(Feedback.id) : Feedback.id == null;
	}

	@Override
	public int hashCode() {
		int result;
//		long temp;
		result = id != null ? id.hashCode() : 0;
//		result = 31 * result + (name != null ? name.hashCode() : 0);
//		result = 31 * result + (age != null ? age.hashCode() : 0);
//		temp = Double.doubleToLongBits(salary);
//		result = 31 * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public String toString() {
		return "Feedback [id=" + id + ", name=" + name + ", village=" + village+ "]";//, salary=" + salary + "
	}
}
