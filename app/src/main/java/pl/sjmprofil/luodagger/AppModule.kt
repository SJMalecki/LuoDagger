package pl.sjmprofil.luodagger

import android.app.Application
import android.arch.persistence.room.Room
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
internal class AppModule {

    @Singleton
    @Provides
    fun provideDatabase(app: Application): AppDatabase {
        return Room.databaseBuilder(app, AppDatabase::class.java, "sebix.db").build()
    }

    @Singleton
    @Provides
    fun provideUserDao(db : AppDatabase) : UserDao {
        return db.getUserDao()
    }

    @Singleton
    @Provides
    fun respository(dao:UserDao)= Repository(dao)
}