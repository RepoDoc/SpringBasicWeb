<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>	
</head>
<body>
   <h3>Water Quality Data Collection Form </h3>
   <form:form method="POST" action="/addFeedback" modelAttribute="feedback">
        <table>
           <tr>
               <td width="30%">Name</td>
               <td><form:input path="name"/></td>
           </tr>
           
           <tr>
               <td width="30%">Village</td>
               <td><form:input path="village"/></td>
           </tr>
           
           <tr>
               <td width="30%">What is the name of RO plant?</td>
               <td><form:input path="roPlantname"/></td>
           </tr>
           
           <tr>
               <td width="30%">What is the price for one 20 Litre Jar?(In Rupee)</td>
               <td><form:input path="costOfJarTwentyLtr"/></td>
           </tr>
           
            <tr>
               <td><form:label path="">How much is the membership fee in RO plant?(In Rupee)</form:label></td>
               <td><form:input path="memberShipFee"/></td>
           </tr> 
           
           <tr>
               <td width="30%">What is the normal delivery time for water?</td>
               <td width="10%"><input type="radio"  name="normalDeliveryTimeOfWater" value="Morning">Morning</td>
               <td width="10%"><input type="radio"  name="normalDeliveryTimeOfWater" value="Noon">Noon</td>
               <td width="10%"><input type="radio"  name="normalDeliveryTimeOfWater" value="Afternoon">Afternoon</td>
               <td width="10%"><input type="radio"  name="normalDeliveryTimeOfWater" value="Evening">Evening</td>
               <td width="10%"><input type="radio"  name="normalDeliveryTimeOfWater" value="Night"> Night</td>
           </tr>
           
           <tr></tr><tr></tr>
           
           <tr>
               <td width="30%">When required, is the water delivery timely?</td>
               <td width="10%"><input type="radio"  name="deliveryTimelyWhenRequired" value="Yes"/>Yes</td>
               <td width="10%"><input type="radio"  name="deliveryTimelyWhenRequired" value="No"/>No</td>
           </tr>
           
           <tr></tr><tr></tr>
           
           <tr>
               <td width="30%">Water delivered in summer is cold?</td>
               <td width="10%"><input type="radio"  name="inSummerWaterCold" value="Yes"/>Yes</td>
               <td width="10%"><input type="radio"  name="inSummerWaterCold" value="No"/>No</td>
           </tr>
           
           <tr></tr><tr></tr>
            
           <tr>
               <td width="30%">If we increase the price by Rs.5, will you buy water?</td>
               <td width="10%"><input type="radio"  name="ifPriceIncreasedWillYouBuy" value="Yes"/>Yes</td>
               <td width="10%"><input type="radio"  name="ifPriceIncreasedWillYouBuy" value="No"/>No</td>
           </tr>
           
           <tr></tr><tr></tr>
           
           <tr>
               <td width="30%">How do you pay for Jar?</td>
               <td width="10%"><input type="radio"  name="paymentMethodOfJar" value="Water ATM Card"/>Water ATM Card</td>
               <td width="10%"><input type="radio"  name="paymentMethodOfJar" value="Cash"/>Cash</td>
               <td width="10%"><input type="radio"  name="paymentMethodOfJar" value="Free"/>Free</td>
           </tr>
           
           <tr></tr><tr></tr>
           
           <tr>
               <td width="30%">How is the taste of water?</td>
               <td width="10%"><input type="radio"  name="tasteOfWater" value="Good"/>Good</td>
               <td width="10%"><input type="radio"  name="tasteOfWater" value="Normal"/>Normal</td>
               <td width="10%"><input type="radio"  name="tasteOfWater" value="Bad"/>Bad</td>
           </tr>
           
           <tr></tr><tr></tr>
           
           <tr>
               <td width="30%">How is the colour of water?</td>
               <td width="10%"><input type="radio"  name="colorOfWater" value="Transparent"/>Transparent</td>
               <td width="10%"><input type="radio"  name="colorOfWater" value="Reddish"/>Reddish</td>
               <td width="10%"><input type="radio"  name="colorOfWater" value="Blackish"/>Blackish</td>
           </tr>
           
           <tr></tr><tr></tr>
           
           <tr>
               <td width="30%">How is the odour of water?</td>
               <td width="10%"><input type="radio"  name="odourOfWater" value="Reddish"/>Smelly</td>
               <td width="10%"><input type="radio"  name="odourOfWater" value="Blackish"/>No Smell</td>
           </tr> 
           
           <tr></tr><tr></tr>
           
           <tr>
               <td width="30%">How is the behavior of operator?</td>
               <td width="10%"><input type="radio"  name="operatorBehavior" value="Good"/>Good</td>
               <td width="10%"><input type="radio"  name="operatorBehavior" value="Bad"/>Bad</td>
               <td width="10%"><input type="radio"  name="operatorBehavior" value="Moderate"/>Moderate</td>
           </tr>
           
           <tr></tr><tr></tr>
           
           <tr>
               <td width="30%">How is the behavior of driver?</td>
               <td width="10%"><input type="radio"  name="driverBehavior" value="Good"/>Good</td>
               <td width="10%"><input type="radio"  name="driverBehavior" value="Bad"/>Bad</td>
               <td width="10%"><input type="radio"  name="driverBehavior" value="Moderate"/>Moderate</td>
           </tr>
           
           <tr></tr><tr></tr>
           
           <tr>
               <td width="30%">What is the timing for RO plant operation?</td>
               <td width="10%"><input type="radio"  name="roPlantTiming" value="Morning">Morning</td>
               <td width="10%"><input type="radio"  name="roPlantTiming" value="Noon">Noon</td>
               <td width="10%"><input type="radio"  name="roPlantTiming" value="Afternoon">Afternoon</td>
               <td width="10%"><input type="radio"  name="roPlantTiming" value="Evening">Evening</td>
               <td width="10%"><input type="radio"  name="roPlantTiming" value="Night"> Night</td>
           </tr>
           
           <tr></tr><tr></tr>
           
           <tr>
               <td width="30%">Does the RO plant operate 24X7 when required?</td>
               <td width="10%"><input type="radio"  name="waterATMWorksAllTheTime" value="Yes"/>Yes</td>
               <td width="10%"><input type="radio"  name="waterATMWorksAllTheTime" value="No"/>No</td>
           </tr>
           
           <tr></tr><tr></tr>
           
           <tr>
               <td width="30%">Have you checked the water quality report available at RO plant?</td>
               <td width="10%"><input type="radio"  name="waterQualityReportChecked" value="Yes"/>Yes</td>
               <td width="10%"><input type="radio"  name="waterQualityReportChecked" value="No"/>No</td>
           </tr>
           
           <tr></tr><tr></tr>
           
           <tr>
               <td width="30%">What is the interval of buying a 20 Litre jar?</td>
               <td width="10%"><input type="radio"  name="intervalOfBuyingJar" value="Morning">Daily</td>
               <td width="10%"><input type="radio"  name="intervalOfBuyingJar" value="Noon">1 Day</td>
               <td width="10%"><input type="radio"  name="intervalOfBuyingJar" value="Afternoon">2 Days</td>
           </tr>
           
           <tr></tr><tr></tr>
           
           <tr>
               <td width="30%">Any suggestion</td>
               <td><form:textarea path="suggestion"/></td>
           </tr> 
           <tr></tr><tr></tr><tr></tr><tr></tr><tr></tr><tr></tr><tr></tr>
           
           <tr>
           	   <td></td>
               <td><input type="submit" value="Submit"/></td>
               <td><input type="reset"  value="Reset" onclick="this.form.reset();"></td>
           </tr>
           
       </table>
   </form:form>
</body>
</html>