package tutoriais.springboot.springkotlin.service

import org.springframework.stereotype.Service
import tutoriais.springboot.springkotlin.datasource.BankDataSource
import tutoriais.springboot.springkotlin.model.Bank

@Service // objeto dele em tempo de execução

// estamos a usar um construtor primário que precisa da sua fonte de dados e de algum objeto de tipo de dados do banco;
class BankService(private val dataSource: BankDataSource) {
    fun getBanks(): Collection<Bank> = dataSource.retrieveBanks()

}