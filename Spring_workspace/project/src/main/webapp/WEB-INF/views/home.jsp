<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<html>
<head>

<title>Home</title>

<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.4/jquery.min.js"></script>
<link rel="stylesheet"
	href="https://fonts.googleapis.com/icon?family=Material+Icons">
<link rel="stylesheet" href="resources/css/ColorPickerTool.css">
<link rel="stylesheet" href="resources/css/css.css">
</head>
<body>

	<div id="wrap">
		<div id="header_w">
			<div id="header">
				<div id="logo">
					<h1>
						<span style="color: #EDCECE">C</span><span style="color:#EDDDCE">o</span><span
							style="color: #EDEDCE">l</span><span style="color: #DDEDCE">o</span><span
							style="color: #CEEDCE">r</span> <span style="color: #CEEDDD">B</span><span
							style="color: #CEEDED">o</span><span style="color: #CEDDED">u</span><span
							style="color: #CECEED">n</span><span style="color: #DDCEED">d</span>
					</h1>
				</div>
				<div id="r_btn">
					<i class="material-icons">menu</i>
				</div>
			</div>
		</div>
		<div id="content_w">
			<div id="container">
				<div id="palette" class="block">
					<div id="color-palette"></div>
					<div id="color-info"></div>
				</div>
				<div id="picker" class="block">
					<div class="ui-color-picker" data-topic="picker" data-mode="HSL"></div>
					<div id="picker-samples" sample-id="master"></div>
					<div id="controls">
						<div id="delete">
							<div id="trash-can"></div>
						</div>
						<div id="void-sample" class="icon"></div>
					</div>
				</div>
				<div id="Thema_pick_colors_w">
					<div id="Thema_pick_colors_l">
						<h2>
							PICK COLOR</br>FROM THEMA
						</h2>
						<i class="material-icons">arrow_right</i>
					</div>
					<div id="Thema_pick_colors" sample-id="master"></div>
				</div>

				<div id="Thema_colors"></div>
				<div id="canvas" data-tutorial="drop">
					<div id="zindex" class="ui-input-slider" data-topic="z-index"
						data-info="z-index" data-max="20" data-sensivity="10"></div>
				</div>
			</div>
		</div>
	</div>
	<div id="r_menu_w">
		<ul id="Thema">
			<li class="dbs_h"><h3>TEST Thema</h3></li>
			<li id="test_db" class="dbs active"><h4>Test</h4></li>
			<li id="gogh_db" class="dbs"><h4>Gogh</h4></li>
			<li class="dbs_h"><h3>ANOTHER Thema</h3></li>
			<li class="dbs"><h4>Just</h4></li>
			<li class="dbs"><h4>For</h4></li>
			<li class="dbs"><h4>Wah-ggu</h4></li>
		</ul>
	</div>
	</div>








	<script src="resources/js/wordcounter.js"></script>
	<script src="resources/js/ColorPickerTool.js"></script>
	<script type="text/javascript">
		$("#r_btn>i").click(function() {
			$("#r_menu_w").toggleClass("active");
		});

		$("#test_db").click(function() {
			$("#gogh_db").removeClass("active");
			$("#test_db").addClass("active");
		});
		$("#gogh_db").click(function() {
			$("#test_db").removeClass("active");
			$("#gogh_db").addClass("active");
		});
		function colorAjax() {
			var Colors = {};
			var urls = "";
			for (var i = 0; i < arguments.length; i++) {
				eval("Colors.color" + i + "=arguments[" + i + "]");
			}
			switch (arguments.length) {
			case 1:
				urls = "get0.do";
				break;

			case 2:
				urls = "get1.do";
				break;

			case 3:
				urls = "get2.do";
				break;

			case 4:
				urls = "get3.do";
				break;

			case 5:
				urls = "get4.do";
				break;

			case 6:
				urls = "get5.do";
				break;

			case 7:
				urls = "get6.do";
				break;

			case 8:
				urls = "get7.do";
				break;

			case 9:
				urls = "get8.do";
				break;

			case 10:
				urls = "get9.do";
				break;

			}

			var a;
			$.ajax({
				method : "POST",
				url : urls,
				data : JSON.stringify(Colors),
				async : false,
				type : "json",
				contentType : "application/json",
				success : function(data, status, xhr) {
					a = data;
					return a
				},
				error : function(jqXHR, textStatus, errorThrown) {
					console.log(jqXHR.responseText);
					console.log("Ajax false")
				}
			});
			return a
		}

		var a = colorAjax("test");

		$('body')
				.append(
						'<textarea class="input" id="source" style="visibility:hidden"></textarea>');
		$('body')
				.append(
						'<textarea class="output" id="result" style="visibility:hidden"></textarea>');
		$('body')
				.append(
						'<textarea id="pick_db_thema" style="visibility:hidden">test</textarea>');
		for (i = 0; i < a.list.length; i++) {
			$("#source").append(a.list[i].colors);
		}

		var $source = $('#source');
		var $result = $('#result');
		var $thema = $('#pick_db_thema');

		var wordcounter = new WordCounter();

		$("#test_db").click(function() {
			$thema.empty();
			$thema.append("test");
			console.log($thema.val());
		});
		$("#gogh_db").click(function() {
			$thema.empty();
			$thema.append("gogh");
			console.log($thema.val());
		});

		wordcounter.count($source.val(), function(result, logs) {
			$result.val(logs);
			console.log(logs.split('\n')[30].split('>')[1].split(' ')[1].split(':')[0]);
			console.log(logs);
		});
	</script>

</body>
</html>
