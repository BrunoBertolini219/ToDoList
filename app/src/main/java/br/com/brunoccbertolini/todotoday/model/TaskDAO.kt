package br.com.brunoccbertolini.todotoday.model

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface TaskDAO {

    @Insert
    suspend fun insert(task: TaskEntity): Long

    @Update
    suspend fun update(task: TaskEntity)

    @Query ("DELETE FROM TASK WHERE id = :id ")
    suspend fun delete (id: Long)

    @Query ("DELETE FROM TASK")
    suspend fun deleteAll()

    @Query ("SELECT * FROM TASK")
    fun getAll (): LiveData<List<TaskEntity>>


}