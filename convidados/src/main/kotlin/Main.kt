fun main(args: Array<String>) {

    var sair = "Sim"
    val convidados = mutableMapOf(
        1 to "Maria",
        2 to "Fabiano",
        3 to "Cauã",
        4 to "Mariana"
    )

    while (sair == "Sim") {

        println(
            "Escolha dentre as opções:  1° adiciona um novo convidade - 2° remover um convidade - 3°listar convidades" +
                    "\nPara parar digite 4" + "\n Resposta:"
        )
        var opcao = readLine()!!.toInt()

        if (opcao == 1) {
            println("Fale a posição na lista: ")
            val posicao = readLine()!!.toInt()
            println("Nome da pessoa: ")
            val nome = readLine()!!

            convidados.put(posicao, nome)
        } else if (opcao == 2) {
            println("Fale quem você quer tirar: ")
            var tirar = readLine()!!.toInt()

            convidados.remove(tirar)

        } else if (opcao == 3) {
            println(convidados)

        } else if (opcao == 4) {
            println(" Obrigado por participar do Beta \uD83D\uDC96" + "\n Para ver novas atualizações confiram o link: https://github.com/cristhian-ruescas/29_10  \uD83D\uDE80")
            sair = "Não"
        } else {
            print("Numero invalido")
            sair += "Não"
            
        }
    }
}











