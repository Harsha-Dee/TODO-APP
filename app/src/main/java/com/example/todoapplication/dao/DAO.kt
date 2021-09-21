package com.example.todoapplication.dao

import androidx.room.*
import com.example.todoapplication.CardInfo
import com.example.todoapplication.modal.Entity

@Dao
interface DAO {
    @Insert
    suspend fun insertTask(entity: com.example.todoapplication.modal.Entity)

    @Update
    suspend fun updateTask(entity: Entity)

    @Delete
    suspend fun deleteTask(entity: com.example.todoapplication.modal.Entity)

    @Query("Delete from to_do")
    suspend fun deleteAll()

    @Query("Select * from to_do")
    suspend fun getTasks():List<CardInfo>

}
