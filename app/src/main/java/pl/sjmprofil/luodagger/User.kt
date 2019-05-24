package pl.sjmprofil.luodagger

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

@Entity(tableName = "user")
data class User(var name : String, var age : Int) {

    @PrimaryKey(autoGenerate = true)
    var id : Int? = null
}