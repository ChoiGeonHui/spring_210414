<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
     <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>  
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>결과페이지</title>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
	<script src="https://code.jquery.com/jquery-3.6.0.min.js" integrity="sha256-/xUj+3OJU5yExlq6GSYGSHk7tPXikynS7ogEvDej/m4=" crossorigin="anonymous"></script>      
	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
	

</head>
<body>
<div class="container">
<h1>즐겨찾기 목록</h1>

		<table class="table">
			<thead>
				<tr>
					<th class="col-2">No.</th>
					<th class="col-3">이름</th>
					<th class="col-6">주소</th>
					<th class="col-2">삭제</th>
				</tr>
			</thead>
			<tbody>
			<c:forEach var="web" items="${web }" varStatus="status">
					<tr>
						<td class="col-2">${status.count}</td>
						<td class="col-3">${web.name }</td>
						<td class="col-6">${web.url }</td>
						<!-- 1번째 방법 : name속성과 value속성을 이용해서 동적으로 삭제버튼 감지 -->
						<td class="col-2"><button type="button" name="delBtn" value="${web.url}" class="btn btn-danger">삭제</button></td>
						<!-- 2번째 방법 : data를 이용해서 태그에 data를 임시 저장해놓기 -->
						<!-- <td class="col-2"><button type="button" class="favor-btn btn btn-danger" data-favorite-id>삭제</button></td> -->
					</tr>
			</c:forEach>
			</tbody>

		</table>


	</div>
	
	
	<script type="text/javascript">
	$(document).ready(function(){
		
		
			 $('td').on('click','button[name=delBtn]', function() {
				let url = $(this).attr('value');

				 $.ajax({
					type:"post",
					data:{"url":url},
					url:"/lesson06/delete",
				 	success:function(data){
						location.href = "/lesson06/selectweb";
					},
					complete : function(data) {
				    	alert("삭제 완료");
				    },
					error:function(e){
						alert("error: "+e);
					} 
					
				}); 

			}); 
			
			/* $('.favor-btn').on('click',function(){
				let faovrId =  $(this).data('favorite-id');
				alert(faovrId);
			}) */
			
			

		});
	</script>
	
	
	
	

</body>
</html>