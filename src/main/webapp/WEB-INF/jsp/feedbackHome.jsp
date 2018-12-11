<!DOCTYPE html>
<html>
<head>	
</head>
<body>
    <h3>Submitted Feedback</h3>
    <form:form method="GET" action="/listFeedback" modelAttribute="feedback">
	    <table>
	        <tr>
	            <td>Name</td>
	            <td>${name}</td>
	        </tr>
	        
	        <tr>
	            <td>Village</td>
	            <td>${village}</td>
	        </tr>
	        
	        <tr>
	            <td>What is the name of RO plant?</td>
	            <td>${roPlantname}</td>
	        </tr>
	        
	        <tr>
	            <td>What is the price for one 30 Litre Jar?(In Rupee)</td>
	            <td>${costOfJarTwentyLtr}</td>
	        </tr>
	        
	        <tr>
	            <td>How much is the membership fee in RO plant?(In Rupee)</td>
	            <td>${memberShipFee}</td>
	        </tr>
	        
	        <tr>
	            <td>What is the normal delivery time for water?</td>
	            <td>${normalDeliveryTimeOfWater}</td>
	        </tr>
	        
	        <tr>
	            <td>When required, is the water delivery timely?</td>
	            <td>${deliveryTimelyWhenRequired}</td>
	        </tr>
	        
	        <tr>
	            <td>Water delivered in summer is cold?</td>
	            <td>${inSummerWaterCold}</td>
	        </tr>
	        
	        <tr>
	            <td>If we increase the price by Rs.5, will you buy water?</td>
	            <td>${ifPriceIncreasedWillYouBuy}</td>
	        </tr>
	        
	        <tr>
	            <td>How do you pay for Jar?</td>
	            <td>${paymentMethodOfJar}</td>
	        </tr>
	                    
	        <tr>
	            <td>How is the taste of water?</td>
	            <td>${tasteOfWater}</td>
	        </tr>
	        
	        <tr>
	            <td>How is the colour of water?</td>
	            <td>${colorOfWater}</td>
	        </tr>
	        
	        <tr>
	            <td>How is the odour of water?</td>
	            <td>${odourOfWater}</td>
	        </tr>
	        
	        <tr>
	            <td>How is the behavior of operator?</td>
	            <td>${operatorBehavior}</td>
	        </tr>
	        
	        <tr>
	            <td>How is the behavior of driver?</td>
	            <td>${driverBehavior}</td>
	        </tr>
	        
	        <tr>
	            <td>What is the timing for RO plant operation?</td>
	            <td>${roPlantTiming}</td>
	        </tr>
	        
	        <tr>
	            <td>Does the RO plant operate 24X7 when required?</td>
	            <td>${waterATMWorksAllTheTime}</td>
	        </tr>
	        
	        <tr>
	            <td>Have you checked the water quality report available at RO plant?</td>
	            <td>${waterQualityReportChecked}</td>
	        </tr>
	        
	        <tr>
	            <td>What is the interval of buying a 20 Litre jar?</td>
	            <td>${intervalOfBuyingJar}</td>
	        </tr>
	        
	        <tr>
	            <td>Suggestions</td>
	            <td>${suggestion}</td>
	        </tr>
	        
	        <tr></tr><tr></tr><tr></tr><tr></tr><tr></tr><tr></tr><tr></tr>
	           
	        <tr>
	       	   <td></td>
	            <td><input type="submit" value="Show List"/></td>
	        </tr>
	    </table>
    </form:form>
</body>