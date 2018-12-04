<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
 pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Water Quality Data Collection Form </title>
</head>
<body>

<%@ page import="com.in28minutes.springboot.model.Feedback" %> 
<%@ page import="com.in28minutes.springboot.service.FeedbackService"%> 
<%
  // Get the form requests 
//   String firstName = request.getParameter("firstName");
//   String lastName = request.getParameter("lastName");
//   String emailAddress = request.getParameter("emailAddress");
  
  // Get the complete real path for subscription.txt
//   ServletContext context = request.getServletContext();
//   String filePath = context.getRealPath("/subscription.txt");
  Feedback feedback = new Feedback(); 
  FeedbackService fbService= new FeedbackService();
 
 %>
 
 <SCRIPT language="JavaScript">
           
     function submitForm()
     {  
    	alert("::::::");
     	feedback.setName(request.getParameter("name"));
     	feedback.setVillage(request.getParameter("village"));                	  
     	fbService.save(feedback);
     }    
     function resetForm()
     {
         alert("resetl");
     }    
           
</SCRIPT>

<!-- <h1>[richaminda@gmail.com][M4dqPr6q]</h1> -->
<form NAME="feedbackForm">
   Name: <input type="text" name="name"> <br><br>
   Village: <input type="text" name="village"> <br><br>
   
   <input type="submit" value="Submit" onClick='submitForm()'>
   <input type="reset" value="Reset" onClick='resetForm()'>
</form>





</body>
</html>