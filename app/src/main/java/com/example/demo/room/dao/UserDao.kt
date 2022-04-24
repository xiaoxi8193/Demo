package com.example.demo.room.dao

import androidx.room.*
import com.example.demo.room.entity.User

@Dao
interface UserDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insertList(userList: List<User>)

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(User : User)

    @Update
    suspend fun update(User: User): Int

    @Delete
    suspend fun delete(User: User): Int

    @Delete
    suspend fun deleteList(userList: List<User>): Int

    @Query("DELETE FROM T_USER")
    suspend fun deleteAll()
}