/*Crie uma um programa para trabalhar com estoque de uma loja, o programa deverá
trabalhar com Collection do tipo List do kotlin para manipular os dados desse estoque, o
programa deverá atender as seguintes funcionalidades:

Armazenar dados da List;
Remover dados da list;
Atualizar dados da list.
Apresentar todos os dados da list.*/


fun main() {
    val dados = mutableListOf<String>()
    var nomeProd: String

    while (true) {
        print("Digite o nome do produto: ")
        nomeProd = readLine()!!

        if (nomeProd.isEmpty()) {
            break

        } else {
            dados.add(nomeProd)

        }
    }
    println("\nOS ITENS DA SUA LISTA SÃO $dados")
    println("------------------------------")

    while (true) {
        print("Digite o nome do item que quer remover: ")
        nomeProd = readLine()!!

        if (dados.contains(nomeProd)) {
            dados.remove(nomeProd)
            println("Item $nomeProd foi removido com sucesso\n")
            break
        } else {
            println("O produto $nomeProd não existe na lista.\n")
        }
    }
    println("OS ITENS DA LISTA AGORA SÃO $dados")
    println("------------------------------")
}