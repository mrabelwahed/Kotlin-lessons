package com.ramadan_apps.kotlinleasons

/**
 * Created by Mahmoud Ramadan on 1/19/18.
 */
open class NamedShape(val name:String) {
    var numberOfSides = 0
    open fun simpleDesc() = "the shape has $numberOfSides sides"
}