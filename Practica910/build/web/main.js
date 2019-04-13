
function validar(){
    var nombre, apellido, email, contra, fecha, usua, tipo;
    nombre= document.getElementById("nombres").value;
    apellido = document.getElementById("apellidos").value;
    email = document.getElementById("email").value;
    contra = document.getElementById("contraseña").value;
    fecha = document.getElementById("fecha").value;
    usua = document.getElementById("username").value;
    tipo = document.getElementById("tipousuario").value;
    

    
    if(nombre === "" || apellido === "" || email === "" || contra === "" || fecha === "" || usua === "" || tipo === ""){
        alert("Rellene todos los campos necesarios");
        return false;
    }
    if(nombre.length>50 || apellido.length>50 || email.length>50 || contra.length>50 || fecha.length>50 || usua.length>50){
        alert("Valores no permitidos");
        return false;
    }
        return true;
    
}

function error(){
    var contraseña, usuario;
    contraseña= document.getElementById("contrasena").value;
    usuario = document.getElementById("username").value;
    if( contraseña === "" || usuario === ""){
        alert("Rellene todos los campos");
        return false;
    }
        if(contraseña.length>50 || usuario.length>50){
        alert("Valores no permitidos");
        return false;
    }
        return true;
    
}
