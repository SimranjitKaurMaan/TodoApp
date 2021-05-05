package com.simran.repository

import com.simran.entities.Todo
import com.simran.entities.TodoDraft

interface TodoRepository
{
    fun getAllTodos(): List<Todo>

    fun getTodo(id:Int): Todo?

    fun addTodo(draft: TodoDraft):Todo

    fun removeTodo(id: Int):Boolean

    fun updateTodo(id:Int,draft: TodoDraft):Boolean
}