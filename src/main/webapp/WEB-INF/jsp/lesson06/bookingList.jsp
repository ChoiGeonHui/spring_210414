<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
        <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
     <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>  
 
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
		<jsp:include page="bookingHeader.jsp" />
		<jsp:include page="bookingNav.jsp" />

		<section class="d-flex justify-content-center">
			<div>
				<div class="mt-3">
					<h3 class="font-weight-bold text-center">예약 목록 보기</h3>
				</div>
				<table class="table text-center">
					<thead>
						<tr>
							<th>이름</th>
							<th>예약날짜</th>
							<th>숙박일수</th>
							<th>숙박인원</th>
							<th>전화번호</th>
							<th>예약상태</th>
							<th>삭제</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach var="booking" items="${booking}" varStatus="status">
							<tr>
								<td>${booking.name}</td>
								<td><fmt:formatDate value="${booking.date}"
										pattern="yyyy년 MM월 dd일" /></td>
								<td>${booking.day}</td>
								<td>${booking.headcount}</td>
								<td>${booking.phoneNumber}</td>
								<c:choose>
									<c:when test="${booking.state =='확정'}">
										<td class="text-info">${booking.state}</td>
									</c:when>
									<c:when test="${booking.state =='대기중'}">
										<td class="text-success">${booking.state}</td>
									</c:when>
									<c:otherwise>
										<td class="text-danger">${booking.state}</td>
									</c:otherwise>

								</c:choose>
								<td><button class="btn btn-danger" name="delBtn" value="${booking.id }">삭제</button>
								</td>



							</tr>
						</c:forEach>



					</tbody>
				</table>
			</div>
		</section>
		<jsp:include page="bookingFooter.jsp" />

	</div>

	<script>
		$(document).ready(function() {
			
			$('td').on('click','button[name=delBtn]',function(){
				let bookingId = $(this).attr('value');
				
				$.ajax({
					type:'post',
					data:{'id':bookingId},
					url:'/lesson06/deletebooking',
					success:function(data){
						location.href = "/lesson06/bookinglist";
					},
					complete : function(data) {
					    	alert("삭제 완료");
					},
					error:function(e){
						alert("error: "+e);
					}
						

					
					
				});
				
				
			});
			
			
		});
	</script>

</body>
</html>