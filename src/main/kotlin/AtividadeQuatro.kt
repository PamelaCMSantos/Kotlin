fun portaria(){
    println("Qual a sua idade? ")
    val idade= readLine()!!.toInt()
    if (idade >18){
        println("Qual o seu convite? ")
        val convite= readLine()!!

        if (convite == "comum" || convite == "premium" || convite == "luxo"){
            println("Digite o codigo:")
            val codigo= readLine()!!
            if (codigo.contains("XL") || codigo.contains("XT")){
                println("Welcome :)")

            } else println("Código inválido. ")
        } else{
            println("Convite inválido. ")
        }
    } else println("Você é menor de idade. É proibida a entrada de menores de idade.")
}

fun main(){

    portaria()


}
