package user

import javax.ws.rs.PathParam

class UserResouce {
    private val users = HashMap<String, User>()

    init {
        users += "Saghi" to User("Saghi", "12345", 20)
    }

    fun getUser(@PathParam("username") username: String): User? {
        return users[username]
    }
}
