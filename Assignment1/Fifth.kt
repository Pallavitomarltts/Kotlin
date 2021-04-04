package com.example.myfirstapplication

fun main()
{
    println("Enter the number")
    var num: Int=Integer.valueOf(readLine())
    println("Factorial is:" +fact(num))
}
fun fact(num:Int):Int
{
    if(num==0)
        return 1;
    else
        return num * fact(num-1)
}
