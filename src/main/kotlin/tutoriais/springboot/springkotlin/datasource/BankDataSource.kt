package tutoriais.springboot.springkotlin.datasource

import tutoriais.springboot.springkotlin.model.Bank

// o interface apenas define o tipo de funcionalidade
interface BankDataSource {
    fun retrieveBanks(): Collection<Bank>
}