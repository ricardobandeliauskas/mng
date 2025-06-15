package br.com.lrb.mng

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MngApplication

fun main(args: Array<String>) {
	runApplication<MngApplication>(*args)
}
