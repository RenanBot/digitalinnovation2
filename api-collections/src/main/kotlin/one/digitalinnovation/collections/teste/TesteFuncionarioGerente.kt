package one.digitalinnovation.collections.teste

import one.digitalinnovation.collections.Funcionario
import one.digitalinnovation.collections.Gerente


fun main(){
    val Maria = Gerente("Maria", "123456789", (5000.0))

    imprimeRelatorioFuncionario.imprime(Maria)
}