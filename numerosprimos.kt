fun ehPrimo(numero: Int): Boolean {
    if (numero < 2) return false

    for (i in 2 until numero) {
        if (numero % i == 0) {
            return false
        }
    }

    return true
}

fun main() {
    print("Digite quantos números primos deseja imprimir: ")
    val n = readLine()!!.toInt()

    var contador = 0
    var numero = 2

    while (contador < n) {
        if (ehPrimo(numero)) {
            print("$numero ")
            contador++
        }

        numero++
    }
}