package com.swantan.gamopedia

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform