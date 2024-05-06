open class FiguraGeometrica {
    private var nombre: String =""
    private var color: String= ""


    fun establecerNombre(nombre: String){
        this.nombre=nombre
    }
    fun obtenerNombre(): String{
        return nombre
    }
    fun establecerColor(color: String){
        this.color=color
    }
    fun obtenerColor(): String{
        return color
    }
}

