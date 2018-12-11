<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>	
</head>
<body>
<table>
  <c:forEach items="${feedback}" var="feedback">
    <tr>
      <td><c:out value="${feedback.name}" /></td>
      <td><c:out value="${feedback.village}" /></td>
    </tr>
  </c:forEach>
</table>
</body>
