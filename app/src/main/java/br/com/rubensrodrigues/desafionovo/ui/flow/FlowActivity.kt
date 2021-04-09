package br.com.rubensrodrigues.desafionovo.ui.flow

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import br.com.rubensrodrigues.desafionovo.databinding.ActivityFlowBinding

class FlowActivity: AppCompatActivity() {

    private lateinit var binding: ActivityFlowBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityFlowBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}