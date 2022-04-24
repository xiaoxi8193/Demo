package com.example.demo.room.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 * 用户表
 */
@Entity(tableName = "T_USER")
data class User(
    @PrimaryKey(autoGenerate = true) var id: Int = 0,
    @ColumnInfo(name = "UID") val uid : String = "",
    @ColumnInfo(name = "USERNAME") val username : String = "",
    @ColumnInfo(name = "NAME") val name : String = "",
    @ColumnInfo(name = "PASSWORD") val password : String = "",
    @ColumnInfo(name = "SALT") val salt : String = "",
)
