$(function() {// 初始化内容
	$("#register_btn").click(function() {
		var username = $("#r_username").val();
		var password = $("#r_password").val();
		username = username.replace(/\s+/g, "");
		password = password.replace(/\s+/g, "");
		if (username != "" && password != "") {
			$.ajax({
				url : "register",
				type : "GET",
				data : {
					username : username,
					password : password
				},
				success : function(data) {
					$('#register').modal('hide');
				}
			});
		}
	});
	$("#login").click(function() {
		$.ajax({
			url : "login",
			sync : "false",
			success : function(data) {
				console.log(data);
				window.location.href = data+".html";
			}
		});
	});
});