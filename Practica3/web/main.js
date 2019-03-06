
function validar(){
    var nombre, apellido, email, contraseña, fecha;
    nombre= document.getElementById("nombres").value;
    apellido = document.getElementById("apellidos").value;
    email = document.getElementById("email").value;
    contraseña = document.getElementById("contraseña").value;
    fecha = document.getElementById("fecha").value;


    if(nombre === "" || apellido === "" || email === "" || contraseña === "" || fecha === ""){
        alert("Rellene todos los campos");
        return false;
    }else if(nombre.length>50 | apellido.length>50 | email.length>50 | contraseña.length>50 | fecha.length>50){
        alert("Valores no permitidos");
        return false;
    }
    
}

function bienvenido(){
    alert("Bienvenido ");
    
}