<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<div class="modal-content">
	<div class="modal-header">
		<button type="button" class="close glyphicon glyphicon-remove" data-dismiss="modal"
			aria-hidden="true"></button>
		<h4 class="modal-title text-info">Please Login your account !</h4>
	</div>
	<div class="modal-body container col-sm-offset-3 col-sm-6"
		id="loginarea" name="loginarea">
		<form class="form-horizontal" role="form" id="login" name="login"
			onsubmit="return check('login');" method="post">
			<div class="form-group">
				<div class="input-group">
					<span class="input-group-addon dropdown-toggle"
						data-toggle="dropdown"><span
						class="glyphicon glyphicon-user"></span><span id="showtype">
							Email</span> <span class="caret"></span> </span>
					<ul class="dropdown-menu">
						<c:if test="${regemail==1}">
							<li><a onclick="changetype('Email')"> Email </a></li>
						</c:if>
						<c:if test="${regnick==1}">
							<li><a onclick="changetype('Nick')"> Nick </a></li>
						</c:if>
					</ul>
					<input type="hidden" value="Email" id="logintype" name="logintype">
					<input type="text" class="form-control" id="lusername"
						name="username" placeholder="Enter your Email as Username"
						required onchange="showstatus(this)"
						pattern="^\w+((-\w+)|(\.\w+))*\@[A-Za-z0-9]+((\.|-)[A-Za-z0-9]+)*\.[A-Za-z0-9]+$">
				</div>
			</div>
			<div class="form-group">
				<div class="input-group">
					<span class="input-group-addon">密码</span> <input type="password"
						class="form-control" id="lpassword" name="password"
						placeholder="Password" required onchange="showstatus(this)">
				</div>
			</div>
			<div class="form-group">
				<div class="btn-group input-group" data-toggle="buttons">
					<label class="input-group-addon">Cookies</label> <label
						class="btn btn-primary active"> <input type="radio"
						name="Cookies" class="form-control" value="0" checked="checked">
						No
					</label> <label class="btn btn-primary"> <input type="radio"
						name="Cookies" class="form-control" value="1440"> Day
					</label> <label class="btn btn-primary"> <input type="radio"
						name="Cookies" class="form-control" value="10080"> Week
					</label> <label class="btn btn-primary"> <input type="radio"
						name="Cookies" class="form-control" value="43200"> Month
					</label>
				</div>
			</div>
			<div class="form-group">
				<button type="submit" class="btn btn-info" id="ok">登录</button>
				<button type="reset" class="btn btn-default">重置</button>
			</div>
		</form>
	</div>
	<div class="modal-footer">
		<label class="text-container">Friendly Reminder:We protect
			your privacy!</label>
	</div>