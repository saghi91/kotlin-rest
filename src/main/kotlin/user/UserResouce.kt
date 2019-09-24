package user

import javax.ws.rs.*

class UserResouce {
    private val users = HashMap<String, User>()

    init {
        users += Pair("Saghi", User("Saghi", "123456", 20))
    }

    @GET @Path("{username}")
    fun get(@PathParam("username") username: String): User? {
        return users[username]
    }

    @POST
    fun create(user: User) {
        users += user.username to user
    }

    @PUT @Path("{username}")
    fun update(@PathParam("username") username: String, user: User) {
        users -= username
        users += user.username to user
    }

    @DELETE @Path("{username}")
    fun delete(@PathParam("username") username: String): User? {
        return users.remove(username)
    }
}
