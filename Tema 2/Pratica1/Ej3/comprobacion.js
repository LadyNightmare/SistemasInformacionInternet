function comprobacion () {

    nombre = document.formulario.nombre.value;
    apellidos = document.formulario.apellidos.value;
    correo = document.formulario.email.value;
    password = document.formulario.pass.value;
    passwordRep = document.formulario.rpass.value;
    warning = "Debes rellenar correctamente los siguientes campos:\n";
    advertencia = false;

    if(nombre === "") {

        advertencia = true;
        warning += "Nombre\n"

    }

    if (apellidos === "") {

        advertencia = true;
        warning += "Apellidos\n"

    }

    var re = /^(([^<>()\[\]\\.,;:\s@"]+(\.[^<>()\[\]\\.,;:\s@"]+)*)|(".+"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/;

    if (!re.test(correo)) {

        advertencia = true;
        warning += "Email\n"

    }

    if(!(password === passwordRep) || passwordRep === "" || password === "") {

        advertencia = true;
        warning += "Contraseña y/o su repetición"

    }


    if (advertencia) {

        alert(warning);
        
        return false;

    }

}