package com.miwas.yaprakticumcohort04sprint12.data.room

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [Song::class], version = 1)
abstract class SongsDatabase : RoomDatabase() {

    abstract fun songsDao(): SongDao

    companion object {
        @Volatile
        private lateinit var instance: SongsDatabase

        fun getInstance(context: Context): SongsDatabase {
            synchronized(this) {
                if (!Companion::instance.isInitialized) {
                    instance = Room.databaseBuilder(
                        context,
                        SongsDatabase::class.java, "songs-database"
                    ).allowMainThreadQueries().build()
                }
                return instance
            }
        }
    }
}