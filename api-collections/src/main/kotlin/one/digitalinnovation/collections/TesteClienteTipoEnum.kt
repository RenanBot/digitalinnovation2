package one.digitalinnovation.collections

fun main(){
    ClientTipo.values().forEach { elemento ->
        println("${elemento.name} - ${elemento.descricao}")

    }
    ClientTipo.values().forEach {
        println("${it.name} - ${it.descricao}")
    }

    val pf = ClientTipo.PF
    println("${pf.name} - ${pf.descricao}")

    val pj = ClientTipo.PJ
    println("${pj.name} - ${pj.descricao}")
}