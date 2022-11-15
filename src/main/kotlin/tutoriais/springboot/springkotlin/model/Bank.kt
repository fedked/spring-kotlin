package tutoriais.springboot.springkotlin.model

// a camada de dados para o aplicativo, criamos o modelo e isso significa é ter objetos de banco,
// precisamos de uma classe que representa o nosso banco com dados.

class Bank ( // objeto de transferência de dados ou uma classe de dados que tem três campos:
    val acconutNumber: String, // - número de conta
    val trust: Double,         // - um fundo
    val transactionFee: Int    // - taxa de transação
)