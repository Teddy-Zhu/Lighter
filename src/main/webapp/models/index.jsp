<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ include file="/models/header.jsp"%>
<body>
	<div class="container container-fluid">
		<div class="widget-box box">
			<div class="widget-title tooltipshow t_news">
				<span class="icon"><span class="glyphicon glyphicon-bullhorn"></span><i
					class="icon-file"></i></span>
				<h5>
					<ul class="news_li">
						<c:forEach var="type" items="${publicinfo}">
							<li class="text-info">[时间:<fmt:formatDate
									value="${type.pubtime}" pattern="yyyy-MM-dd" />][发布者:${type.member.nick}][内容:${type.context}]
							</li>
						</c:forEach>
					</ul>
					<ul class="swap"></ul>
				</h5>
				<span class="btn label label-info" data-toggle="tooltip"
					data-placement="left" data-title="最近有${publicnum}个公告"
					onclick="javascript:sendmodelAjaxRequest('publishno');">${publicnum}</span>
			</div>
		</div>
		<div class="row">
			<div class="col-md-8">
				<div class="widget-box">
					<div class="widget-title popovershow">
						<span class="icon"><a href="javascript:void(0)"
							class="glyphicon glyphicon-comment"
							onclick="javascript:sendmodelAjaxRequest('publishart');"></a><i
							class="icon-file"></i></span>
						<h5>最近发表</h5>
						<span title="文章数" class="label label-info" data-toggle="popover"
							data-placement="left" data-content="总计${totle}个">${totle}</span>
					</div>
					<div class="widget-content nopadding">
						<ul class="recent-posts">
							<div class="postsync" id="postsync">
								<c:forEach var="type" items="${lists}" varStatus="loop">
									<li>
										<div class="user-thumb">
											<img width="40" height="40" alt="User"
												src="${type.member.icon}">
										</div>
										<div class="article-post popovershow">
											<span class="user-info"> 作者: ${type.member.nick} ,
												发布时间: <fmt:formatDate value="${type.pubdate}"
													pattern="yyyy-MM-dd HH:mm:ss" /> , 用户热度:
												${type.member.hot}
											</span>
											<div class="pull-right">
												<span
													class="btn btn-primary btn-xs glyphicon glyphicon-pencil"></span>
												<span
													class="btn btn-danger btn-xs glyphicon glyphicon-trash"></span>
											</div>
											<h5>
												<span title="文章详细"
													class="btn btn-info btn-xs glyphicon glyphicon-plus-sign pull-right"
													data-toggle="popover" data-placement="auto left"
													data-content="${fn:substring(type.textarea, 0, 60)}"
													id="details" onmouseover="detailsin(this)"
													onmouseout="detailsout(this)"></span>
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
							</div>

							<li class="viewall viewallmore" id="refresh"><a
								title="View all comments" id="nextposts"
								class="tip-top btn glyphicon glyphicon-refresh"
								onclick="nextposts(2)"></a></li>
						</ul>
					</div>
				</div>
			</div>
			<div class="col-md-4">
				<div class="widget-box">
					<div class="widget-title popovershow">
						<span class="icon"><span
							class="glyphicon glyphicon-th-list"></span><i
							class="icon-comment"></i></span>
						<h5>Recent Comments</h5>
						<span title="total comments" class="label label-info"
							data-toggle="popover" data-placement="left" data-content="总计88个">88</span>
					</div>
					<div class="widget-content nopadding">
						<ul class="recent-comments">
							<li>
								<div class="user-thumb">
									<img width="40" height="40" alt="User" src="img/demo/av1.jpg">
								</div>
								<div class="comments">
									<span class="user-info"> User: michelle on IP:
										172.10.56.3 </span>
									<p>
										<a href="#">Vivamus sed auctor nibh congue, ligula vitae
											tempus pharetra...</a>
									</p>
									<a href="#" class="btn btn-primary">Edit</a> <a
										href="#" class="btn btn-success">Approve</a> <a
										href="#" class="btn btn-warning">Mark as spam</a>
								</div>
							</li>
							<li>
								<div class="user-thumb">
									<img width="40" height="40" alt="User" src="img/demo/av3.jpg">
								</div>
								<div class="comments">
									<span class="user-info"> User: john on IP: 192.168.24.3
									</span>
									<p>
										<a href="#">Vivamus sed auctor nibh congue, ligula vitae
											tempus pharetra...</a>
									</p>
									<a href="#" class="btn btn-primary btn-mini">Edit</a> <a
										href="#" class="btn btn-success btn-mini">Approve</a> <a
										href="#" class="btn btn-warning btn-mini">Mark as spam</a>
								</div>
							</li>
							<li>
								<div class="user-thumb">
									<img width="40" height="40" alt="User" src="img/demo/av2.jpg">
								</div>
								<div class="comments">
									<span class="user-info"> User: neytiri on IP:
										186.56.45.7 </span>
									<p>
										<a href="#">Vivamus sed auctor nibh congue, ligula vitae
											tempus pharetra...</a>
									</p>
									<a href="#" class="btn btn-primary btn-mini">Edit</a> <a
										href="#" class="btn btn-success btn-mini">Approve</a> <a
										href="#" class="btn btn-warning btn-mini">Mark as spam</a>
								</div>
							</li>
							<li class="viewall"><a title="View all comments"
								class="tip-top" href="#" onclick=""> + View all + </a></li>
						</ul>
					</div>
				</div>
			</div>
		</div>
		<%@ include file="/models/premodel.jsp"%>
		<div class="widget-box">
			<div class="widget-title popovershow">
				<span class="icon"> <a href="javascript:void(0)"
					class="glyphicon glyphicon-send"
					onclick="javascript:sendmodelAjaxRequest('addlink');"></a><i
					class="icon-file"></i></span>
				<h5>友情链接</h5>
				<span class="label label-info" data-toggle="popover"
					data-placement="left" title="友情链接" data-content="共计${linknum}个">${linknum}</span>
			</div>
			<div class="widget-content">
				<div class="comments">
					<ul class="linker text-left">
						<c:forEach var="type" items="${links}">
							<a class="label label-${type.level}" href="${type.linker}">${type.linkname}</a>
						</c:forEach>
					</ul>
				</div>
			</div>
		</div>
		<br> <br> <br>
	</div>
	<%@ include file="/models/footer.jsp"%>