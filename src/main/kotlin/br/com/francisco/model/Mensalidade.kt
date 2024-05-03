package br.com.francisco.model

import java.math.BigDecimal
import java.time.LocalDate

data class Mensalidade(
    val valor : BigDecimal,
    val vencimento : LocalDate
) {
}