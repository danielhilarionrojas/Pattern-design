//Apuntadores
const nombre = document.querySelector('.nombre')
const numero = document.querySelector('.nombre')
const direccion = document.querySelector('.nombre')
const btnAgregarTarea = document.querySelector('.btn-agregar-tarea')

const listadoTareas = document.querySelector('.listado-tareas')

//Acceder almacenamiento local
const db = window.localStorage

//Función cuando se haga click en boton aregar
btnAgregarTarea.onclick = () => { 
    let contacto = { //Capturar información en objeto contacto
        id: Math.random(1,100), //generar un número aleatorio para ese objeto entre 1-100
        nombre: nombre.value ,
        numero: numero.value,
        direccion: direccion.value,
    }

    /*Función guardar contacto, recibe el local storage y el objeto contacto, se invoca ya que esta en el archivo funciones*/
    saveContact(db, contacto) 
}

cargarContactos(db, listadoTareas)