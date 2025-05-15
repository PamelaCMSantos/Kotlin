import kotlin.math.PI

class Circulo(corV: String?, var raioR: Double,): Figura(corV) {
    var raio: Double = 0.0

    init {
        this.raio=raioR
    }

    override fun calcularArea(): Double {
        return (PI*raio*raio)
    }

    override fun descrever() {
        super.descrever()
        println(" É um Circulo com raio $raio e área ${calcularArea()}")
    }
}