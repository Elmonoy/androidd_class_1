

fun main (){

    val estudiante = Estudiante()
    val empleado = Empleado()
    val rectangulo = Rectangulo()
    val circulo = Circulo()


    estudiante.establecerNombre("Yair")
    estudiante.establecerEdad(25)
    estudiante.establecerGrado("Tecnologo en Analisis y Desarrollo del Software")
    estudiante.realizarTarea()
    println(estudiante.toString())

    empleado.establecerNombre("Alejandro")
    empleado.establecerEdad(30)
    empleado.establecerPuesto("programador")
    empleado.realizarTarea()
    println(empleado.toString())


    rectangulo.establecerNombre("Rectangulo")
    rectangulo.establecerColor("verde")
    rectangulo.establecerLongitud(10.0)
    rectangulo.establecerAncho(5.0)



    circulo.establecerNombre("Circulo")
    circulo.establecerColor("azul")
    circulo.establecerRadio(5.0)


    println("Rectangulo - Nombre: ${rectangulo.obtenerNombre()}, Color: ${rectangulo.obtenerColor()},Longitud: ${rectangulo.obtenerLongitud()}, Ancho: ${rectangulo.obtenerAncho()}")
    println("Circulo - Nombre: ${circulo.obtenerNombre()}, Color: ${circulo.obtenerColor()},Longitud: ${circulo.obtenerRadio()}")


    //Salario de empleados
    val gerente = Gerente ("Yair", 650000.0, 100000.0)
    val vendedor = Venderdor("Alex", 1300000.0, 0.2, 50000.0)
    val otroEmpleado = OtroTipoEmpleado("Valeria", 1600000.0, 0.1)


    println("Salario del Gerente: ${gerente.calcularSalario()}")
    println("Salario del Vendedor: ${vendedor.calcularSalario()}")
    println("Salario de otro tipo empleado:${otroEmpleado.calcularSalario()}")
}