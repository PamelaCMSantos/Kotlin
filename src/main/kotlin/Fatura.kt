class Fatura(
    var numero: String?,
    var descriProduto: String?,
    var qtdCompra: Int,
    var precoProduto: Double
) {
    fun totalFatura(): Double {
        return qtdCompra * precoProduto
    }
}