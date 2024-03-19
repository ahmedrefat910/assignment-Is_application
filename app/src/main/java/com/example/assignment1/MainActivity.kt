package com.example.assignment1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

interface ToDoListView {
    fun displayTasks(tasks: List<Task>)
    fun showError(message: String)
    fun showTaskAdded()
}
class MainActivity : AppCompatActivity(),ToDoListView  {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var count = 0

        val button: Button = findViewById(R.id.btnCount)
        val textView: TextView = findViewById(R.id.textView)

        button.setOnClickListener {
            count++
            textView.text = "Count: $count"
        }
    }

    override fun displayTasks(tasks: List<Task>) {

    }

    override fun showError(message: String) {
        TODO("Not yet implemented")
    }

    override fun showTaskAdded() {
        TODO("Not yet implemented")
    }
}