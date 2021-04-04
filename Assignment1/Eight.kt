package com.example.myfirstapplication

import java.util.*
fun main() {
    val sc = Scanner(System.`in`)
    var num:Int
    println("enter number")
    num = sc.nextInt()
    var i:Int=2
    while(num>0){
        if(isPrime(i)) {
            println(i)
            num--
            i++
        }
        else{
            i++
        }
    }
}
fun isPrime(i:Int):Boolean{
    var count:Int=0
    for(j in 1..i){
        if(i%j==0){
            count++
        }
    }
    if(count>2){
        return false
    }
     else{
        return true
    }
}