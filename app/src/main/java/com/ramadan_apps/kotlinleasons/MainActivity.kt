package com.ramadan_apps.kotlinleasons

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

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

    }

    private  fun greet(name:String , day:String):String{
        return "Hello $name ,day is $day"
    }




}
