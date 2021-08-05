<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>실시간 예약하기</title>
	<script src="https://code.jquery.com/jquery-3.6.0.min.js" integrity="sha256-/xUj+3OJU5yExlq6GSYGSHk7tPXikynS7ogEvDej/m4=" crossorigin="anonymous"></script>      
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
        <!-- datepicker 라이브러리 -->
        <link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
        <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
       
	
	<link rel="stylesheet" type="text/css" href="/css/booking.css">


</head>
<body>
<div class="container">
<jsp:include page="bookingHeader.jsp"/>
<jsp:include page="bookingNav.jsp"/>

<section class="d-flex justify-content-center">
<div class="col-6">
<div class="mt-3"><h3 class="font-weight-bold text-center">예약 하기</h3></div>
<div>
<b>이름</b>
<input type="text" name="name" class="form-control mb-2">
<b>예약날짜</b>
<input type="text" name="name" class="form-control mb-2">
<b>숙박일수</b>
<input type="text" name="name" class="form-control mb-2">
<b>숙박인원</b>
<input type="text" name="name" class="form-control mb-2">
<b>전화번호</b>
<input type="text" name="name" class="form-control mb-2">
</div> 
<button type="button" class="btn col-12 btn-warning">예약하기</button>
</div>
</section>
<jsp:include page="bookingFooter.jsp"/>

</div>

</body>
</html>