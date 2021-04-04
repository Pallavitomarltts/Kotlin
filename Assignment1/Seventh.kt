package com.example.myfirstapplication

import android.icu.number.IntegerWidth

fun main()
{
    var num1 =0
    var num2 =1
    println("Enter the number")
    var num= Integer.valueOf(readLine())
    println("Fibonacci of first $num is:")
    for (i in 1..num)
    {
        println("$num1")
        val sum= num1+num2
        num1=num2
        num2=sum
    }
}
