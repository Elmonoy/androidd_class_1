class OtroTipoEmpleado (
    nombre: String,
    salarioBase: Double,
    var otroFactor: Double
): Empleados(nombre, salarioBase){
    override fun calcularSalario(): Double {
        return salarioBase * salarioBase
    }
}