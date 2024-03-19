package com.example.assignment1

import android.view.View


class IPresenter(private val taskManager: TaskInterface) {
    private var view: ToDoListView? = null

    fun attachView(view: ToDoListView) {
        this.view = view
        this.view?.displayTasks(taskManager.getTasks())
    }

    fun onAddTaskClicked(title: String, description: String) {
        val task = Task(title, description, false)
        taskManager.addTask(task)
        view?.showTaskAdded()
        view?.displayTasks(taskManager.getTasks())
    }



    fun detachView() {
        view = null
    }
}
