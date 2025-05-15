fun ano(num: Int){
    println("$num anos equivale a: \n")
    println("${num*12} meses \n")
    println("${num*365} dias \n")
    println("${num*8760} horas \n")
    println("${num*525600} minutos \n")
    println("${num*31536000} segundos \n")
}
fun letra(nome: String){
    println("$nome possui ${nome.length} letras ")
}
fun main(){
/*
    println("Quantos anos deseja calcular? ")
    val numero = readLine()!!.toInt()
    ano(numero)

    println("Digite o nome que deseja calcular os caracteres: ")
    val nome = readLine()!!
    letra(nome)

 */
    println("Qual o nome do funcionário? ")
    val nomeFuncionario = readLine()!!
    println("Quantos anos o funcionário tem? ")
    val idade = readLine()!!.toInt()
    println("Qual o salário do funcionário? ")
    val salario = readLine()!!.toDouble()
    println("Qual o cargo? ")
    val cargo = readLine()!!
    val funcionario = Funcionario(nomeFuncionario, idade, salario, cargo)

    println("Qual o aumento do salário? ")
    val aumento= readLine()!!.toDouble()

    println("O $nomeFuncionario, de $idade anos de idade, com o salário anterior de: $salario. Teve um aumento de $aumento")
    funcionario.aumentar_salario(aumento)



}

