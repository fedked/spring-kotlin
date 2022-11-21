package tutoriais.springboot.springkotlin.datasource.mock

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MockBankDataSourceTest {
    private val mockDataSource = MockBankDataSource()

    @Test
    /// para testar isso é a fonte de dados e deve fornecer a lista ou coleção de bancos;
    // o objetivo é que tenha seus pré-requisitos de testes ou toda configuração do teste concluída;
    fun `should provide a collection of banks` () {
        // when
        val banks = mockDataSource.banks

        // then
        //assertThat(banks).isNotEmpty
        assertThat(banks.size).isGreaterThanOrEqualTo(3)
    }

    @Test
    fun `should provide some mock data`() {
        // when
        val banks = mockDataSource.banks

        // then
        assertThat(banks).allMatch { it.acconutNumber.isNotEmpty() }
        assertThat(banks).anyMatch { it.trust != 0.0 }
        assertThat(banks).anyMatch { it.transactionFee != 0 }
    }
}