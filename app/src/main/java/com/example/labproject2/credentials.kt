package com.example.labproject2




//
data class UserCredentials(val email: String, val password: String)
val validUserCredentials = listOf(
    UserCredentials("jackie@yahoo.com", "happy"),

)
fun isValidCredentials(email: String, password: String): Boolean {
    val user = UserCredentials(email, password)
    return validUserCredentials.any { it == user }
}
