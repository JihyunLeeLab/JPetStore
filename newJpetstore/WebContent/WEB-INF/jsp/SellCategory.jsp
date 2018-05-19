<%@ include file="IncludeTop.jsp"%>
<head>
<style>
img.cateSell{
	height : 300;
	width: 300;
}


</style>
</head>

<table>
  <tr style="vertical-align:top">
    <td style="text-align:left;width:20%;">
      <table id="main-menu">
        <tr>
          <td><a href='<c:url value="/shop/index.do"/>'>
            <b><font color="black" size="2">&lt;&lt; Main Menu</font></b></a></td>
        </tr>
      </table>

<div align = "center">
<!-- 판매하기 눌렀을 경우 판매 방식 결정하는 페이지 -->

<table id="main-menu">
  <tr height ="300">

    <td width = "300" align="center">  
    <a href="<c:url value="/shop/generalForm.do"/>"><img class="cateSell" src="../images/generalSell.jpg" />
    </a></td>

   <td width = "300" align="center">  
    <a href="<c:url value="/shop/auctionForm.do"/>"><img class="cateSell" src="../images/bidSell3.jpg" />
    </a></td>
  </tr>
</table>
</div>

