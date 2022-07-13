package rmlo.bank.Testes

import rmlo.bank.Funcionario
import rmlo.bank.Pessoa
import java.math.BigDecimal

fun main() {
    val rml = Pessoa(nome = "rmlo moreira", cpf = "652.005.521-55")
    println(rml.nome)
    println(rml.cpf)

    val pedro = Funcionario(
        nome = "pedro moreira",
        cpf = "156.545.546-44",
        BigDecimal.valueOf(2500)
    )
    println(pedro.nome)
    println(pedro.cpf)
    println(pedro.salario)

}