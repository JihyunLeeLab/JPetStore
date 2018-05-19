<%@ page contentType="text/html; charset=UTF-8" %>
<%@ include file="IncludeTop.jsp"%>

<head>
<style>
#menu {
 	width:20%;
	background-color: #ffffff;
    border: none;
    border-spacing: 2px;
    float : left;
   /*  padding-right: 200px; */
    /* padding-left: 10px; */
  /*   height : 100%; */
}

#itemImg {
	width:30%;
	background-color: #ffffff;
    border: none;
    border-spacing: 2px;
    float : left;
    padding-right: 30px;
}

#itemContent {
	width:40%;
	background-color: #ffffff;
    border: none;
    border-spacing: 2px;
    float : left;
   /*  padding-right: 100px; */
}

#auction {
	clear:both;
}


</style>
</head>
<!-- 경매용 아이템 상세보기 -->
<div id="menu">
<a href='<c:url value="/shop/viewProduct.do">
        <c:param name="productId" value="${product.productId}"/></c:url>'>
        <b><font color="black" size="2">
          &lt;&lt; <c:out value="${product.name}" /></font></b></a>
</div>

<p>

<%-- <div align="center">
  <table id="item">
    <tr>
      <td bgcolor="#FFFFFF">
        <c:out value="${product.description}" escapeXml="false" /></td>
    </tr>
    <tr>
      <td width="100%" bgcolor="#CCCCCC"><b><c:out value="${item.itemId}" /></b></td>
    </tr>
    
    <tr>
    	<td>
    		<a href="<c:url value="/shop/seller.do"/>"><c:out value="${item.seller}" /></a>
		</td>
		<td>
			<a href="<c:url value="/shop/blackList.do"/>"><c:out value="${blackList}" /></a>
		</td>
		<td>
			<a href="<c:url value="/shop/participationAuction.do"/>"><c:out value="${#}" /></a>
		</td>
    </tr>
    
    
    <tr>
      <td><font size="3"><i><c:out value="${product.name}" /></i></font></td>
    </tr>
    <tr>
      <td>
      <c:if test="${item.quantity <= 0}">
        <font color="red" size="2"><i>Back ordered.</i></font>
      </c:if> 
      <c:if test="${item.quantity > 0}">
        <font size="2"><fmt:formatNumber value="${item.quantity}" /> in stock.</font>
      </c:if>
      </td>
    </tr>
    <tr>
      <td><fmt:formatNumber value="${item.listPrice}" pattern="$#,##0.00" /></td>
    </tr>
    <tr>
      <td>
        <a href='<c:url value="/shop/addItemToCart.do">
          <c:param name="workingItemId" value="${item.itemId}"/></c:url>'>
          <img border="0" src="../images/button_add_to_cart.gif" alt="" /></a>
      </td>
    </tr>
  </table>
  </div>
   --%>
   <center>
   <div id="itemImg">
   	<%-- <c:out value="${product.description}" escapeXml="false" /> --%>
   	<img  src="../images/cat1.gif"  height="300" width="300" />
   </div>
   
   <div id="itemContent">
   <table height="300">
   <tr>
     	<Td><b>item Id</b></td><td> <c:out value="${item.itemId}" /></Td>
     </tr>
     <tr>
     	<Td><b>Description</b></td><td> <c:out value="${item.attribute1}" /></Td>
     </tr>
     <tr>
     	<Td><b>item.attribute2</b></td><td> <c:out value="${item.attribute2}" /></Td>
     </tr>
     <tr>
     	<Td><b>item.attribute3</b></td><td> <c:out value="${item.attribute3}" /></Td>
     </tr>
     <tr>
     	<Td><b>item.attribute4</b></td><td> <c:out value="${item.attribute4}" /></Td>
     </tr>
     <tr>
     	<Td><b>item.attribute5</b></td><td> <c:out value="${item.attribute5}" /></Td>
     </tr>
     <tr>
     	<Td><b>product.name</b></td><td> <c:out value="${product.name}" /></Td>
     </tr>
     <tr>
     	<Td><b>PRICE</b></td><td> 300,000</Td>
     </tr>
     
     <tr>
     	<Td><b>SELLER</b>&nbsp;<td><a href="#">mike</a></Td>
     	<td><a href="<c:url value="/shop/blackList.do"/>">
     		<button>Black List</button>
     	</a></td>
     </tr>
     
	<tr>
     	<Td>
  		<a href='<c:url value="/shop/addItemToCart.do">
          <c:param name="workingItemId" value="${item.itemId}"/></c:url>'>
       <button  class="btn btn-light btn-md">Add to Cart </button>
     	</a>
     	</Td>
     	<Td>
  		<a href='<c:url value="/shop/partInAuction.do">
          <c:param name="partAuction" value="${item.itemId}"/></c:url>'>
       <button  class="btn btn-light btn-md">경매 참여하기</button>
     	</a>
     	</Td>
     </tr>
   </table>&nbsp;
   </div>
    
   <div id="auction">
  	<!-- 경매상황 차트 넣기 -->
  	<h1> Auction Charts </h1>
  </div> 
  
  <div id="QA">
  <p><h1> Q & A </h1>
  	<%@ include file="QAList.jsp"%>
  	
  </div>

</center>
