class Circulo: FiguraGeometrica() {
    private var radio: Double = 0.0

    fun establecerRadio(radio:Double){
        this.radio = radio
    }
    fun obtenerRadio(): Double{
        return radio
    }
}
