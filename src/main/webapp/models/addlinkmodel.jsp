<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	HttpSession sessions = request.getSession();
%>
<div class="modal-content">
	<div class="modal-header">
		<button type="button" class="close glyphicon glyphicon-remove" data-dismiss="modal"
			aria-hidden="true"></button>
		<h4 class="modal-title">
			<h4 class="modal-title text-info text-center">Add New Link!</h4>
		</h4>
	</div>
	<div class="modal-body container col-sm-offset-2 col-sm-8" id="addlinkarea" name="addlinkarea">
		<%
			if (sessions.getAttribute("username") == null) {
		%>
		<h2>你需要先登录！</h2>
		<%
			} else if (Integer.parseInt(sessions.getAttribute("allow")
					.toString()) != 0) {
		%>
		<form class="form-horizontal" role="form" id="addlink" name="addlink"
			onsubmit="return check('addlink')" method="post">
			<div class="form-group">
				<div class="input-group">
					<span class="input-group-addon">生效</span> <select
						class="form-control" id="linkenable" name="linkenable" required>
						<option value="1">显示在主页</option>
						<option value="0">不显示在主页</option>
					</select>
				</div>
			</div>
			<div class="form-group">
				<div class="input-group">
					<span class="input-group-addon">Link等级</span> <select
						class="form-control" id="linklevel" name="linklevel" required>
						<option value="info">info</option>
						<option value="danger">danger</option>
					</select>
				</div>
			</div>
			<div class="form-group">
				<div class="input-group">
					<span class="input-group-addon">Link名称</span> <input type="text"
						class="form-control" id="linkname" name="linkname"
						placeholder="Enter your linkname!" required
						onchange="showstatus(this)">
				</div>
			</div>
			<div class="form-group">
				<div class="input-group">
					<span class="input-group-addon">Link链接</span> <input type="text"
						class="form-control" id="linker" name="linker"
						placeholder="Enter your linker!" required pattern="\b(http|https)(.*?)"
						onchange="showstatus(this)">
				</div>
			</div>
			<div class="form-group">
				<div class="input-group col-sm-12">
					<textarea class="form-control" rows="3" name="linkdetail"
						id="linkdetail" placeholder="input your linkdetail，not required"></textarea>
				</div>
			</div>
			<div class="form-group">
				<button type="submit" class="btn btn-info" id="ok">添加</button>
				<button type="reset" class="btn btn-default">Reset</button>
			</div>
		</form>

		<%
			} else {
		%>
		<h2>你暂时没有权限添加友情链接！</h2>
		<%
			}
		%>
	</div>
	<div class="modal-footer">
		<label class="text-container">Friendly reminder:We protect
			your privacy!</label>
	</div>
</div>