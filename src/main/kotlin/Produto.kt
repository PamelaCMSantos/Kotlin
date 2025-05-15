import java.util.*

// import kotlin.collections.mutableListOf

fun main(){
    val reader = Scanner(System.`in`)
    val produto = mutableListOf<Fatura>()

    for(i in 0..<3){
        println("Digite o numero do produto: $i")
        val numero = reader.nextLine()
        println("Digite a descrição do produto:")
        val descriProduto = readLine()
        println("Digite a quantidade que deseja comprar:")
        val qtdCompra = reader.nextInt()
        println("Digite o valor:")
        val precoProduto  = reader.nextDouble()

        reader.nextLine()

        produto.add(Fatura(numero, descriProduto, qtdCompra, precoProduto))

    }

    println("\n--- Detalhes das Faturas ---")
    produto.forEachIndexed { index, produto ->
        println("\nProduto ${index +1}:")
        println("O número do produto é: ${produto.numero}, o produto foi: ${produto.descriProduto} \n")
        println("A quantidade comprada foi: ${produto.qtdCompra}. Com o valor de R$ ${produto.precoProduto} cada \n")
        println("O total da compra: R$ ${produto.totalFatura()}")
    }
}