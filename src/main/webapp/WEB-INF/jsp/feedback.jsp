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
               <td><form:label path="name">Name:</form:label></td>
               <td><form:input path="name"/></td>
           </tr>
           <tr>
               <td><form:label path="village">Village:</form:label></td>
               <td><form:input path="village"/></td>
           </tr>
           
           <tr>
               <td><input type="submit" value="Submit"/></td>
           </tr>
       </table>
   </form:form>
</body>
</html>