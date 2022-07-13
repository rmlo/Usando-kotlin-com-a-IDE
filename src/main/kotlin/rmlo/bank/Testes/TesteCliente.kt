package rmlo.bank.Testes

import rmlo.bank.Cliente
import rmlo.bank.ClienteTipo

fun main() {
     val rafa = Cliente(
          nome = "rafaela Silva",
          cpf = "123.234.542-22",
          clienteTipo = ClienteTipo.PF,
          senha = "123456"
     )

     println(rafa)
     TesteAutenticacao().autentica(rafa)
}