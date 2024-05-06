class Venderdor (
    nombre: String,
    salarioBase:Double,
    var comision:Double,
    var ventas: Double
): Empleados(nombre, salarioBase){
    override fun calcularSalario(): Double {
        return salarioBase+ (comision * ventas)
    }
}
