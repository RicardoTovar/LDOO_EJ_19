var f= new Date();
fecha = document.getElementById("fecha");
fecha.textContent = f.getDate() + " / " + (f.getMonth()+1) + " / " + f.getFullYear();

var nombre;
var usuario;
nombre= prompt("Ingresa tu nombre (Opcional)");

if(nombre == null | nombre == ""){
	alert("Bienvenido");
}else{
	alert("Bienvenido " + nombre);
	usuario = document.getElementById("usuario");
	usuario.textContent = nombre;
}

