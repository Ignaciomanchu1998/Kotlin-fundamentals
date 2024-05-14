package com.danitech.kotlin_fundamentals.task
import android.os.Build
import androidx.annotation.RequiresApi
import java.time.LocalTime

@RequiresApi(Build.VERSION_CODES.O)
fun main() {
    println("================= Welcome to AdminSystem =================")

    val userNameInSystem = "developer"
    val passwordInSystem = "@19_98*"
    val getHours = LocalTime.now().hour

    var  userName: String
    var password:String

    println("Enter your username: ")
    userName = readln()

    println("Enter your password: ")
    password = readln()

    if (userName != userNameInSystem || password != passwordInSystem) {
        println("Account with username $userName not found")
        return
    }
    println("Welcome $userName, ${getGretting(getHours)}")

    val myTasks = getTask()

    for (task in myTasks) {
        println("Task: ${task["name"]}")
        println("Description: ${task["description"]}")
    }
}

fun getGretting(hours: Int): String {
    return when (hours) {
        in 6..12 -> "Good Morning"
        in 13..18 -> "Good Afternoon"
        in 19..23 -> "Good Evening"
        else -> "Unknown time of day"
    }
}

fun getTask(): Array<Map<String, String>> {
    val myTask = arrayOf(
        mapOf("name" to "Task 1", "description" to "Description of task 1"),
        mapOf("name" to "Task 2", "description" to "Description of task 2"),
        mapOf("name" to "Task 3", "description" to "Description of task 3"),
        mapOf("name" to "Task 4", "description" to "Description of task 4"),
    )
    return myTask
}


