package br.com.lrb.mng

import br.com.lrb.mng.common.model.Cliente
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean

@SpringBootApplication
class MngApplication{

	@Bean
	fun init() = CommandLineRunner {
		val clienteDeTeste = Cliente(1L, "João", "123.456.789-00")
		println("Cliente de teste: $clienteDeTeste")
	}

}

fun main(args: Array<String>) {
	runApplication<MngApplication>(*args)
}
