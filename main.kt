import kotlin.math.pow
import kotlin.math.sqrt

fun adicao():Int{
    print("Digite quantos números quer somar: ")
    val n = readln().toInt()
    var soma = 0
    println("Digite $n números:")
    for(i in 1..n){
        soma += readln().toInt()
    }
    return soma
}

fun subtracao(): Int{
    print("Digite quantos números quer subtrair: ")
    val n = readln().toInt()
    println("Digite $n números:")
    var sub = readln().toInt()
    for(num in 1 until n) {
        sub -= readln().toInt()
    }
    return sub
}

fun multiplicacao(): Int {
    print("Digite quantos números quer multiplicar: ")
    val n = readln().toInt()
    println("Digite $n números:")
    var mult = 1
    for(i in 1..n) mult *= readln().toInt()
    return mult
}

fun divisao(): Double {
    print("Digite quantos números quer dividir: ")
    val n = readln().toInt()
    println("Digite $n números:")
    var div = readln().toDouble()
    for(i in 1 until n) div /= readln().toDouble()
    return div
}

fun potenciacao(n1:Double, n2:Double): Double = n1.pow(n2)

fun raiz(n1:Double): Double = sqrt(n1)

fun main() {
    do{
        print("1-Adição\n2-Subtração\n3-Multiplicação\n4-Divisão\n5-Potenciação\n6-Raiz Quadrada\n7-Sair\n-> ")
        val opc = readln().toInt()
        when(opc){
            1 -> {
                val soma = adicao()
                println("O resultado da multiplicação foi $soma")
            }
            2 -> {
                val sub = subtracao()
                println("O resultado da subtração foi $sub")
            }
            3 -> {
                val mult = multiplicacao()
                println("O resultado da multiplicação foi $mult")
            }
            4 -> {
                val div = divisao()
                println("O resultado da divisão foi $div")
            }
            5 -> {
                print("Digite o número 1: ")
                val n1 = readln().toDouble()
                print("Digite o número 2: ")
                val n2 = readln().toDouble()
                val res = potenciacao(n1, n2)
                println("O resultado da potenciação foi $res")
            }
            6 -> {
                print("Digite o número: ")
                val n = readln().toDouble()
                val res = raiz(n)
                println("A raiz quadrada de $n é $res")
            }
            7 -> println("Saindo")
            else -> println("Opcao invalida")
        }
    }while(opc != 7)
}
