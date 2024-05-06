//
interface Trabajador{
    fun realizarTarea()
}
open class Persona {
    private var nombre: String = ""
    private var edad: Int=0

    fun establecerNombre(nombre:String){
        this.nombre = nombre
    }
    fun obtenerNombre():String{
        return nombre

    }
    fun establecerEdad(edad: Int){
        this.edad = edad

    }
    fun obtenerEdad(): Int {

        return edad
    }
    //herencia
    override fun toString(): String {
        return "Nombre: $nombre, Edad: $edad"
    }
}


