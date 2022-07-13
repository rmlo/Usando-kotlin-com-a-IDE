package rmlo.bank.Testes

import rmlo.bank.ClienteTipo

fun main(){
    ClienteTipo.values().forEach { elemento ->
        println("${elemento.name} - ${elemento.descricao}")

    }
}