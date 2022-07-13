package rmlo.bank

class Pessoa {
    var nome : String = "rml"
    var cpf : String = "164.005.807-44"
    private set
}

fun main(){
    val rml = Pessoa()

    println(rml.nome)
    println(rml.cpf)

}