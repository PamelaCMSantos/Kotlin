class Funcionario(nome:String?, idade:Int?, var salario:Double, var cargo: String): Pessoa(nome, idade) {


    fun aumentar_salario(porcentagem: Double) {
        var aumentoSalario: Double


        aumentoSalario = salario+porcentagem

        println("O novo salário é $aumentoSalario")
    }
}