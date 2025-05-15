import java.util.*

fun main() {
    val reader = Scanner(System.`in`)
    var circulo: Circulo? = null
    var retangulo: Retangulo? = null

    var opcao: Int

    do {
        println(
            """
            +++++++++++++++++++++++++++++++++++++++++
            +                  Menu                 +
            +++++++++++++++++++++++++++++++++++++++++
            |                                       |
            | [1] - Criar objeto Retangulo          |
            | [2] - Criar objeto Círculo            |
            | [3] - Executar os métodos             |
            |       descrever() do objeto Retangulo |
            | [4] - Executar os métodos descrever() |
            |        do objeto Círculo              |
            | [5] - Sair                            |
            |                                       |
            +++++++++++++++++++++++++++++++++++++++++
            """.trimIndent()
        )

        print("Digite a opção desejada: ")
        opcao = readLine()?.toIntOrNull() ?: 0

        when (opcao) {
            1 -> {
                print("Digite a cor: ")
                val cor = readLine()
                print("Digite a altura: ")
                val altura = reader.nextDouble()
                print("Digite a largura: ")
                val largura = reader.nextDouble()
                retangulo = Retangulo(cor, largura, altura)
            }
            2 -> {
                print("Digite a cor: ")
                val cor = readLine()
                print("Digite o raio: ")
                val raio = reader.nextDouble()
                circulo = Circulo(cor, raio)
            }
            3 -> retangulo?.descrever()
            4 -> circulo?.descrever()
            5 -> println("Encerrando o programa.")
            else -> println("Opção inválida. Tente novamente.")
        }

    } while (opcao != 5)
}