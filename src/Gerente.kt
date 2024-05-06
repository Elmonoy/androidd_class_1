class Gerente(
    nombre: String,
    salarioBase: Double,
    var bono: Double


) : Empleados (nombre, salarioBase){
    override fun calcularSalario():Double{
        return  salarioBase + bono
    }
}
