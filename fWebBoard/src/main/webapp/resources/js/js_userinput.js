//유효성 검사

$(function(){
	// 사용자의 자료 입력여부를 검사하는 함수
	$('#confirm').click(function(){
    	if( $.trim($("#userId").val()) == '' ){
            alert("아이디를 입력해 주세요.");
            $("#userId").focus();
            return;
            //trim : 공백제거 (혹시라도 아이디 입력시 사용자가 띄어쓰기를 한 경우) 사용자가 입력한 데이터는 무조건 공백처리 해주는게 좋다!
        }
    	
    	if($.trim($('#userPass').val())==''){
    		alert("비번입력해주세요.");
    		$('#userPass').focus();
    		return;
    	}
    	
    	if($.trim($('#userPass').val()) != $.trim($('#userPass2').val())){
    		alert("비밀번호가 일치하지 않습니다..");
    		$('#userPass2').focus();
    		return;
    	}
    	
    	
    	if($.trim($('#userName').val())==''){
    		alert("이름입력해주세요.");
    		$('#userName').foucs();
    		return;
    	}
       
        // 자료를 전송합니다.
        document.userinput.submit();
	});
	
	//아이디 중복체크
	$('#userId').click(function(){
		
        //ajax 활용
		$.ajax({
			type:'post',
			url:'idCheck.do',
			data: {'userId' : $('#userId').val() },
			async: true, //submit이 진행 되지 않도록 하는 옵션 (비동기통신)
			contentType : 'application/x-www-form-urlencoded;charset=UTF-8', // 인코딩에 문제가 발생할까봐 추가하는 코드
			success : function(resultData){
				alert("resultData" + resultData);
				//$('#idCheckResult').html(resultData);
			}
			
		})
       
	})
})
	
	
	
	
	
	
	
	
	