package com.example.Models

import kotlinx.serialization.Serializable

@Serializable
data class Customer(val id:String,
                   val firstName:String,
                    val lastName:String,
                     )


var cas= listOf<Customer>(
    Customer("123","zakaria","chergui"),
    Customer("5641","mohamed","ben"),
    Customer("6876","youcef","zaki"),

)









