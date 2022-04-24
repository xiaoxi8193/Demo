package com.example.demo.room

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.demo.room.entity.User

/**
 * 数据库的创建
 */
@Database(
    entities = [User::class],
    version = 1
)
abstract class MyAppDatabase : RoomDatabase() {
    companion object {
        // Singleton prevents multiple instances of database opening at the
        // same time.
        @Volatile
        private var INSTANCE: MyAppDatabase? = null

        fun getDatabase(context: Context): MyAppDatabase {
            val tempInstance = INSTANCE
            if (tempInstance != null) {
                return tempInstance
            }
            synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    MyAppDatabase::class.java,
                    "ys_database"
                ).build()
                INSTANCE = instance
                return instance
            }
        }
    }
}