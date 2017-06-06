// JavaScript Document
//图片压缩，支持手机。,quality 压缩质量0.1-1。
//需在头部定义 
//<style>
//	canvas{width: 100%;border: 1px solid #000000;}
//</style>

function compress(img,quality) {
	// 用于压缩图片的canvas
	var canvas = document.createElement("canvas");
	var ctx = canvas.getContext('2d');
	// 瓦片canvas
	var tCanvas = document.createElement("canvas");
	var tctx = tCanvas.getContext("2d");
	var maxsize = 500 * 1024;
	
	var initSize = img.src.length;
	var width = img.width;
	var height = img.height;

	//如果图片大于四百万像素，计算压缩比并将大小压至400万以下
	var ratio;
	if ((ratio = width * height / 4000000)>1) {
		ratio = Math.sqrt(ratio);
		width /= ratio;
		height /= ratio;
	}else {
		ratio = 1;
	}

	canvas.width = width;
	canvas.height = height;

//        铺底色
	ctx.fillStyle = "#fff";
	ctx.fillRect(0, 0, canvas.width, canvas.height);

	//如果图片像素大于100万则使用瓦片绘制
	var count;
	if ((count = width * height / 1000000) > 1) {
		count = ~~(Math.sqrt(count)+1); //计算要分成多少块瓦片

//            计算每块瓦片的宽和高
		var nw = ~~(width / count);
		var nh = ~~(height / count);

		tCanvas.width = nw;
		tCanvas.height = nh;

		for (var i = 0; i < count; i++) {
			for (var j = 0; j < count; j++) {
				tctx.drawImage(img, i * nw * ratio, j * nh * ratio, nw * ratio, nh * ratio, 0, 0, nw, nh);

				ctx.drawImage(tCanvas, i * nw, j * nh, nw, nh);
			}
		}
	} else {
		ctx.drawImage(img, 0, 0, width, height);
	}

	//进行最小压缩
	var ndata = canvas.toDataURL("image/jpeg", quality);

	console.log("压缩前：" + initSize);
	console.log("压缩后：" + ndata.length);
	console.log("压缩率：" + ~~(100 * (initSize - ndata.length) / initSize) + "%");

	tCanvas.width = tCanvas.height = canvas.width = canvas.height = 0;

	return ndata;
}