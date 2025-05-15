/*
// Explicação

class Usuario(){
    // Os atributos

    // os métodos
    fun logar(email: String, senha: String){
        println("Usuário com o e-mail: $email")
    }
    fun logar(numTelefone: String){
        println("Usuário com telefone: $numTelefone")
    }
}
fun main(){
    val usuario= Usuario()
    usuario.logar("Pcmuepa45@gmail.com", "2345")
    usuario.logar("(93) 94578-5434")
}
 */
// Exercício
import java.util.*
fun main(){
    val reader = Scanner(System.`in`)
    var impressora: Impressora? = null
    do {
        println(
            """
            ++++++++++++++++++++++++++++++++++++++
            +        Controle de VEÍCULOS        +
            ++++++++++++++++++++++++++++++++++++++
            |                                    |
            | [1] - Criar objeto Impressora      |
            | [2] - Exibir impressão String      |
            | [3] - Exibir impressão Inteiro     |
            | [4] - Exibir impressão Doble       |
            | [5] - Sair                         |

            ++++++++++++++++++++++++++++++++++++++
            """.trimIndent()
        )
        println("Qual a Opção? ")
        val opcao= readLine()?.toIntOrNull() ?: 0

        when(opcao){
            1->{
                impressora =Impressora()
                println("O objeto Impressora foi criado")
            }
            2->{
                println("Qual a String? ")
                val numero=reader.nextLine()
                impressora?.imprimir(numero)
            }
            3->{
                println("Qual o numero Inteiro? ")
                val inteiro= reader.nextInt()
                impressora?.imprimir(inteiro)
            }
            4->{
                println("Qual o Double? ")
                val dob= reader.nextDouble()
                impressora?.imprimir(dob)
            }
            5-> println("Saindo")
            else -> println("Opção inválida. Tente novamente.")

        }


    }while(opcao!=5)
}