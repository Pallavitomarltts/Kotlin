package com.example.myfirstapplication

fun main()
{
    println("Enter the year")
    var year:Int =Integer.valueOf(readLine())
    if(((year%4==0) && (year%400 ==0) || (year%100!=0)))
    {
        println("This is leap year")
    }
    else
    {
        println("Not a leap year")
    }
}