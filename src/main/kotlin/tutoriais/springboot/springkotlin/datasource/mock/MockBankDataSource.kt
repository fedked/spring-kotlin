package tutoriais.springboot.springkotlin.datasource.mock

import org.springframework.stereotype.Repository
import tutoriais.springboot.springkotlin.datasource.BankDataSource
import tutoriais.springboot.springkotlin.model.Bank

@Repository // significa que essa classe é responsável por recuperar dados, armazenar dados
            // e esses tipos de funacionlidade para o acesso de suas entidade;
class MockBankDataSource : BankDataSource {
        val banks = listOf(
                Bank("1234", 3.14, 17),
                Bank("1010", 17.0, 0),
                Bank("5678", 0.0, 100)
        )
        override fun retrieveBanks(): Collection<Bank> = banks
}