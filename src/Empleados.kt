open class Empleados(
    var nombre: String,
    var salarioBase: Double
) {
    open fun calcularSalario(): Double {
        return salarioBase
    }
}