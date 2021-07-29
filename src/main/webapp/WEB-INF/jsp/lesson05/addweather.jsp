<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
     <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>  
    <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>날씨 추가</title>
	   <script src="https://code.jquery.com/jquery-3.6.0.min.js" integrity="sha256-/xUj+3OJU5yExlq6GSYGSHk7tPXikynS7ogEvDej/m4=" crossorigin="anonymous"></script>  


	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
	
	<link rel="stylesheet" type="text/css" href="/css/weather.css">
	

<link rel="stylesheet" href="https://code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>

</head>
<body>
	<div class="container">
		<jsp:include page="wheader.jsp" />
		<nav></nav>
		<section class="d-flex">
			<jsp:include page="warticle.jsp" />
			
			<section class="w-100">
			<div>
			<h3 class="m-3 font-weight-bold">날씨입력</h3>
			</div>
			
			<div class="w-100 mt-3">
			<form method="post" action="/lesson05/insertweather" >

						<div class="d-flex mt-3">
							날짜<input type="text" class="form-control col-3 ml-2 mr-2"
								name="date" id="date"> 
								날씨<select id="weather" name="weather" class="col-3 mr-2 ml-2">
								<option value="맑음">맑음</option>
								<option value="구름조금">구름조금</option>
								<option value="흐림">흐림</option>
								<option value="비">비</option>
							</select> 
							미세먼지<select id="microDust" name="microDust" class="col-3 mr-2 mt-2">
								<option value="좋음">좋음</option>
								<option value="보통">보통</option>
								<option value="나쁨">나쁨</option>
								<option value="최악">최악</option>
							</select>

						</div>

						<div class="d-flex mt-3">
							<div class="input-group col-4text-center">
								기온<input class="form-control col-10" name="temperatures">
								<div class="input-group-append">
									<span class="input-group-text">℃</span>
								</div>
							</div>
							
							<div class="input-group col-4  text-center">
							강수량<input class="form-control col-10"name="precipitation"> 
								<div class="input-group-append">
									<span class="input-group-text">mm</span>
								</div>
							</div>
							<div class="input-group col-4 text-center">
								풍속<input class="form-control col-10" name="windSpeed">
								<div class="input-group-append">
									<span class="input-group-text">km/h</span>
								</div>
							</div>
							
							
						</div>

						<div class="float-right mt-3">
							<button class="btn btn-success">저장</button>
						</div>
					</form>
			</div>

			</section>
		</section>
		<jsp:include page="wfooter.jsp" />


	</div>

	<script>
	$(document).ready(function() {
        // 모든 데이터피커에 적용
        $.datepicker.setDefaults({
        	changeMonth: true,
        	changeYear : true,
            dayNamesMin: ['일', '월', '화', '수', '목', '금', '토'] // 요일을 한글로 변경
            , dateFormat: 'yy-mm-dd'
        });
        $('#date').datepicker(); 
    });
          
	</script>
</body>
</html>