package br.com.rubensrodrigues.desafionovo.di

import br.com.rubensrodrigues.desafionovo.data.repository.MovieRepository
import br.com.rubensrodrigues.desafionovo.data.repository.MovieRepositoryFake
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

@Module
@InstallIn(ViewModelComponent::class)
interface ApiModule {

    @Binds
    fun providesMovieRepository(repository: MovieRepositoryFake): MovieRepository
}