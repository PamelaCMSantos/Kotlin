import java.util.*
fun main(){
    val reader = Scanner(System.`in`)
    var caixa: ContaBancaria? = null
    do {
        println(
            """
            ++++++++++++++++++++++++++++++++++++++
            +        Controle de VEÍCULOS        +
            ++++++++++++++++++++++++++++++++++++++
            |                                    |
            | [1] - Logar conta Bancária         |
            | [2] - Exibir Saldo                 |
            | [3] - Exibir Depositar             |
            | [4] - Exibir Sacar                 |
            | [5] - Extrato de Dias              |
            | [6] - Extrato de Intervalo de tempo|
            | [7] - Sair                         |
            ++++++++++++++++++++++++++++++++++++++
            """.trimIndent()
        )
        println("Qual a Opção? ")
        val opcao= readLine()?.toIntOrNull() ?: 0

        when(opcao){
            1->{
                println("Qual a sua agencia? ")
                val agencia=reader.nextLine()
                println("Qual a sua conta? ")
                val conta=reader.nextLine()
                println("Qual a sua senha? ")
                val senha=reader.nextLine()

                caixa=ContaBancaria(agencia, conta, senha)
                println("Seja Bem-vindo!!!")
            }
            2->{
                println("O seu saldo atual é: ${caixa?.recuperarSaldo()}")
            }
            3->{
                println("Qual valor deseja depositar? ")
                val deposito= reader.nextDouble()
                caixa?.depositar(deposito)
            }
            4->{
                println("Qual valor deseja sacar? ")
                val saque= reader.nextDouble()
                caixa?.sacar(saque)
            }
            5-> {
                println("Quantos dias deseja ver?")
                val extrato= reader.nextInt()
                caixa?.extrato(extrato)
                println("O extrato de ${caixa?.extrato(extrato)} dias")
            }
            6-> {
                println("Quando é o dia de inicio do extrato exibido?")
                val primeiro= readlnOrNull()
                println("Quando é o dia final do extrato exibido?")
                val ultimo= readlnOrNull()
                println("O extrato de ${caixa?.extrato(primeiro?:"", ultimo?:"")} dias")
            }
            7->{
                println("Saindo")
            }
            else -> println("Opção inválida. Tente novamente.")

        }


    }while(opcao!=7)
}