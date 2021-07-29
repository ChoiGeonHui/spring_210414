<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
         <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
     <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>  
   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>검색</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
	integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
	crossorigin="anonymous"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"
	integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
	crossorigin="anonymous"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"
	integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
	crossorigin="anonymous"></script>

<link rel="stylesheet" type="text/css" href="/css/store.css">


</head>
<body>
	<div class="container">
		<jsp:include page="storeheader.jsp" />
		<nav></nav>
		<section>
			<div>
				<h1 class="display-3 text-secondary">${name} - 리뷰</h1>
			</div>
			
			<c:forEach var="review" items="${review }">
			<div class="border border-info col-12 mb-3">
			<b>${review.userName } </b><span>${review.point }</span><br>
			<span class="review">
			<fmt:formatDate value="${review.updatedAt }" pattern="yyyy년 M월 d일"/>
			</span><br><br>
			<b>${review.review }</b><br>
			<span class="bg-light">${review.menu }</span><br>	
			</div>
			</c:forEach>
			
			
			
			
		</section>


		<jsp:include page="storefooter.jsp" />


	</div>

</body>
</html>