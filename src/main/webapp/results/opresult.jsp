<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div class="container col-sm-6">
	<div class="panel panel-${result.level}">
		<div class="panel-heading">
			<h3 class="panel-title">
				<strong>${result.title}</strong>
			</h3>
		</div>
		<ul class="list-group">
			<c:forEach var="instring" items="${result.resultString}">
				<li class="list-group-item">${instring}</li>
			</c:forEach>
		</ul>
		<div class="panel-body">
			<blockquote class="text-left">
				<strong>您可以选择:</strong>
			</blockquote>
			<div class="container col-sm-offset-3 col-sm-6">
				<button type="button" class="btn btn-primary btn-"
					onclick="javascript:self.location=document.referrer;">返回上一页</button>
				<button type="button" class="btn btn-primary"
					onclick="javascript:top.location='/Lighter';">返回主页</button>
			</div>
		</div>
	</div>
</div>