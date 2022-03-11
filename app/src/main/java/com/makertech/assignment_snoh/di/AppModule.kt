package com.makertech.assignment_snoh.di

import android.app.Application
import androidx.room.Room
import com.makertech.assignment_snoh.data.local.TheProjectDao
import com.makertech.assignment_snoh.data.local.TheProjectDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {
    @Provides
    @Singleton
    fun providesAppDatabase(application: Application): TheProjectDatabase {
        return Room.databaseBuilder(application, TheProjectDatabase::class.java, "database.db")
            .fallbackToDestructiveMigration()
            .allowMainThreadQueries()
            .build()
    }

    @Provides
    @Singleton
    fun providesUserDAO(appDatabase: TheProjectDatabase): TheProjectDao {
        return appDatabase.projectDao()
    }
}