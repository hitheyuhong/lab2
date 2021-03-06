<!DOCTYPE html>
<html lang="zh">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1"> 
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>可生成环形文字的纯js插件-A5源码</title>
<style type="text/css">
	html,
	body {
	  height: 100%;
	  margin: 0;
	  overflow: hidden;
	  background: #FFFCEC;
	  font-family: "Microsoft YaHei","宋体","Segoe UI", "Lucida Grande", Helvetica, Arial,sans-serif, FreeSans, Arimo;
	}

	.emblem {
	  position: absolute;
	  left: 0;
	  right: 0;
	  top: 25vh;
	  margin: 0 auto;
	  width: 50vh;
	  height: 50vh;
	  border-radius: 50%;
	  font-weight: bold;
	  color: #003A6F;
	  animation: spinZ 20s linear infinite;
	  text-align: center;
	}
	.emblem span {
	  position: absolute;
	  display: inline-block;
	  left: 0;
	  right: 0;
	  top: 0;
	  bottom: 0;
	  text-transform: uppercase;
	  font-size: 4vh;
	  transition: all 0.5s cubic-bezier(0, 0, 0, 1);
	}
	@keyframes spinZ {
	  0% {
		transform: rotateZ(360deg);
	  }
	  100% {
		transform: rotateZ(0deg);
	  }
	}
</style>

</head>
<body>

<div class="emblem">A5源码*down.admin5.com*</div>

<script type="text/javascript" src="js/emblem.js"></script>
<script type="text/javascript">
	Emblem.init('.emblem');
</script>

<div style="text-align:center;margin:50px 0; font:normal 14px/24px 'MicroSoft YaHei';">
<p>适用浏览器：360、FireFox、Chrome、Opera、傲游、搜狗、世界之窗. 不支持Safari、IE8及以下浏览器。</p>
<p>来源：<a href="http://down.admin5.com/" target="_blank">A5源码</a></p>
</div>
</body>
</html>