package com.santiagobulla.myapplication

class BancoCore() {

    var jose:Cliente = Cliente(111,"jose",100000f)

    /*fun movimientos() {
        var rta: Boolean = true

        while (rta) {
            println("Las opciones del cajero son:")
            println("1. Consignar")
            println("2. Retirar")
            println("3. Ver saldo")
            println("4. Salir")
            println("Seleccione 1, 2, 3, o 4 según corresponda")

            when (readln().toInt()) {
                1 -> consignar()
                2 -> retirar()
                3 -> consultarSaldo()
                4 -> rta = false
                else -> println("Opción incorrecta, intente de nuevo")
            }
        }
    }*/

    /*fun consignar() {
        println("Indique el id del usuario con el que quiere hacer la consignación:")
        val cod: Int = readln().toInt()
        var clienteEncontrado: Cliente? = null

        for (cliente in listaCliente) {
            if (cod == cliente.idCliente) {
                clienteEncontrado = cliente
                break
            }
        }

        if (clienteEncontrado != null) {
            println("Ingrese el valor a consignar:")
            val valorConsignacion: Float = readln().toFloat()
            clienteEncontrado.consignar(valorConsignacion)
        } else {
            println("El cliente con id $cod no existe")
        }
    }

    fun retirar() {
        println("Indique el id del usuario con el que quiere hacer el retiro de dinero:")
        val cod: Int = readln().toInt()
        var clienteEncontrado: Cliente? = null

        for (cliente in listaCliente) {
            if (cod == cliente.idCliente) {
                clienteEncontrado = cliente
                break
            }
        }

        if (clienteEncontrado != null) {
            println("Ingrese el valor a retirar:")
            val valorRetiro: Float = readln().toFloat()

            if (valorRetiro <= clienteEncontrado.saldoCuenta) {
                clienteEncontrado.retirar(valorRetiro)
            } else {
                println("No es posible el retiro")
            }
        } else {
            println("El cliente con id $cod no existe")
        }
    }

    fun consultarSaldo() {
        println("Indique el id del usuario con el que desea consultar el saldo:")
        val cod: Int = readln().toInt()
        var clienteEncontrado: Cliente? = null

        for (cliente in listaCliente) {
            if (cod == cliente.idCliente) {
                clienteEncontrado = cliente
                break
            }
        }

        if (clienteEncontrado != null) {
            clienteEncontrado.imprimir()
        } else {
            println("El cliente con id $cod no existe")
        }
    }


    fun estadoCuenta() {
        var total: Float = 0f
        listaCliente.forEach { cliente -> total += cliente.saldoCuenta }
        println("El saldo total en el banco es: $total")
        listaCliente.forEach { cliente -> println("El saldo del cliente ${cliente.idCliente} es: ${cliente.saldoCuenta}") }
    }*/

    fun consignar() {
        println("Ingrese el valor a consignar:")
        val valorConsignacion: Float = readln().toFloat()
        jose.consignar(valorConsignacion)
    }

    fun retirar() {
        println("Ingrese el valor a retirar:")
        val valorRetiro: Float = readln().toFloat()

        if (valorRetiro <= jose.saldoCuenta) {
            jose.retirar(valorRetiro)
        } else {
            println("No es posible el retiro")
        }
    }

    fun consultarSaldo() {
        jose.imprimir()
    }

    fun estadoCuenta() {
        println("El saldo total en el banco es: ${jose.saldoCuenta}")
        println("El saldo del cliente ${jose.idCliente} es: ${jose.saldoCuenta}")
    }
}