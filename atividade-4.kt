fun main() {
    println("Digite a sua idade:")
    val input = readLine()
    val F = input?.toIntOrNull()


  when (F){
    10 -> println("10")
    7,8,9 -> println("BOM")
    5,6 -> println("MEDIO")
    0,1,2,3,4 -> println("RUIM")
    null -> println("Entrada inválida.")
    else -> println("Valor fora do intervalo.")
 }
}
