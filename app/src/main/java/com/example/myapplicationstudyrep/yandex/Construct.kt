package com.example.myapplicationstudyrep.yandex


abstract class Human(val name: String, open var age: Int)

interface Printable {
    fun printMe()
}

class Engineer constructor(nameEngineer: String = "noname", ageEngineer: Int = 0) :
    Human(age = ageEngineer, name = nameEngineer),
    Printable {

//    constructor() : this(nameEngineer = "noname", 0)
//    constructor(ageEngineer: Int) : this(nameEngineer = "noname", ageEngineer = ageEngineer)
//    constructor(nameEngineer: String) : this(nameEngineer = nameEngineer, 10)


    override var age: Int = ageEngineer
        get() = field
        set(value) {
            println("before $field and new $value")
            field = value
        }

    var salary = 1000
        get() {
            println(field)
            return field
        }
        set(value) {
            println("before $field and new $value")
            field = value
        }


    override fun printMe() {
        println("Hi I am $name and i'm $age and my staus")
    }
}


fun main() {

    val human = Engineer("Vova", 22)
    val human1 = Engineer()
    val human2 = Engineer(ageEngineer = 22)

    human.salary = 700
}