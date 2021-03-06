<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1"> 
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>jQuery文字长阴影效果插件longShadow - A5源码</title>

<link rel="stylesheet" type="text/css" href="css/styles.css">

</head>
<body>
<div class="container">
	<section>
		<ul class="longshadow">
			<li>
				<figure><span id="one">S</span></figure>
			</li>
			<li>
				<figure><span id="two">H</span></figure>
			</li>
			<li>
				<figure><span id="three">A</span></figure>
			</li>
			<li>
				<figure><span id="four">D</span></figure>
			</li>
			<li>
				<figure><span id="five">O</span></figure>
			</li>
			<li>
				<figure><span id="six">W</span></figure>
			</li>																			
		</ul>
	</section>
</div>

<script src="js/jquery-1.11.0.min.js" type="text/javascript"></script>
<script src="js/jquery.longShadow.js"></script>
<script>
	$(function() {
		$('#one').longShadow({
			colorShadow: '#a13c32',
			sizeShadow: 70
		});

		$('#two').longShadow({
			colorShadow: '#af7a4b',
			sizeShadow: 70,
			directionShadow: 'bottom-left'
		});

		$('#three').longShadow({
			colorShadow: '#828f46',
			sizeShadow: 20,
			directionShadow: 'top'
		});

		$('#four').longShadow({
			colorShadow: '#3b6767',
			sizeShadow: 20,
			directionShadow: 'bottom'
		});

		$('#five').longShadow({
			colorShadow: '#3e9277',
			sizeShadow: 70,
			directionShadow: 'top-right'
		});

		$('#six').longShadow({
			colorShadow: '#525283',
			sizeShadow: 70,
			directionShadow: 'top-left'
		});																
	});
</script>

<div style="text-align:center;margin:50px 0; font:normal 14px/24px 'MicroSoft YaHei';">
<p>适用浏览器：360、FireFox、Chrome、Safari、Opera、傲游、搜狗、世界之窗. 不支持IE8及以下浏览器。</p>
<p>来源：<a href="http://down.admin5.com/" target="_blank">A5源码</a></p>
</div>
</body>
</html>