// herencia
class Estudiante : Persona(),Trabajador {
    var grado: String = ""

    fun establecerGrado(grado: String) {
        this.grado = grado
    }

    fun obtenerGrado(): String {
        return grado


    }

    override fun realizarTarea(){
        println("Realizando tarea escolar")

    }

    override fun toString(): String {
        return super.toString() + ", Grado:  $grado"
    }
}