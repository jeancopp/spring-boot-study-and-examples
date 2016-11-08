function remover(pessoa) {
	$.ajax({
		url : "test.html",
		context : document.body,
		method : "delete"
	}).done(function() {
		$(this).addClass("done");
	});
}

function atualizar(pessoa) {
	$.ajax({
		url : "test.html",
		context : document.body,
		method : "pút"
	}).done(function() {
		$(this).addClass("done");
	});
}