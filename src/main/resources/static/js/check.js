// ajax动态改变表格数据
$.fn.grid = function(options) {
	var $tbody = $(this).find("tbody");
	var colums = options.colums;
	// var url = options.url;
	var content = [];
	//ajax获取数据源后存入content数据中。
        $.ajax({
		 type: "get",
		url: "/user.json",
		//data: {name:"aa"},
		dataType: "json",
		//async: true,
		success: function(data) {


			 console.log(55)
		    content = data;
		},
		error:function() {
		console.log(99);
		
		},
	});
	for(var c = 0; c < content.length; c++) {
		//遍历所有列
		var cols = [];
		$.each(colums, function(key, value) {
			//遍历json数据
			$.each(content[c], function(key2, value2) {
				if(key2 == value.Index) {
					cols.push(value2);
				}
			});
		});
		var html="<tr>";
			$.each(cols,function(k,v){
				html += "<td>"+v+"</td>"
			});
		html += "</tr>";
		$tbody.append(html)
	}
}