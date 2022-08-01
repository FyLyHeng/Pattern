package com.example.DP

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DesignPatternApplication

fun main(args: Array<String>) {
    runApplication<DesignPatternApplication>(*args)
    println("This project is about Design Pattern!!")
}
