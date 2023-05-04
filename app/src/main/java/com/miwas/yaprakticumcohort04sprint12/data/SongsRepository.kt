package com.miwas.yaprakticumcohort04sprint12.data

import com.miwas.yaprakticumcohort04sprint12.data.room.Song
import com.miwas.yaprakticumcohort04sprint12.data.room.SongsDatabase

class SongsRepository(private val database: SongsDatabase) {

    fun getAllSongs() = database.songsDao().getAllSongs()

    fun getSongById(id: Int) = database.songsDao().getSongById(id)

    fun insertSongs(
        song1: Song,
        song2: Song,
        song3: Song,
        song4: Song,
        song5: Song
    ) = database.songsDao().insertAll(song1, song2, song3, song4, song5)

    fun deleteAll() = database.songsDao().deleteAll()
}