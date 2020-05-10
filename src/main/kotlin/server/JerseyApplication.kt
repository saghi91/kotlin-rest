package server

import user.UserResouce
import javax.ws.rs.core.Application

class JerseyApplication: Application() {
    override fun getSingletons(): MutableSet<Any> {
        return mutableSetOf(UserResouce())
    }
}
