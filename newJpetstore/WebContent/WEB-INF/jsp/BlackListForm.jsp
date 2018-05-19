<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ include file="IncludeTop.jsp"%>

<table>
  <tr style="vertical-align:top">
    <td style="text-align:left;width:20%;">
      <table id="main-menu">
        <tr>
          <td><a href='<c:url value="/shop/auctionForm.do"/>'>
            <b><font color="black" size="2">&lt;&lt; BACK</font></b></a></td>
        </tr>
</table>


<div align="center">
<form action='<c:url value="/shop/blackList.do"/>' method="POST">
  <table id="blackList">
    <tr>
      <td>
      <h2><font color="darkgreen">Black List 신고하기</font></h2>
      </td>
    </tr>
    
     <tr>
       <td>신고자 이름</td>
        <td>
          <input type="text" name="blackName" size="20"/>
        </td>
     </tr>
     <tr>
       <td>신고 사유</td>
        <td>
         <textarea name="blacklist" rows="10" cols="50"></textarea>
         </td>
     </tr>
   </table> 
  <br>
    <input type="submit" value="신고"/>
    <input type="reset" value="취소" />
</form>

  
</div>
