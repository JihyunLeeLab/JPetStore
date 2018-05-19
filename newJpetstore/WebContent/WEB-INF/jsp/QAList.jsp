
<div align="center">
 
  <table width="700">
    <tr bgcolor="#CCCCCC">
      <td><b>No.</b></td> <td><b>Title</b></td> <td><b>Writer</b></td>
    </tr>
    <c:forEach var="question" items="${questionList}">
      <tr bgcolor="#FFFF88">
        <td><b><td><fmt:formatNumber value="${question.no}"/></td></b></td>
        <td>
        <a href="<c:url value="/shop/ItemAnswer.do"/>">
        <fmt:formatString value="${question.title}" /></a>
        </td>
        <td><fmt:formatNumber value="${question.writer}"/></td>
      </tr>
    </c:forEach>
  </table>
</div>
