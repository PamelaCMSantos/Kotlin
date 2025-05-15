class Carro(
    modeloV: String?,
    marcaV: String?,
    anoV: Int?,
    val numeroPortas: Int
) : Veiculo(modeloV, marcaV, anoV) {
    // A classe carro recebe os parâmetros da classe veículo. Criando também um parâmetro própria de carro, a variável
    // "numeroPortas"
    fun abrirPortas() {
        println("Abrir porta-malas $modelo aberto!")
    }

    override fun exibirInformacoes() {
        // o "override" é usado para chamar e usar a função aberta com o mesmo nome na classe veículo
        super.exibirInformacoes()
        println("Número de portas: $numeroPortas \n")
    }
}