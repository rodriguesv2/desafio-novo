package br.com.rubensrodrigues.desafionovo.data.repository

import kotlinx.coroutines.delay
import javax.inject.Inject

interface MovieRepository {
    suspend fun getBlaBlaBla(): String
}

class MovieRepositoryFake @Inject constructor(): MovieRepository {
    override suspend fun getBlaBlaBla(): String {
        delay(3000)
        return "blablabla"
    }
}