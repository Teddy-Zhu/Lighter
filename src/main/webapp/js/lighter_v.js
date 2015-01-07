function showstatus(obj) {
	var curDiv = $(obj).parent().parent();
	if (obj.value != "" && obj.value != undefined && obj.value != null) {
		curDiv.removeClass();
		curDiv.addClass("form-group has-success");
		return true;
	} else {
		curDiv.removeClass();
		curDiv.addClass("form-group has-error");
		return false;
	}
}

function showrestatus(type) {
	var obj;
	var curDiv;
	var String;
	if (type == 1)
		String = "regemail_suf";
	if (type == 2)
		String = "regnick";
	if (type == 3)
		String = "regemail_pre"
	obj = document.getElementById(String);
	curDiv = $('#' + String).parent().parent();
	if (obj.value != "" && obj.value != undefined && obj.value != null) {
		var tmp;
		var field;
		if (type == 1 || type == 3) {
			field = document.getElementById('regemail_pre').value + "@"
					+ document.getElementById('regemail_suf').value;
		} else if (type == 2) {
			field = document.getElementById('regnick').value;
		}
		$.ajax({
			cache : true,
			type : "POST",
			url : "/Lighter/members/" + field + "/" + type.toString()
					+ "/verifyrepat.do",
			data : $('#register').serialize(),
			dataType : "text",
			async : false,
			error : function(request) {
				document.getElementById('registerarea').innerHTML = "failed";
			},
			success : function(data) {
				tmp = data;
			}
		});
		if (tmp != "true") {
			if (type == 1 || type == 3)
				obj.setCustomValidity('邮箱已被注册！');
			if (type == 2)
				obj.setCustomValidity('昵称已被注册！');
			curDiv.removeClass();
			curDiv.addClass("form-group has-error");
			return false;
		}
		obj.setCustomValidity('');
		curDiv.removeClass();
		curDiv.addClass("form-group has-success");
		return true;
	} else {
		if (type == 1 || type == 3)
			obj.setCustomValidity('请输入一个邮箱！');
		if (type == 2)
			obj.setCustomValidity('请输入一个昵称！');
		curDiv.removeClass();
		curDiv.addClass("form-group has-error");
		return false;
	}
}

function checkPasswords() {
	var pass1 = document.getElementById("regpassword");
	var pass2 = document.getElementById("reregpassword");
	if (pass1.value != pass2.value) {
		pass2.setCustomValidity("两次密码必须输入一致！");
	} else {
		pass2.setCustomValidity('');
	}
}

function check(modal) {
	var url;
	if (modal == 'login') {
		var username = document.getElementById("lusername").value;
		var password = document.getElementById("lpassword").value;
		url = "./members/" + username + "/" + password + "/" + modal + ".do";
	} else if (modal == 'register') {
		url = "./members/register.do";
	} else if (modal == 'publishart') {
		url = "./articles/publishart.do";
	} else if (modal == 'publishno') {
		url = "./articles/publishno.do";
	} else if (modal == 'addlink') {
		url = "./links/addlink.do";
	}
	$.ajax({
		cache : true,
		type : "POST",
		url : url,
		data : $('#' + modal).serialize(),
		dataType : "text",
		async : false,
		error : function(request) {
			document.getElementById(modal + 'area').innerHTML = "failed";
		},
		success : function(data) {
			var div = document.getElementById(modal + 'area');
			div.className = "container modal-body";
			document.getElementById(modal + 'area').innerHTML = data;
		}
	});
	return false;
}
function changetype(username) {
	document.getElementById('logintype').value = username;
	document.getElementById('showtype').innerHTML = " " + username;
	document.getElementById('lusername').placeholder = "Enter your " + username
			+ " as Username";
	if (username == "Email")
		document
				.getElementById('lusername')
				.setAttribute(
						"pattern",
						"^\\w+((-\\w+)|(\\.\\w+))*\\@[A-Za-z0-9]+((\\.|-)[A-Za-z0-9]+)*\\.[A-Za-z0-9]+$");
	else {
		document.getElementById('lusername').removeAttribute("pattern");
	}
}

