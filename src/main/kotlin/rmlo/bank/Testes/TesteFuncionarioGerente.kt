package rmlo.bank.Testes

import rmlo.bank.Gerente

fun main() {
    val rafaela = Gerente(
        nome = "Rafaela moreira",
        cpf = "156.545.546-44",
        salario = 5000.0
    )
    ImprimeRelatorioFuncionario.imprime(rafaela)
}
