package one.digitalinnovation.collections.teste

import one.digitalinnovation.collections.Funcionario

class imprimeRelatorioFuncionario {
    companion object{
        fun imprime(Funcionario: Funcionario) {
            println(
                Funcionario.toString()
            )
        }
    }
}