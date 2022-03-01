package com.example.Routing

import com.example.Models.Customer
import com.example.Models.cas
import io.ktor.http.*

import io.ktor.server.application.*
import io.ktor.server.request.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import org.litote.kmongo.KMongo
import org.litote.kmongo.getCollection


fun Routing.customerrout(){
    val client = KMongo.createClient()
    route("/customer"){
        get {
           // call.respond("Hello Customers ")
            call.respondRedirect("/order", permanent = true)
        }


        get ("/{id}"){

            var id=call.parameters["id"]!!.toInt()
            val customer = id
            call.respond(customer)





        }



        post {request ->
            val user = Customer("123",
                "zaki",
                "chergui")
            client.getDatabase("Users")
                .getCollection<Customer>("Customer")
                .insertOne(user)
            call.respond(HttpStatusCode.OK)
        }
    }

    }



