<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>즐겨찾기 추가하기</title>

<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.6.0.min.js"
	integrity="sha256-/xUj+3OJU5yExlq6GSYGSHk7tPXikynS7ogEvDej/m4="
	crossorigin="anonymous"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"
	integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
	crossorigin="anonymous"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"
	integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
	crossorigin="anonymous"></script>


</head>
<body>

	<div class="container">
		<header>
			<h1>즐겨찾기 추가하기</h1>
		</header>
		<section>

			제목 <input type="text" id="name" name="name" class="form-control mb-2">
			주소
			<div class="d-flex">
				<input type="text" id="url" name="url"
					class="form-control col-10 mb-2">
				<button type="button" id="chkBtn" class="btn btn-info col-2">중복확인</button>
			</div>

			<small id="duplicationText" class="text-danger d-none">중복된	url입니다</small> 
				<small id="addText" class="text-success d-none">사용가능한 url입니다</small>

			<div id="statusArea" class="mt-3"></div>


			<button id="addBtn" type="button" class="btn btn-success btn-block">추가</button>

		</section>
	</div>

	<script type="text/javascript">
		$(document).ready(function() {
			
			
			$('#chkBtn').on('click',function(e){
				$('#statusArea').empty();
				
				let url = $('#url').val().trim();
				if(url==''){
					alert("검사할 주소를 입력해 주세요.");
					return;
				}
				
				
				
				$.ajax({
				type:"get",
				data:{"url":url},
				url:"/lesson06/chk",
				success:function(data){
					if(data.chk===true){
						$('#duplicationText').removeClass('d-none');
						$('#addText').addClass('d-none');	
						}else{
							$('#duplicationText').addClass('d-none');
							$('#addText').removeClass('d-none');
						}
					},
				error:function(e){
					alert("error: "+e);
				}
					
				});
				
			});
			
			
			
			
			
			$('#addBtn').on('click',function(e){
				
				let name = $('input[name=name]').val().trim();
				if(name==''){
					alert(" 제목을 입력해 주세요.");
					return;
				}
				
				let url = $('input[name=url]').val().trim();
				if(url==''){
					alert("주소를 입력해 주세요.");
					return;
				}
				if(url.substr(0,4)!='http'&&url.substr(0,5)!='https'){
					alert("올바른 주소를 입력해 주세요.");
					return;
				}
				
				
				
				$.ajax({
			 		type:"POST",
					url:"/lesson06/addweb",
					data:{"name":name,"url":url},
					//ajax 통신 후 response로는 String 또는 json으로 리턴되어야한다.
					complete : function(data) {
			        	alert("완료");
			        },
				 	success:function(data){
						location.href = "/lesson06/selectweb";
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