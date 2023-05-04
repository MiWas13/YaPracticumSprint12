package com.miwas.yaprakticumcohort04sprint12

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.miwas.yaprakticumcohort04sprint12.data.room.Song

class MainActivity : AppCompatActivity() {

    private lateinit var songNameTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //Что-то с БД
        App.databaseRepository.deleteAll()
        addAllSongs()

        //Контент
        setContentView(R.layout.activity_main)
        songNameTextView = findViewById(R.id.songName)

        val arrayOfSongs = getAllSongs()

        songNameTextView.text = arrayOfSongs[3].artist
    }


    private fun addAllSongs() {
        App.databaseRepository.insertSongs(
            song1 = Song(1, "Timber", "url", "Pitbull", "2,3 min"),
            song2 = Song(2, "Let it be", "url", "Beatles", "3,5 min"),
            song3 = Song(3, "Singleton Song", "url", "Kriss Tee Hang", "4,2 min"),
            song4 = Song(4, "AC/DC", "url", "Highway to hell", "6,7 min"),
            song5 = Song(5, "Niletto", "url", "Любимка", "3,5 min")
        )
    }

    private fun getAllSongs() = App.databaseRepository.getAllSongs()
}