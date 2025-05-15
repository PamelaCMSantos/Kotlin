import kotlin.math.max
class ContaBancaria(agencia: String, conta: String, senha: String) {
    var usuarioAutenticado: Boolean= false
    var saldo: Double= 0.0
    var agen: String= ""
    var cont: String=""
    var sen: String=""

    init {
        this.agen = agencia
        this.cont = conta
        this.sen = senha
        this.usuarioAutenticado= true
    }
    fun recuperarSaldo(): Double {
        return if (usuarioAutenticado){
            (saldo)
        } else 0.0
    }
    fun depositar(incremento: Double){
        if (incremento >0){
            saldo += incremento
            println("O seu saldo após o deposito é: $saldo")
        }else {
            println("O valor não pode ser aceito")
        }
    }
    fun sacar(decremento: Double){

        if (decremento<saldo){
            saldo = max(0.0, saldo - decremento)
            println("O seu saldo após o saque é: $saldo")
        }else{
            println("O seu saldo é insuficiente para este saque")
        }
    }
    fun extrato(dias: Int): Int {
        return dias
    }
    fun extrato(dataInicial: String, dataFinal: String): String {
        return ("$dataInicial e $dataFinal")
    }
}