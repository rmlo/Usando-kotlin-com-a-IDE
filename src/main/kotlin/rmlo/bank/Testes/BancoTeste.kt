package rmlo.bank.Testes

import rmlo.bank.Banco

fun main(){
    val rmlbank = Banco(nome = "rml", numero = 12)

    println(rmlbank.nome)
    println(rmlbank.numero)

    val banco2 = rmlbank.copy(nome = "rml2")

    println(banco2.info())
}