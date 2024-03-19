package com.example.assignment1

interface TaskInterface {
    fun addTask(task: Task)
    fun removeTask(task: Task)
    fun getTasks(): List<Task>

}