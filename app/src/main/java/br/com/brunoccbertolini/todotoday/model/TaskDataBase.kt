package br.com.brunoccbertolini.todotoday.model

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [TaskEntity::class], version = 1)
abstract class TaskDataBase : RoomDatabase () {
    abstract fun taskDao(): TaskDAO
}