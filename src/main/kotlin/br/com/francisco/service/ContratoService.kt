package br.com.francisco.service

import br.com.francisco.model.Contrato
import br.com.francisco.repository.ContratoRepository
import jakarta.inject.Singleton

@Singleton
class ContratoService(
    private val contratoRepository: ContratoRepository
) {

    fun create(contrato : Contrato){
        contratoRepository.create(contrato )
    }
}