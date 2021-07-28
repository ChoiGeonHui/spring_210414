<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
     <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>  
    <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>기상청</title>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
	<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
	
	<link rel="stylesheet" type="text/css" href="/css/weather.css">
	
</head>
<body>

	<div class="container">
		<jsp:include page="wheader.jsp" />
		<nav></nav>
		<section class="d-flex">

			<jsp:include page="warticle.jsp"/>
			<section class="col-10">
				<h3>과거 날씨</h3>

				<table class="table text-center">
					<thead>
						<tr>
							<td>날짜</td>
							<td>날씨</td>
							<td>기온</td>
							<td>강수량</td>
							<td>미세먼지</td>
							<td>풍속</td>
						</tr>
					</thead>
					<tbody>
						<c:forEach var="w" items="${weather}" varStatus="status">
							<tr>
								<td><fmt:formatDate value="${w.date}" pattern="yyyy년 M월 d일" /></td>
								<td><c:choose>
										<c:when test="${w.weather eq '맑음'}">
											<img alt="사진" src="/images/sunny.jpg">
										</c:when>
										<c:when test="${w.weather eq '구름조금'}">
											<img alt="사진" src="/images/partlyCloudy.jpg">
										</c:when>
										<c:when test="${w.weather eq '흐림'}">
											<img alt="사진" src="/images/cloudy.jpg">
										</c:when>
										<c:otherwise>
											<img alt="사진" src="/images/rainy.jpg">
										</c:otherwise>
									</c:choose></td>
								<td>${w.temperatures}℃</td>
								<td>${w.precipitation}mm</td>
								<td>${w.microDust}</td>
								<td>${w.windSpeed}km/h</td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</section>


		</section>
		<jsp:include page="wfooter.jsp" />
	</div>


</body>
</html>