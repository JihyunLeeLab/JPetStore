<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<%@ include file="IncludeTop.jsp"%>

<table>
  <tr style="vertical-align:top">
    <td style="text-align:left;width:20%;">
      <table id="main-menu">
        <tr>
          <td><a href='<c:url value="/shop/SellCategory.do"/>'>
            <b><font color="black" size="2">&lt;&lt; BACK</font></b></a></td>
        </tr>
</table>

<div align="center">
<form action='<c:url value="/shop/form/auctionForm.do"/>' method="POST">

  <table id="auction" width ="350">
    <tr>
      <td>
        <h3><font color="darkgreen">Auction Form</font></h3>
        <table class="n13">
        <tr>
            <td>Image</td>
            <td>
              <input type="file" name="image" />
            </td>
          </tr>
          <tr>
          
            <td>Product ID</td>
            <td>
              <%-- <form:input path="auction.productId" />
              <B><form:errors path="auction.productId" cssClass="error" /></B> --%>
              <input type="text" id="produckId" />
            </td>
          </tr>
          <tr>
            <td>Item Id</td>
            <td>
              <%-- <form:password path="auction.itemId" /> 
              <B><form:errors path="auction.itemId" cssClass="error" /></B></td> --%>
              <input type="text" id="itemId" />
          </tr>
          
          <tr>
            <td>Name</td>
            <td>
              <%-- <form:password path="auction.name" /> 
              <B><form:errors path="auction.name" cssClass="error" /></B></td> --%>
              <input type="text" id="name" />
          </tr>
          
          <tr>
            <td>Start Price</td>
            <td>
             <%--  <form:password path="auction.startPrice" /> 
              <B><form:errors path="auction.startPrice" cssClass="error" /></B></td> --%>
              <input type="text" id="startPrice" />
          </tr>
          
          <tr>
            <td>Start Date</td>
            <td>
              <%-- <form:password path="auction.startDate" /> 
              <B><form:errors path="auction.startDate" cssClass="error" /></B></td> --%>
              <input type="text" id="startDate" />
          </tr>
          
          <tr>
            <td>End Date</td>
            <td>
             <%--  <form:password path="auction.endDate" /> 
              <B><form:errors path="auction.endDate" cssClass="error" /></B></td> --%>
              <input type="text" id="endDate" />
          </tr>
          
          <tr>
            <td>Stock</td>
            <td>
              <%-- <form:password path="auction.stock" /> 
              <B><form:errors path="auction.stock" cssClass="error" /></B></td> --%>
              <input type="text" id="stock" />
          </tr>
          
        </table> 
        

      </td>
    </tr>
  </table>
  <br />
    <input type="submit" value="Auction Registration" />
</form>
<p></p>
 
  
</div>
