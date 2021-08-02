package br.com.zupadacemy.maxley

import io.micronaut.runtime.Micronaut.*
fun main(args: Array<String>) {
	build()
	    .args(*args)
		.packages("br.com.zupadacemy.maxley")
		.start()
}

