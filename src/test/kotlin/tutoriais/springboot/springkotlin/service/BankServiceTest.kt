package tutoriais.springboot.springkotlin.service

import io.mockk.every
import io.mockk.mockk
import io.mockk.verify
import org.junit.jupiter.api.Test
import tutoriais.springboot.springkotlin.datasource.BankDataSource

// O que queremos apenas testar o que, é a classe de serviço faz é simular a fonte de dados que ela usa;
// ou seja, vamos ter um teste de integração que vai passar pelo serviço;
internal class BankServiceTest {
    // o nosso objeto de tipo da fonte de dados do banco deve ser uma simulação com essa função chamada MOCKK;
    private val dataSource: BankDataSource = mockk(relaxed = true)
    private val bankService = BankService(dataSource)

    @Test
    fun `should call its data source to retrieve banks`() {
        // given
        //every { dataSource.retrieveBanks() } returns emptyList()

        // when
        bankService.getBanks() // chama fonte de dados

        // then
        verify(exactly = 1) { dataSource.retrieveBanks() }
    }
}