package br.com.rubensrodrigues

object Dependencies {

    object Core {
        private const val core = "androidx.core:core-ktx:${Versions.core}"
        private const val appCompat = "androidx.appcompat:appcompat:${Versions.appCompat}"
        private const val kotlin = "org.jetbrains.kotlin:kotlin-stdlib:${Versions.kotlin}"

        val list = listOf(
                core,
                appCompat,
                kotlin
        )
    }

    object Design {
        private const val material = "com.google.android.material:material:${Versions.material}"

        val list = listOf(
                material
        )
    }

    object Test {
        private const val junit = "junit:junit:${Versions.junit}"

        val list = listOf(
                junit
        )
    }

    object AndroidTest {
        private const val junit = "androidx.test.ext:junit:${Versions.junitInstrumentation}"
        private const val espresso = "androidx.test.espresso:espresso-core:${Versions.espresso}"

        val list = listOf(
                junit,
                espresso
        )
    }
}