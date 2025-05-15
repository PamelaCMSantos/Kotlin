class Retangulo(corV: String?, var larguraR: Double, var alturaR: Double): Figura(corV) {
    var largura: Double
    var altura: Double
    init {
        this.largura= larguraR
        this.altura= alturaR

    }
    override fun calcularArea(): Double {
        return largura*altura
    }

    override fun descrever() {
        super.descrever()
        calcularArea()

        println(" É um Retângulo com largura $largura, altura $altura e aréa ${calcularArea()}")
    }
}