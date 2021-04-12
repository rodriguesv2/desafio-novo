package br.com.rubensrodrigues.desafionovo.ui.flow.list

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import br.com.rubensrodrigues.desafionovo.data.repository.MovieRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

sealed class State {
    data class Blablabla(val blablabla: String): State()
}

sealed class Intent {
    object Blablabla: Intent()
}

@HiltViewModel
class ListViewModel @Inject constructor(
        private val repository: MovieRepository
): ViewModel() {

    private val _state = MutableLiveData<State>()
    val state: LiveData<State> = _state

    fun handleIntent(intent: Intent) {
        when(intent) {
            Intent.Blablabla -> handleBlablabla()
        }
    }

    private fun handleBlablabla() {
        viewModelScope.launch {
            val blaBlaBla = repository.getBlaBlaBla()
            _state.value = State.Blablabla(blaBlaBla)
        }
    }
}