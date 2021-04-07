package br.com.rubensrodrigues

object Dependencies {

    object Classpath {
        private const val hilt = "com.google.dagger:hilt-android-gradle-plugin:${Versions.hilt}"
        private const val gradle = "com.android.tools.build:gradle:${Versions.gradle}"
        private const val kotlin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}"

        val list = listOf(
                hilt,
                gradle,
                kotlin
        )
    }

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

    object Common {
        private const val hilt = "com.google.dagger:hilt-android:${Versions.hilt}"

        val list = listOf(
                hilt
        )
    }

    object Kapt {
        private const val hilt = "com.google.dagger:hilt-android-compiler:${Versions.hilt}"

        val list = listOf(
                hilt
        )
    }

    object Design {
        private const val material = "com.google.android.material:material:${Versions.material}"

        val list = listOf(
                material
        )
    }

    object Networking {
        private const val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"
        private const val gson = "com.squareup.retrofit2:converter-gson:${Versions.retrofit}"

        val list = listOf(
                retrofit,
                gson
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