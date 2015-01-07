<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<c:forEach var="type" items="${lists}" varStatus="loop">
	<li>
		<div class="user-thumb">
			<img width="40" height="40" alt="User" src="${type.member.icon}">
		</div>
		<div class="article-post popovershow">
			<span class="user-info"> 作者: ${type.member.nick} ,发布时间: <fmt:formatDate
					value="${type.pubdate}" pattern="yyyy-MM-dd HH:mm:ss" /> ,用户热度:
				${type.member.hot}
			</span>
			<div class="pull-right">
				<span class="btn btn-primary btn-xs glyphicon glyphicon-pencil"></span>
				<span class="btn btn-danger btn-xs glyphicon glyphicon-trash"></span>
			</div>
			<h5>
				<span title="文章详细"
					class="btn btn-info btn-xs glyphicon glyphicon-plus-sign pull-right"
					data-toggle="popover" data-placement="auto left"
					data-content="${fn:substring(type.textarea, 0, 60)}" id="details"
					onmouseover="detailsin(this)" onmouseout="detailsout(this)"></span>
			</h5>
			<p>
			<h3>
				<a href="#" class="label label-info">[${type.classifystatus.name}]</a>
				<a href="#" class="text-info">${type.title}</a>
			</h3>
			</p>
		</div>
	</li>
</c:forEach>