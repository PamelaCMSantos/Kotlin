class Moto(marcaV: String?, modeloV: String?, anoV: Int?, val cilindradas: Int): Veiculo(marcaV, modeloV, anoV) {
    // sobre escrevendo a função exibirInformações e adicionando as informações da classe moto
    override fun exibirInformacoes(){
        super.exibirInformacoes()
        println("A moto possui $cilindradas cc cilindadas \n")
    }

    fun empinar() {
        if (velocidadeAtual > 10) {
            println("A $marca $modelo empinando! Cuidado!! \n")
        } else {
            println("A $marca $modelo precisa estar a mais velocidade para empinar. \n")
        }
    }


}