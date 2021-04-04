package com.example.myfirstapplication

fun main()
{
    println("Enter the first number")
    var num1: Int= Integer.valueOf(readLine())
    println("Enter the second number")
    var num2:Int =Integer.valueOf(readLine())
    println("1. ADDITION")
    println("2. SUBTRACION")
    println("3. MULTIPICATION")
    println("4. DIVISION")
    println("Enter the operation you want to perform")
    var choice: Int= Integer.valueOf(readLine())
    when(choice)
    {
        1-> println(num1+num2)
        2-> println(num1-num2)
        3-> println(num1*num2)
        4-> println(num1/num2)
    }
}
