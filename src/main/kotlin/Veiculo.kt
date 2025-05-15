import kotlin.math.max // importa a biblioteca de matemática

open class Veiculo(marcaV: String?, modeloV: String?, anoV: Int?) {
    // usa o "open" para abrir a classe e outras possam usar seu conteúdo

    var velocidadeAtual: Int = 0 // iniciando um variável local para usar em operações na classe
    // declarando variáveis que irão receber os parâmetros da classe
    var modelo: String? = ""
    var ano: Int? = null
    var marca: String? = ""

    init {
        // utilizando o "this." para fazer as variáveis receberem os parâmetros de forma correta
        this.modelo = modeloV
        this.ano = anoV
        this.marca = marcaV
    }
    // usando o "open" para abrir a função acelerar e permitir alterações nela, declarando uma variável para incrementar
    open fun acelerar(incremento: Int) {
        // usando um if para medir a aceleração
        if(incremento> 0){
        velocidadeAtual += incremento //somando a velocidade atual com o incremento digitado
        println("$marca $modelo acelerando. Velocidade atual: $velocidadeAtual km/h")
        } else {
            println("Incremento inválido para acelerar")
        }
    }
    // criando a função para frear utilizando uma variável como decremento
    open fun frear(decremento: Int) {
        if (decremento > 0) {
            val velocidadeAntiga = velocidadeAtual // declarando uma variavel e atribuindo o seu valor como o da variável velocidadeAtual
            // Abaixo, a velocidade atual e atualizada para receber max. Sendo que max retorna o maior valor, e impede os
            // valores negativos ao uzar o a=0. Ou seja, velocidade atual menos o decremento retornará 0 se o decremento for
            // maior que a velocidade
            velocidadeAtual = max(0, velocidadeAtual - decremento)
            if (velocidadeAtual < velocidadeAntiga){
            println("$marca $modelo freando. Velocidade atual: $velocidadeAtual km/h")
            } else if (velocidadeAntiga == 0){
                println("$marca $modelo já está parado.")
            }
        } else {
            println("Decremento inválido para frear")
        }
    }

    open fun exibirInformacoes() {
        println("""
            ----- Informações do Veiculo ---
            Modelo: $modelo
            Marca: $marca
            Ano: $ano
            Velocidade Atual: $velocidadeAtual km/h
        """)
    }
}