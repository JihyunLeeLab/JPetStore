<%@ page contentType="text/html; charset=UTF-8" %>
<%@ include file="IncludeTop.jsp"%>

<table>
  <tr style="vertical-align:top">
    <td style="text-align:left;width:20%;">
      
          <td><a href='<c:url value="/shop/goBack.do"/>'>
            <b><font color="black" size="2">&lt;&lt; BACK</font></b></a></td>
        </tr>
</table>


<div align="center">
<h2>경매 참여</h2>
  <p>현재 최저 입찰가  <%-- <c:out value="${auction.startPrice}" /> --%> 100,000</p>
  <br>

  <table>
    <tr bgcolor="#CCCCCC">
      <td><b>Ranking</b></td>
      <td><b>User ID</b></td>
      <td><b>Bid Price</b></td>
    </tr>
    <%-- <c:forEach var="bid" items="${itemList}">
      <tr bgcolor="#FFFF88">
        <td>
       	 <b><c:param name="bidId" value="${item.itemId}"/></b>
         </td>
        <td>
        	<c:out value="${account.userId}" />
        </td>
        <td>
          <c:out value="${item.price}" />
        </td>
      </tr>
    </c:forEach> --%>
    
     <tr bgcolor="#FFFF88">
        <td>
       	 <b>1</b>
         </td>
        <td>
        	user1
        </td>
        <td>
          150,000
        </td>
      </tr>
      
      <tr bgcolor="#FFFF88">
        <td>
       	 <b>2</b>
         </td>
        <td>
        	user2
        </td>
        <td>
          140,000
        </td>
      </tr>
    
  </table>
  
  <Br>
  <div>
	현재 경매에 참여한 인원 : <c:out value="3" /><br>
	현재 내 입찰가 : <c:out value="140000" /><br>
	</div>
	
	<div>
	<form action='<c:url value="/shop/bidPrice.do"/>' method="POST">
			<input type="text" name="bidPrice" />
			<input type="submit" value="update" />
	</form>
	</div>
  
  
</div>

