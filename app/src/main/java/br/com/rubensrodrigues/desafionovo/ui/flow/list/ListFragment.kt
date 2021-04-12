package br.com.rubensrodrigues.desafionovo.ui.flow.list

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModelProvider
import br.com.rubensrodrigues.desafionovo.databinding.FragmentListBinding
import dagger.hilt.android.AndroidEntryPoint
import org.jetbrains.anko.support.v4.toast

@AndroidEntryPoint
class ListFragment: Fragment() {

    private lateinit var binding: FragmentListBinding
    private val viewModel: ListViewModel by viewModels()

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View {
        binding = FragmentListBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(
                view,
                savedInstanceState
        )


        setObservers()
        viewModel.handleIntent(Intent.Blablabla)
    }

    private fun setObservers() {
        viewModel.state.observe(viewLifecycleOwner) { state ->
            when(state) {
                is State.Blablabla -> updateBlablabla(state.blablabla)
            }
        }
    }

    private fun updateBlablabla(blablabla: String) {
        toast(blablabla)
    }
}