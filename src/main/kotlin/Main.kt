fun main(args: Array<String>) {


    val al = Alcancia()
    var salir = false

    while (!salir){
        var x = 0
        println("1. Ingresar Moneda")
        println("2. Ver cuantas monedas hay de cada denominación")
        println("3. Ver el dinero ahorrado")
        println("4. Romper Alcancía")
        println("5. Nueva Alcancía")
        print("Elija una opción: ")
        var opc = readln().toInt()
        when(opc){
            1 -> println(al.agregarMoneda(x))
            2 -> println(al.contarMonedas())
            3 -> println(al.totalAhorrado())
            4 -> println(al.romperAlcancia())
            5 -> println(al.nuevaAlcancia())
            else -> salir = true
        }
    }



}