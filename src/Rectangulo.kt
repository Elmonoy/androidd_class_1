class Rectangulo:
    FiguraGeometrica(){
    private var longitud: Double = 0.0
    private var ancho: Double=0.0

    fun establecerLongitud(longitud:Double){
        this.longitud = longitud
    }
    fun obtenerLongitud():Double{
        return longitud
    }
    fun establecerAncho(ancho:Double){
        this.ancho = ancho
    }
    fun obtenerAncho(): Double{
        return ancho
    }
}