package com.example.Routing

import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*


fun Routing.orderRouting(){

    route("/order"){
        get {
            call.respond(HttpStatusCode.OK,"Hello From Order Page")
        }
        get ("/{id}"){

            var parm=call.parameters
         //   val id = parm.entries().find { it.key == "id" }?.value?.first()
            var id=parm.entries().find { it.key=="id" }?.value!!.first()
            call.respondText(id)



        }





    }



}