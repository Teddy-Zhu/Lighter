<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<div class="modal-content">
	<div class="modal-header">
		<button type="button" class="close glyphicon glyphicon-remove" data-dismiss="modal"
			aria-hidden="true"></button>
		<h4 class="modal-title">
			<h4 class="modal-title text-info">Please Register Your Account
				Firstly!</h4>
		</h4>
	</div>
	<div class="modal-body container col-sm-offset-2 col-sm-8" id="registerarea" name="registerarea">
		<form class="form-horizontal" role="form" id="register"
			name="register" onsubmit="return check('register')" method="post">
			<div class="form-group">
				<div class="input-group">
					<span class="input-group-addon">UserType</span> <select
						class="form-control" id="regtypeid" name="regtypeid" required required>
						<c:forEach var="type" items="${list}">
							<option value="${type.typeid}">${type.typename}</option>
						</c:forEach>
					</select>
				</div>
			</div>
			<div class="form-group">
				<div class="input-group">
					<span class="input-group-addon">Nick</span> <input type="text"
						class="form-control" id="regnick" name="regnick"
						placeholder="Enter your nick" required onchange="showrestatus(2)">
				</div>
			</div>
			<div class="form-group">
				<div class="input-group">
					<span class="input-group-addon">Password</span> <input
						type="password" class="form-control" id="regpassword"
						name="regpassword" placeholder="Password" required
						onchange="showstatus(this)">
				</div>
			</div>
			<div class="form-group">
				<div class="input-group">
					<span class="input-group-addon">RePassword</span> <input
						type="password" class="form-control" id="reregpassword"
						name="reregpassword" placeholder="Password Again" required
						onchange="showstatus(this);checkPasswords();">
				</div>
			</div>


			<div class="form-group">
				<div class="input-group">
					<span class="input-group-addon">Phone</span> <input type="text"
						class="form-control" id="regphone" name="regphone"
						placeholder="Phone number" required pattern="1[3,4,5,7,8]{1}\d{9}"
						onchange="showstatus(this)">
				</div>
			</div>

			<div class="form-group">
				<div class="input-group">
					<span class="input-group-addon">Email</span> <input type="text"
						class="form-control" id="regemail_pre" name="regemail_pre"
						placeholder="Email account" required
						pattern="^\w+((-\w+)|(\.\w+))*\" onchange="showrestatus(3)">
					<span class="input-group-addon">@</span> <input type="text"
						class="form-control" id="regemail_suf" name="regemail_suf"
						placeholder="Domain" required
						pattern="[A-Za-z0-9]+((\.|-)[A-Za-z0-9]+)*\.[A-Za-z0-9]+$"
						onchange="showrestatus(1)" title="邮箱正确格式：xxx@xxx.xxx">
				</div>
			</div>
			<div class="form-group">
				<div class="input-group">
					<span class="input-group-addon">Sex</span> <select
						class="form-control" id="sex" name="sex" required>
						<option value="0">boy</option>
						<option value="1">girl</option>
					</select>
				</div>
			</div>
			<div class="form-group">
				<div class="input-group col-sm-12">
					<textarea class="form-control" rows="3" name="regselfinfo"
						id="regselfinfo"
						placeholder="input your personal introduction,if necessary.Not required"></textarea>
				</div>
			</div>
			<div class="form-group">
				<button type="submit" class="btn btn-info" id="ok">Submit</button>
				<button type="reset" class="btn btn-default">Reset</button>
			</div>
		</form>
	</div>
	<div class="modal-footer">
		<label class="text-container">Friendly reminder:We protect
			your privacy!</label>
	</div>
</div>