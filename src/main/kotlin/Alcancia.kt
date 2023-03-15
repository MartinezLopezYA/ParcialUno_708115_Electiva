class Alcancia{

    var veinte = 0
    var cincuenta = 0
    var cien = 0
    var docientos = 0
    var quinietnos = 0

    var v = 0
    var ci = 0
    var c = 0
    var d = 0
    var q = 0
    var ahorro = 0
    var nalcancia = 0

    constructor()
    constructor(veinte: Int, cincuenta: Int, cien: Int, docientos: Int, quinietnos: Int) {
        this.veinte = veinte
        this.cincuenta = cincuenta
        this.cien = cien
        this.docientos = docientos
        this.quinietnos = quinietnos
    }

    fun agregarMoneda(x: Int){
        print("Valor: ")
        var x = readln().toInt()
        if (x == 20){
            this.veinte += x
            this.v += 1
        }else if (x == 50){
            this.cincuenta += x
            this.ci += 1
        }else if (x == 100){
            this.cien += x
            this.c += 1
        }else if (x == 200){
            this.docientos += x
            this.d += 1
        }else if (x == 500){
            this.quinietnos += x
            this.q += 1
        }else{
            println("Valor invalido")
            println()
        }
    }

    fun contarMonedas(){
        println("Hay ${this.v} monedas de veinte pesos")
        println("Hay ${this.ci} monedas de cincuenta pesos")
        println("Hay ${this.c} monedas de cien pesos")
        println("Hay ${this.d} monedas de doscientos pesos")
        println("Hay ${this.q} monedas de quinientos pesos")
        println()
    }

    fun totalAhorrado(){
        this.ahorro = this.veinte + this.cincuenta + this.cien + this.docientos + this.quinietnos
        println("El dinero total ahorrado actualmente es: ${this.ahorro} pesos")
        println()
    }

    fun romperAlcancia(){
        println("Su dinero es: ${this.ahorro} pesos")
        this.veinte = 0
        this.cincuenta = 0
        this.cien = 0
        this.docientos = 0
        this.quinietnos = 0
        println()
    }

    fun nuevaAlcancia(){
        this.nalcancia += this.ahorro
        println("Hay ${this.nalcancia} alcancias actualmente")
        this.veinte = 0
        this.cincuenta = 0
        this.cien = 0
        this.docientos = 0
        this.quinietnos = 0
        this.v = 0
        this.ci = 0
        this.c = 0
        this.d = 0
        this.q = 0

    }


}