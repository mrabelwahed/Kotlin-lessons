package com.ramadan_apps.kotlinleasons

import java.math.BigDecimal

/**
 * Created by Mahmoud Ramadan on 1/19/18.
 */
class Square(var sideLength:BigDecimal,name:String): NamedShape(name) {

    init {
        numberOfSides = 4
    }
     fun area() = sideLength.pow(2)

    override fun  simpleDesc() = "the shape has side length $sideLength"

}