function sendmodelAjaxRequest(model) {
	$.ajax({
		cache : true,
		type : "GET",
		url : "/Lighter/models/" + model + ".do",
		dataType : "text",
		async : false,
		error : function(request) {
			document.getElementById(model + 'model').innerHTML = "failed";
		},
		success : function(data) {
			document.getElementById(model + 'model').innerHTML = data;
		}
	});
	$('#' + model + 'Modal').modal('show');
}

$(window).scroll(function() {
	if ($(window).scrollTop() >= 98) {
		$(".backtop").fadeIn();
	} else {

		$(".backtop").fadeOut();
	}
});
var i = 0;
$(".searchd").click(function() {
	if (i == 0) {
		$(".searchinput").fadeIn();
		i++;
	} else {
		$(".searchinput").fadeOut();
		i--
	}
});

$(".backtop").click(function(event) {
	$('html,body').animate({
		scrollTop : 0
	}, 500);
	return false;
});

function detailsin(obj) {
	obj.className = "btn btn-info btn-xs glyphicon glyphicon-remove-sign pull-right";
}

function detailsout(obj) {
	obj.className = "btn btn-info btn-xs glyphicon glyphicon-plus-sign pull-right";
}
function popovershow() {
	$(".popovershow").popover({
		selector : "[data-toggle='popover']",
		trigger : 'hover',
		animation : true,
		// placement : 'left',
		title : '',
		content : '',
		delay : 0
	});
}
function tooltipshow() {
	$(".tooltipshow").tooltip({
		selector : "[data-toggle='tooltip']",
	});
}

$(function() {
	$(".popovershow").popover({
		selector : "[data-toggle='popover']",
		trigger : 'hover',
		animation : true,
		// placement : 'left',
		title : '',
		content : '',
		delay : 0
	});
	$(".tooltipshow").tooltip({
		selector : "[data-toggle='tooltip']",
	});
})

function b() {
	t = parseInt(x.css('top'));
	y.css('top', '35px');
	x.animate({
		top : t - 35 + 'px'
	}, 'slow'); // 19为每个li的高度
	if (Math.abs(t) == h - 35) { // 19为每个li的高度
		y.animate({
			top : '0px'
		}, 'slow');
		z = x;
		x = y;
		y = z;
	}
	setTimeout(b, 2000);// 滚动间隔时间 现在是3秒
}
$(document).ready(function() {
	$('.swap').html($('.news_li').html());
	x = $('.news_li');
	y = $('.swap');
	h = $('.news_li li').length * 35; // 19为每个li的高度
	setTimeout(b, 2000);// 滚动间隔时间 现在是3秒

})

function nextposts(page) {
	var del = document.getElementById("refresh");
	del.parentNode.removeChild(del);
	sendpostAjaxRequest(page);
}

function sendpostAjaxRequest(page) {
	$
			.ajax({
				cache : true,
				type : "GET",
				url : "/Lighter/articles/" + page + "/getrecent.do",
				dataType : "text",
				async : false,
				error : function(request) {
					document.getElementById('loginarea').innerHTML = "failed";
				},
				success : function(data) {
					var add = "<li class=\"viewall viewallmore\" id=\"refresh\"><a title=\"View all comments\" id=\"nextposts\" class=\"tip-top btn glyphicon glyphicon-refresh\" onclick=\"nextposts("
							+ (page + 1) + ")\"></a></li>";
					if (data != "none") {
						document.getElementById('postsync').innerHTML = document
								.getElementById('postsync').innerHTML
								+ data + add;
						popovershow();
						tooltipshow();
					}
				}
			});
}

$('.dropdown-menu-ext').click(function(e) {
	e.stopPropagation();
});