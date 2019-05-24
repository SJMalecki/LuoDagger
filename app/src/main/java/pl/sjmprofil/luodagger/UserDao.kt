package pl.sjmprofil.luodagger

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Insert
import android.arch.persistence.room.Query

@Dao
interface UserDao {

    @Query("SELECT * FROM user")
    fun getAll(): MutableList<User>

    @Insert
    fun addUser(user : User)
}