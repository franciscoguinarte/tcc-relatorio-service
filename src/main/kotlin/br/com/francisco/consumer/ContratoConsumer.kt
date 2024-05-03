package br.com.francisco.consumer

import br.com.francisco.model.Contrato
import br.com.francisco.service.ContratoService
import com.fasterxml.jackson.databind.ObjectMapper
import io.micronaut.configuration.kafka.annotation.KafkaListener
import io.micronaut.configuration.kafka.annotation.OffsetReset
import io.micronaut.configuration.kafka.annotation.Topic

@KafkaListener(offsetReset = OffsetReset.EARLIEST)
class ContratoConsumer (
    private val objectMapper: ObjectMapper,
    private val contratoService: ContratoService
){
    @Topic("contrato")
    fun receberContrato(id: String, contratoJSON: String){
        val contrato = objectMapper.readValue(contratoJSON, Contrato::class.java)
        contratoService.create(contrato)
        println(contrato)
    }
}