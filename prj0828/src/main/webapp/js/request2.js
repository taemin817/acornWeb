	function hi(){
	alert("yo man");
		
	let userNameTag = document.getElementById("userName");
	
	let userName = userNameTag.value;
	alert(userName);
	
	window.location.href="/prj0828/hi?name=" + userName;
	}