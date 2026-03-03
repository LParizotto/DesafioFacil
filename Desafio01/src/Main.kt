//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    println("Digite sua conta: ")
    val conta = readln().replace(" ","")

    if (conta.contains("+")) {
        val soma = conta.split("+")
        println((soma[0].toInt() + soma[1].toInt()))
    }else if (conta.contains("-")) {
        val menos = conta.split("+")
        println((menos[0].toInt() - menos[1].toInt()))
    }else if (conta.contains("*")) {
        val vezes = conta.split("+")
        println((vezes[0].toInt() + vezes[1].toInt()))

    }else if (conta.contains("/")) {
        val divisao = conta.split("+")
        println((divisao[0].toInt() + divisao[1].toInt()))
    }
}
