package pl.sjmprofil.luodagger

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Repository(private val dao: UserDao) {


    suspend fun getAllLocalJokes(): MutableList<User> = withContext(Dispatchers.IO) {
        dao.getAll()
    }

    suspend fun addLocalJoke(user: User) = withContext(Dispatchers.IO) {
        dao.addUser(user)
    }

}