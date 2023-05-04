package com.miwas.yaprakticumcohort04sprint12.data.room

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query

@Dao
interface SongDao {

    @Query("SELECT * FROM songs")
    fun getAllSongs(): List<Song>

    @Query("SELECT * FROM songs WHERE id LIKE :songId")
    fun getSongById(songId: Int): Song

    @Insert
    fun insertAll(vararg songs: Song)

    @Delete
    fun delete(song: Song)

    @Query("DELETE FROM songs")
    fun deleteAll()
}