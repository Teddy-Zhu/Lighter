<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	HttpSession sessions = request.getSession();
%>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title>My blog Design by Troevil Powered by bootstrap</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="css/bootstrap.min.css" rel="stylesheet" media="screen">
<link href="css/lighter_v.css" rel="stylesheet" media="screen">
<!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
      <script src="https://oss.maxcdn.com/libs/respond.js/1.3.0/respond.min.js"></script>
      <![endif]-->
<script src="js/jquery-2.1.1.min.js"></script>
<script src="js/bootstrap.min.js"></script>
<script src="js/jquery.form.js"></script>
</head>
<a class="backtop" href="javascript:void" style="display: inline;"></a>
<div class="header">
	<h1 class="text-center text-info text-capitalize">
		<strong>lighter blog website by troevil</strong>
	</h1>
</div>
<div class="container container-fluid">
	<nav class="nav navbar navbar-default" role="navigation">
		<div class="container-fluid">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle collapsed"
					data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
					<span class="sr-only">Toggle navigation</span> <span
						class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="#"> <span
					class="glyphicon glyphicon-home"></span> Lighter
				</a>
			</div>
			<div class="collapse navbar-collapse"
				id="bs-example-navbar-collapse-1">
				<ul class="nav navbar-nav">
					<li><a href="/"> Home </a></li>
					<li class="dropdown"><a href="#" class="dropdown-toggle"
						data-toggle="dropdown"> Language <b class="caret"></b>
					</a>
						<ul class="dropdown-menu">
							<li class="dropdown-header text-right">编译型</li>
							<li><a href="#"> C/C++ </a></li>
							<li><a href="#"> Java </a></li>
							<li><a href="#"> Swift </a></li>
							<li class="dropdown-header text-right">解释性</li>
							<li><a href="#"> Python </a></li>
							<li><a href="#"> Ruby </a></li>
						</ul></li>
					<li class="dropdown"><a href="#" class="dropdown-toggle"
						data-toggle="dropdown"> Web <b class="caret"></b>
					</a>
						<ul class="dropdown-menu">
							<li><a href="#"> Html5 </a></li>
							<li><a href="#"> JS </a></li>
						</ul></li>
					<li class="dropdown"><a href="#" class="dropdown-toggle"
						data-toggle="dropdown"> Common <b class="caret"></b>
					</a>
						<ul class="dropdown-menu">
							<li><a href="#"> Games </a></li>
							<li><a href="#"> Article </a></li>
						</ul></li>
					<li><a href="#"> Contact </a></li>
					<li><a href="#"> About </a></li>
				</ul>
				<ul class="nav navbar-nav navbar-right">
					<li class="searchinput">
						<form class="navbar-search search-form">
							<input type="text" class="form-control search-query">
						</form>
					</li>
					<li><a href="javascript:void" class="btn searchd">Search</a></li>
					<%
						if (sessions.getAttribute("username") == null) {
					%>
					<li><a class="btn glyphicon glyphicon-plus"
						onclick="javascript:sendmodelAjaxRequest('login');">Login</a></li>
					<li><a class="btn glyphicon glyphicon-arrow-right"
						onclick="javascript:sendmodelAjaxRequest('register');">Register</a></li>
					<%
						} else {
					%>
					<li><a class="glyphicon glyphicon-cog active"
						href="Settings.do">设置 </a></li>
					<li><a class="glyphicon glyphicon-user active"><%=sessions.getAttribute("nick")%></a>
					</li>
					<li><a class="glyphicon glyphicon-log-out active"
						href="members/logout.do">退出</a></li>

					<%
						}
					%>
				</ul>
			</div>
		</div>
	</nav>
</div>