<%@ include file="/WEB-INF/template/include.jsp"%>

<%@ include file="/WEB-INF/template/header.jsp"%>

<h2><spring:message code="conceptnames-omod.title" /></h2>

<br/>


<table>
  <tr>
   <th>Concept Id</th>
   <th>Retired</th>
  </tr>
  <c:forEach var="concept" items="${concepts}">
      <tr>
        <td>${concept.conceptId}</td>
        <td>${concept.retired}</td>
      </tr>		
  </c:forEach>
</table>



<table>
  <tr>
   <th>User Id</th>
   <th>Username</th>
  </tr>
  <c:forEach var="user" items="${users}">
      <tr>
        <td>${user.userId}</td>
        <td>${user.systemId}</td>
      </tr>		
  </c:forEach>
</table>

<%@ include file="/WEB-INF/template/footer.jsp"%>
