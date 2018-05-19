<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

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
<form action='<c:url value="/shop/form/generalForm.do"/>' method="POST">
  
  <table id="general" width ="350">
    <tr>
      <td>
        <h3><font color="darkgreen">General Sale Form</font></h3>
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
              <%-- <form:input path="general.productId" />
              <B><form:errors path="general.productId" cssClass="error" /></B> --%>
              <input type="text" id="productId" />
            </td>
          </tr>
          <tr>
            <td>Item Id</td>
            <td>
              <%-- <form:password path="general.itemId" /> 
              <B><form:errors path="general.itemId" cssClass="error" /></B></td> --%>
              <input type="text" id="itemId" />
          </tr>
          
          <tr>
            <td>Name</td>
            <td>
              <%-- <form:password path="general.name" /> 
              <B><form:errors path="general.name" cssClass="error" /></B></td> --%>
              <input type="text" id="name" />
          </tr>
          
          <tr>
            <td>Price</td>
            <td>
              <%-- <form:password path="general.price" /> 
              <B><form:errors path="general.price" cssClass="error" /></B></td> --%>
              <input type="text" id="price" />
          </tr>
          
          <tr>
            <td>Stock</td>
            <td>
              <%-- <form:password path="general.stock" /> 
              <B><form:errors path="general.stock" cssClass="error" /></B></td> --%>
              <input type="text" id="stock" />
          </tr>
          
        </table> 
        

      </td>
    </tr>
  </table>
  <br />
    <input type="submit" value="Save Information" />
</form>
<p></p>
 
  
</div>