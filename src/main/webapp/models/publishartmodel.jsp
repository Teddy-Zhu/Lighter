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
			<h4 class="modal-title text-info text-center">Post New Article!</h4>
		</h4>
	</div>
	<div class="modal-body container col-sm-offset-2 col-sm-8" id="publishartarea" name="publishartarea">
		<%
			if (sessions.getAttribute("username") == null) {
		%>
		<h2>你需要先登录！</h2>
		<%
			} else if (Integer.parseInt(sessions.getAttribute("allow")
					.toString()) != 0) {
		%>
		<form class="form-horizontal" role="form" id="publishart"
			name="publishart" onsubmit="return check('publishart')" method="post">
			<div class="form-group">
				<div class="input-group">
					<span class="input-group-addon">文章分类</span> <select
						class="form-control" id="artclassify" name="artclassify" required>
						<c:forEach var="type" items="${classify}">
							<option value="${type.classifyid}">${type.name}</option>
						</c:forEach>
					</select>
				</div>
			</div>
			<div class="form-group">
				<div class="input-group">
					<span class="input-group-addon">Title</span> <input type="text"
						class="form-control" id="arttitle" name="arttitle"
						placeholder="Enter your article title!" required
						onchange="showstatus(this)">
				</div>
			</div>
			<div class="form-group">
				<div class="input-group col-sm-12">
					<textarea class="form-control" rows="6" name="artcontext"
						id="artcontext" placeholder="input your context" required></textarea>
				</div>
			</div>
			<div class="form-group">
				<button type="submit" class="btn btn-info" id="ok">发表</button>
				<button type="reset" class="btn btn-default">Reset</button>
			</div>
		</form>

		<%
			} else {
		%>
		<h2>你暂时没有权限发布文章！</h2>
		<%
			}
		%>
	</div>
	<div class="modal-footer">
		<label class="text-container">Friendly reminder:We protect
			your privacy!</label>
	</div>
</div>