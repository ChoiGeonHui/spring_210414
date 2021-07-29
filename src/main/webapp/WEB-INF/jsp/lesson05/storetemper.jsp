<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
     <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>  
   
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>배탈의 민족</title>

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
				<h1 class="display-3 text-secondary">우리 동네 가게</h1>
			</div>
			<div>
			
			<form method="post" action="/lesson05/selectreview">
			
			<c:forEach var="store" items="${store}" varStatus="status">
				<button class="btn col-12 btn-outline-info mb-3" type="submit" name="storeId" value="${status.count }">
					<div class="text-left text-dark">
						<b class="font-weight-bold">${store.name}</b><br>
						<span>전화번호 : ${store.phoneNumber}</span><br> 
						<span>주소: ${store.address }</span>
					</div>
				</button>
				<input name="name" value="${store.name}" hidden="true">
			</c:forEach>

			</form>

			</div>

		</section>
		<hr>
		<jsp:include page="storefooter.jsp" />
	</div>

</body>
</html>