package org.example.greeting

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform