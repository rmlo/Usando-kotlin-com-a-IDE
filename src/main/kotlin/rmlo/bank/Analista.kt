package rmlo.bank

class Analista(
    nome: String,
    cpf: String,
    salario: Double)
    : Funcionario(nome, cpf, salario) {
    override fun calculoAuxilio() = salario * 0.1

}