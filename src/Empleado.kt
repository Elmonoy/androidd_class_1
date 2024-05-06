class Empleado:Persona(),Trabajador {
    var puesto:String=""

    fun establecerPuesto(puesto:String){
        this.puesto=puesto

    }
    fun obtenerPuesto():String{
        return puesto
    }
    override fun realizarTarea(){
        println("Realizando tarea laboral")

    }
    override fun toString():String{
        return super.toString()+ ", Puesto:$puesto"
    }
}
