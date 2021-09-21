package com.example.todoapplication.database

import androidx.room.Database
import androidx.room.Entity
import androidx.room.RoomDatabase
import com.example.todoapplication.dao.DAO

@Database(entities = [Entity::class],version=1)
abstract class myDatabase : RoomDatabase() {
    abstract fun dao(): DAO
}