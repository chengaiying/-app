var tmphtml = "<div id=\"bombBox_big\"><div id=\"bombBox_small\"></div></div>";
function bombBox(){
	var documentHeight = $(document).height();
	var scrollHeight = $(document).scrollTop(),//获取当前窗口距离页面顶部高度
	windowHeight = $(window).height(),//获取当前窗口高度
	allHeight = scrollHeight+windowHeight;//整个页面高度
	$("body").append(tmphtml);
	var photoHeight = windowHeight - $("#bombBox_small").height();
	$("#bombBox_small").css({"position":"relative","top":40 + scrollHeight + "px","z-index": "103"});//设定图片距离顶部位置
	$("#bombBox_big").css({
			"width":"100%",
			"height":documentHeight,
			"background": "black",
			"position": "absolute",
			"top": "0",
			"left": "0",
			"z-index": "102",
			"background-color": "rgba(0,0,0,0.9)"
	})
	$("#bombBox_big").click(function(e){
			e.preventDefault();
			$("#bombBox_big").remove();
	});
	
	
}




