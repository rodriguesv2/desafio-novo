package br.com.rubensrodrigues.desafionovo.ui.splash

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import br.com.rubensrodrigues.desafionovo.databinding.ActivitySplashBinding
import br.com.rubensrodrigues.desafionovo.ui.flow.FlowActivity
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import org.jetbrains.anko.intentFor

class SplashActivity: AppCompatActivity() {

    private lateinit var binding: ActivitySplashBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySplashBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setTimer()
    }

    private fun setTimer() {
        lifecycleScope.launch {
            delay(DELAY)
            startActivity(
                    intentFor<FlowActivity>().addFlags(
                            Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
                    )
            )
        }
    }

    companion object {
        private const val DELAY = 2000L
    }
}