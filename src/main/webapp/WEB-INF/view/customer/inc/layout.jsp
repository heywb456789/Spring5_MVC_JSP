<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>
<!DOCTYPE html>
<html>

<head>
<title>코딩 전문가를 만들기 위한 온라인 강의 시스템</title>
<meta charset="UTF-8">
<title><tiles:getAsString name="title"></tiles:getAsString></title>

<link href="/css/customer/layout.css" type="text/css" rel="stylesheet" />
<style>
#visual .content-container {
	height: inherit;
	display: flex;
	align-items: center;
	background: url("../../images/customer/visual.png") no-repeat center;
}
</style>
</head>

<body>
	<tiles:insertAttribute name="header"></tiles:insertAttribute>
	<div id="body">
		<div class="content-container clearfix">
		<tiles:insertAttribute name="aside"></tiles:insertAttribute>
		<tiles:insertAttribute name="body"></tiles:insertAttribute>
		</div>
	</div>
	<tiles:insertAttribute name="footer"></tiles:insertAttribute>
</body>

</html>