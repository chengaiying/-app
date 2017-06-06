   
    var tmphtml = "<div id=\"big_photo_div1\"><img id=\"big_photo1\" class=\"min\" src=\"\" /></div>";
	function big_function(imgId,width){
		var documentHeight = $(document).height();
		var scrollHeight = $(document).scrollTop(),//获取当前窗口距离页面顶部高度
	    windowHeight = $(window).height(),//获取当前窗口高度
	    allHeight = scrollHeight+windowHeight;//整个页面高度
		var img_src = $("#"+imgId).attr("src");
		$("body").append(tmphtml);
		$("#big_photo1").attr("src",img_src);
		console.log($("#big_photo1").attr("src"));
		$("#big_photo1").css({"width":width + "%"});//设定图片的宽度
		var photoHeight = windowHeight - $("#big_photo1").height();//拿到缩放后的图片高度
		$("#big_photo1").css({"position":"relative","top":photoHeight/2 + scrollHeight + "px","z-index": "103"});//设定图片距离顶部位置
		$("#big_photo_div1").css({
			"width":"100%",
			"height":documentHeight,
			"background": "black",
			"position": "absolute",
			"text-align":"center",
			"top": "0",
			"left": "0",
			"z-index": "102",
			"background-color": "rgba(0,0,0,0.6)"
		})
		$("#big_photo_div1").click(function(e){
			e.preventDefault();
			$("#big_photo_div1").remove();
		});
	}