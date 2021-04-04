package com.example.myfirstapplication

fun main()
{
    println("Enter the marks of first subject")
    var marks1: Int= Integer.valueOf(readLine())
    println("Enter the marks of second subject")
    var marks2: Int=Integer.valueOf(readLine())
    println("Enter the marks of third subject")
    var marks3: Int=Integer.valueOf(readLine())
    var total:Int= marks1+marks2+marks3
    var percentage: Double= (total/3).toDouble()
    println("THE TOTAL SCORE IS $total")
    println("PERCENTAGE IS $percentage")
}