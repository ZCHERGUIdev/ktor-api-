package com.example.plugins

import com.example.Routing.customerrout
import com.example.Routing.orderRouting
import io.ktor.server.routing.*
import io.ktor.http.*
import io.ktor.server.http.content.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.request.*

fun Application.configureRouting() {




    routing {

        customerrout()
        orderRouting()
        get("/") {
            call.respondText("Hello From Ktor!")
        }
         get("/home") {
            call.respondText("Hello from home")
        }
        // Static plugin. Try to access `/static/index.html`
        static("/static") {
            resources("static")
        }
    }
}
