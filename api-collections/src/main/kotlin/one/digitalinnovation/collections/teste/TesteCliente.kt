package one.digitalinnovation.collections.teste

import one.digitalinnovation.collections.ClientTipo
import one.digitalinnovation.collections.Cliente

fun main() {
    val jose = Cliente(
        nome = "Jose da Silva",
        cpf = "123.123.456-77",
        clientTipo = ClientTipo.PF ,
        senha = "123456"
    )

    println(jose)

    TesteAutenticacao().autentica(jose)
}
