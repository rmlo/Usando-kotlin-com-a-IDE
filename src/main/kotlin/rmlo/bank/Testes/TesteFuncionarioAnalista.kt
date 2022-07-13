package rmlo.bank.Testes

import rmlo.bank.Analista

fun main() {
    val pedro = Analista(
        nome = "pedro moreira",
        cpf = "156.545.546-44",
        salario = 2500.0
    )
    ImprimeRelatorioFuncionario.imprime(pedro)
}