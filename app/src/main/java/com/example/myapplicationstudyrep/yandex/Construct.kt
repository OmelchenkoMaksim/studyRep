package com.example.myapplicationstudyrep.yandex


abstract class Human(val name: String, var age: Int)

interface Printable {
    fun printMe()
}

class Engineer constructor(nameEngineer: String, ageEngineer: Int) :
    Human(age = ageEngineer, name = nameEngineer),
    Printable {

    constructor() : this(nameEngineer = "noname", 0)
    constructor(ageEngineer: Int) : this(nameEngineer = "noname", ageEngineer = ageEngineer)
    constructor(nameEngineer: String) : this(nameEngineer = nameEngineer, 10)

    override fun printMe() {
        println("Hi I am $name and i'm $age and my staus")
    }
}


fun main() {

    val human = Engineer("Vova", 22)
    val human1 = Engineer("Marina", 7)
    val human2 = Engineer(ageEngineer = 7, nameEngineer = "Fedya")

    val engineer = Engineer()
    val engineer1 = Engineer(8)
    val engineer2 = Engineer("8")


//    val abstract = Human()

    println( human.age)
    println(human1.name + human1.age)
    println(human2.name + human2.age)
}