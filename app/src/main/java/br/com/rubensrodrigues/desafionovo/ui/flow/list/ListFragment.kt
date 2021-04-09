package br.com.rubensrodrigues.desafionovo.ui.flow.list

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import br.com.rubensrodrigues.desafionovo.databinding.FragmentListBinding

class ListFragment: Fragment() {

    private lateinit var binding: FragmentListBinding

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


    }
}