package com.ramadan_apps.kotlinleasons

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import java.math.BigDecimal

class MainActivity : AppCompatActivity() {


    var number: Double = 20.0
    val label = "kotlin"
    val value = 20
    val apples = 20
    val oranges = 200
    val names = arrayOf("Mahmoud","Ahmed","Reem")
    val shoppingList = arrayOf("item1","item2","item3")
    val map = mutableMapOf("key1" to "value1",
                                   "key2" to "value2")

    val emptyArr = arrayOf<String>()
    val emptyMap = mapOf<String,Float>()

    val numbers = listOf(40,20,200)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println(number)
        println("next value is>>>>"+label+value)
        println("I have ${apples+oranges}"+"fruits")

        val count = names.count()

        for (i in 0..count-1){
            println("person${i+1}"+"is"+"${names[i]}")
        }

        println("fitstItem of Map"+map["key1"])
        println(greet("Mahmoud","Monday"))

        //test variable length arguments

        Log.d("t1",""+sumOf(1,2,3,20))

       val afterPNum = numbers.map { 10 *  it }

        println("numbers after map >>"+afterPNum.sorted())

        Log.e("result",area(10,30).toString())

        //dealing with classes
        var myShape = Shape()
        myShape.numberOfSides = 5
        var shapeSides = myShape.simpleDescription()

        Log.e("sides",shapeSides);

        var square = Square(BigDecimal(5.2),"square")
        square.area()
        Log.d("square",square.simpleDesc())

    }

    private  fun greet(name:String , day:String):String{
        return "Hello $name ,day is $day"
    }


    private fun sumOf(vararg numbers:Int):Int{
        var sum=0;
        for (number in numbers){
          sum+=number
        }
        return sum
    }

    fun area(width:Int , height:Int) = width * height



}
