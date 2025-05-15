import java.util.* //Importa classes do pacote java.util (especificamente Scanner)

fun main(){
    // Inicializando as variáveis
    val reader = Scanner(System.`in`)
    // Iniciando as variáveis como nulas
    var carro: Carro? = null
    var moto: Moto? = null
    do{
        println("""
        ++++++++++++++++++++++++++++++++++++++
        +        Controle de VEÍCULOS        +
        ++++++++++++++++++++++++++++++++++++++
        |                                    |
        | [1] - Criar objeto Carro           |
        | [2] - Exibir informações do carro  |
        | [3] - Frear o carro                |
        | [4] - Acelerar carro               |
        | [5] - Abrir porta malas do carro   |
        | [6] - Criar objeto Moto            |
        | [7] - Exibir informações da moto   |
        | [8] - Acelerar moto                |
        | [9] - Empinar moto                 |
        | [10] - Sair                        |
        |                                    |
        ++++++++++++++++++++++++++++++++++++++
        """.trimIndent())
        println("Digite a opção desejada")
        val opcao = readLine()?.toInt()
        when (opcao) {
            1->{
                println("Digite o modelo ddo carro:")
                val modelo = readLine()
                println("Digite a marca do carro:")
                val marca = readLine()
                println("Digite o ano do carro:")
                val ano = reader.nextInt()
                println("Digite o numero de portas do carro:")
                val numeroPortas  = reader.nextInt()
                carro = Carro(modelo, marca, ano, numeroPortas)

            }
            2-> carro?.exibirInformacoes()
            3-> {
                println("Quanto deseja frear?")
                val frear = reader.nextInt()
                carro?.frear(frear)
            }
            4-> {
                println("Quantos km/h acelerar?")
                val acelerar = reader.nextInt()
                carro?.acelerar(acelerar)
            }
            5->carro?.abrirPortas()
            6->{
                println("Digite o modelo da moto:")
                val modeloM = readLine()
                println("Digite a marca da moto:")
                val marcaM = readLine()
                println("Digite o ano da moto:")
                val anoM = reader.nextInt()
                println("Digite o numero de cílindradas da moto:")
                val cilindradas  = reader.nextInt()
                moto= Moto(modeloM, marcaM, anoM, cilindradas)
            }
            7->moto?.exibirInformacoes()
            8->{
                println("Quantos km/h acelerar?")
                val acelerar = reader.nextInt()
                moto?.acelerar(acelerar)
            }
            9->moto?.empinar()
        }
    } while (opcao!=10)
}