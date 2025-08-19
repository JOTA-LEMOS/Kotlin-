fun main() {
    println("Digite o número de alunos:")
    val input = readLine()
    val F = input?.toIntOrNull()
    var G = 0.0

    if (F != null && F > 0) {
        for (i in 1..F) {
            println("Digite a nota do aluno $i:")
            val H = readLine()?.toDoubleOrNull()
            if (H != null && H >= 0) {
                G += H
            } else {
                println("Nota inválida! Será considerada como 0.")
            }
        }
        val media = G / F
        println("A media da turma e: %.2f".format(media))
    } else {
        println("Quantidade de alunos inválida.")
    }
}

/*https://www.programiz.com/kotlin-programming/online-compiler/ */
