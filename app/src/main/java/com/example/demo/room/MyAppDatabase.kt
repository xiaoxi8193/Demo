package com.example.demo.room

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.demo.room.dao.UserDao
import com.example.demo.room.entity.User

/**
 * 数据库的创建
 */
@Database(
    entities = [User::class],
    version = 1
)
abstract class MyAppDatabase : RoomDatabase() {

    abstract fun userDao(): UserDao

    companion object {
        // Singleton prevents multiple instances of database opening at the
        // same time.
        @Volatile
        private var INSTANCE: MyAppDatabase? = null

        private const val DATABASE_NAME = "ys_database"
        private const val DATABASE_DIR = "database/myapp.db" // Assets/database/myapp.db

        fun getDatabase(context: Context): MyAppDatabase {
            val tempInstance = INSTANCE
            if (tempInstance != null) {
                return tempInstance
            }
            synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    MyAppDatabase::class.java,
                    DATABASE_NAME
                )
                    //.createFromAsset(DATABASE_DIR)
                    .build()
                INSTANCE = instance
                return instance
            }
        }
    }
}