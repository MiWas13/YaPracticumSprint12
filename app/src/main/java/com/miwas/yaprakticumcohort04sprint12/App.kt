package com.miwas.yaprakticumcohort04sprint12

import android.app.Application
import com.miwas.yaprakticumcohort04sprint12.data.SongsRepository
import com.miwas.yaprakticumcohort04sprint12.data.room.SongsDatabase

class App : Application() {

    override fun onCreate() {
        super.onCreate()
        database = SongsDatabase.getInstance(applicationContext)
        databaseRepository = SongsRepository(database)
    }

    companion object {
        lateinit var database: SongsDatabase
            private set

        lateinit var databaseRepository: SongsRepository
            private set
    }

}