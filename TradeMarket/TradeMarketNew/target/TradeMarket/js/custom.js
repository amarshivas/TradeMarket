function getTopNews() {
	$.ajax({
		type : "GET",
		url : "/TradeMarket/getTopNews",
		success : function(data) {
			$("#home").html(data);
			$("#home").addClass('active in');
			if ($("#latestNews").hasClass('active')) {
				$("#latestNews").removeClass('active');
				$("#latestNews").removeClass('in');
			}
			if ($("#experts").hasClass('active')) {
				$("#experts").removeClass('active');
				$("#experts").removeClass('in');
			}
			if ($("#read").hasClass('active')) {
				$("#read").removeClass('active');
				$("#read").removeClass('in');

			}
		}
	});
}

function getLatestNews() {

	$.ajax({
		type : "GET",
		url : "/TradeMarket/getLatestNews",
		success : function(data) {
			$("#latestNews").html(data);
			$("#latestNews").addClass('active in');
			if ($("#home").hasClass('active')) {
				$("#home").removeClass('active');
				$("#home").removeClass('in');
			}
			if ($("#experts").hasClass('active')) {
				$("#experts").removeClass('active');
				$("#experts").removeClass('in');
			}
			if ($("#read").hasClass('active')) {
				$("#read").removeClass('active');
				$("#read").removeClass('in');

			}

		}
	});
}

function getMostRead() {
	alert("getMostRead in fun");
	$.ajax({
		type : "GET",
		url : "/TradeMarket/getMostRead",
		success : function(data) {
			alert("data------>" + data);
			$("#read").html(data);
			$("#read").addClass('active in');
			if ($("#latestNews").hasClass('active')) {
				$("#latestNews").removeClass('active');
				$("#latestNews").removeClass('in');
			}
			if ($("#experts").hasClass('active')) {
				$("#experts").removeClass('active');
				$("#experts").removeClass('in');
			}
			if ($("#home").hasClass('active')) {
				$("#home").removeClass('active');
				$("#home").removeClass('in');

			}
		}
	});
}


function getSectors() {
	$.ajax({
		type : "GET",
		url : "/TradeMarket/getSectors",
		success : function(data) {
			$("#myTabContent1").children('div').html(data);
			
			$("#sector-tab").parent().addClass('active');
			if ($("#graph-tab").parent().hasClass('active')) {
				$("#graph-tab").parent().removeClass('active');
			}
			if ($("#gainers-Losers-tab").parent().hasClass('active')) {
				$("#gainers-Losers-tab").parent().removeClass('active');

			}
			if ($("#world-tab").parent().hasClass('active')) {
				$("#world-tab").parent().removeClass('active');

			}

		}
	});

}

function getGainerLosers() {
	$.ajax({
		type : "GET",
		url : "/TradeMarket/getGainerLosers",
		success : function(data) {
			$("#myTabContent1").children('div').html(data);
			$("#gainers-Losers-tab").parent().addClass('active');
			
			if ($("#graph-tab").parent().hasClass('active')) {
				$("#graph-tab").parent().removeClass('active');
			}
			if ($("#sector-tab").parent().hasClass('active')) {
				$("#sector-tab").parent().removeClass('active');

			}
			if ($("#world-tab").parent().hasClass('active')) {
				$("#world-tab").parent().removeClass('active');

			}

		}
	});

}

function getWorldData() {
	$.ajax({
		type : "GET",
		url : "/TradeMarket/getWorldData",
		success : function(data) {
			$("#myTabContent1").children('div').html(data);
			$("#world-tab").parent().addClass('active');
			
			if ($("#graph-tab").parent().hasClass('active')) {
				$("#graph-tab").parent().removeClass('active');
			}
			if ($("#sector-tab").parent().hasClass('active')) {
				$("#sector-tab").parent().removeClass('active');

			}
			if ($("#gainers-Losers-tab").parent().hasClass('active')) {
				$("#gainers-Losers-tab").parent().removeClass('active');

			}

		}
	});

}

function getThreeTabsData() {
	$.ajax({
		type : "GET",
		url : "/TradeMarket/getthreetabsdata",
		success : function(data) {
			$("#myTabContent2").html(data);
		}
	});

}

function getViewsRecomendations() {
	$.ajax({
		type : "GET",
		url : "/TradeMarket/getviewsrecomendations",
		success : function(data) {
			$("#style-2").html(data);
		}
	});

}

function getMarketProfiters() {
	$.ajax({
		type : "GET",
		url : "/TradeMarket/getMarketProfiters",
		success : function(data) {
			$(".w3_agile_profit_assets").html(data);
			
			var glide = $('.w3_slider').glide().data('api_glide');
           
           	$(window).on('keyup', function (key) {
           	if (key.keyCode === 13) {
           	glide.jump(3, console.log('Wooo!'));
           	};
           	});
		}
	});
	}
	
	function getNewsFlash() {
	$.ajax({
		type : "GET",
		url : "/TradeMarket/getNewsFlash",
		success : function(data) {
			$(".agileits_news_flash").html(data);
			$(".demo2").bootstrapNews({
            		newsPerPage: 3,
            		autoplay: true,
            		pauseOnHover: true,
            		navigation: false,
            		direction: 'up',
            		newsTickerInterval: 2500,
            		onToDo: function () {
            			//console.log(this);
            		}
            	});
			}
	});
	
}
function getVolumeToppers() {

	$.ajax({
		type : "GET",
		//contentType : "application/json",
		url : "/TradeMarket/getVolumeToppers",
		//dataType : 'json',
		success : function(result) {
			if (result.status == "Done") {
				alert("success");
			} else {
				alert("fail");
			}
			console.log(result);
		},
		error : function(e) {
			alert("Error!")
			console.log("ERROR: ", e);
		}
	});
}

function getSponsoredLinks() {
	$.ajax({
		type : "GET",
		url : "/TradeMarket/getsponsoredlinks",
		success : function(data) {
			$(".w3layouts_sponsored_links").html(data);
		}
	});
}

function getStockTickerData() {
alert("test1");
	$.ajax({
		type : "GET",
		url : "/TradeMarket/getStockTickerData",
		success : function(data) {
			alert("test2");
			$(".agile_panel_stock").html(data);
			alert("test3");
			$(".demo1").bootstrapNews({
         		newsPerPage: 1,
         		autoplay: true,
         		pauseOnHover:true,
         		direction: 'up',
         		newsTickerInterval: 3000,
         		onToDo: function () {
         			//console.log(this);
         		}
         	});
		}
	});
}