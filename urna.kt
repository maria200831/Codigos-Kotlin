```kotlin
fun main() {

    print("Digite a quantidade de votos que a urna deve receber: ")
    val totalVotos = readLine()!!.toInt()

    var votos1 = 0
    var votos2 = 0
    var votos3 = 0

    var votosRecebidos = 0

    println("\n=== URNA ELETRÔNICA ===")
    println("Candidatos:")
    println("1 - Candidato A")
    println("2 - Candidato B")
    println("3 - Candidato C")
    println("Digite 'fim' para encerrar a votação.")

    while (votosRecebidos < totalVotos) {

        print("\nDigite o voto: ")
        val voto = readLine()!!.lowercase()

        if (voto == "fim") {
            break
        }

        when (voto) {
            "1" -> {
                votos1++
                votosRecebidos++
                println("Voto registrado!")
            }

            "2" -> {
                votos2++
                votosRecebidos++
                println("Voto registrado!")
            }

            "3" -> {
                votos3++
                votosRecebidos++
                println("Voto registrado!")
            }

            else -> {
                println("Voto inválido! Digite 1, 2, 3 ou 'fim'.")
            }
        }
    }

    // Calculando as porcentagens
    val porcentagem1 = if (votosRecebidos > 0) votos1 * 100.0 / votosRecebidos else 0.0
    val porcentagem2 = if (votosRecebidos > 0) votos2 * 100.0 / votosRecebidos else 0.0
    val porcentagem3 = if (votosRecebidos > 0) votos3 * 100.0 / votosRecebidos else 0.0

    // Descobrindo o vencedor
    val vencedor = when {
        votos1 > votos2 && votos1 > votos3 -> "Candidato A"
        votos2 > votos1 && votos2 > votos3 -> "Candidato B"
        votos3 > votos1 && votos3 > votos2 -> "Candidato C"
        else -> "Empate"
    }

    println("\n========== RELATÓRIO ==========")
    println("Total de votos: $votosRecebidos")

    println("\nCandidato A:")
    println("Quantidade: $votos1")
    println("Porcentagem: %.2f%%".format(porcentagem1))

    println("\nCandidato B:")
    println("Quantidade: $votos2")
    println("Porcentagem: %.2f%%".format(porcentagem2))

    println("\nCandidato C:")
    println("Quantidade: $votos3")
    println("Porcentagem: %.2f%%".format(porcentagem3))

    println("\nVereador eleito: $vencedor")
}
```
