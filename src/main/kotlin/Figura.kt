open class Figura(corV: String?) {
    var cor: String?= ""
    init {
        this.cor= corV
    }
    open fun calcularArea(): Double{
        return (0.0)
    }
    open fun descrever() {
        println("Figura geométrica de cor $cor.")
    }
}