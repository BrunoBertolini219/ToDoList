package br.com.brunoccbertolini.todotoday.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName="task")
data class TaskEntity (

    @PrimaryKey(autoGenerate = true)
    val id: Long,
    val titleTask: String,
    val contentTask: String

){
}