package br.com.rubensrodrigues

object Dependencies {

    object Classpath {
        private const val hilt = "com.google.dagger:hilt-android-gradle-plugin:${Versions.hilt}"
        private const val gradle = "com.android.tools.build:gradle:${Versions.gradle}"
        private const val kotlin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}"
        private const val navigation = "androidx.navigation:navigation-safe-args-gradle-plugin:${Versions.navigation}"

        val list = listOf(
                hilt,
                gradle,
                kotlin,
                navigation
        )
    }

    object Core {
        private const val core = "androidx.core:core-ktx:${Versions.core}"
        private const val appCompat = "androidx.appcompat:appcompat:${Versions.appCompat}"
        private const val kotlin = "org.jetbrains.kotlin:kotlin-stdlib:${Versions.kotlin}"
        private const val multidex = "androidx.multidex:multidex:${Versions.multidex}"

        val list = listOf(
                core,
                appCompat,
                kotlin,
                multidex
        )
    }

    object Common {
        private const val hilt = "com.google.dagger:hilt-android:${Versions.hilt}"
        private const val lifecycleExtensions = "androidx.lifecycle:lifecycle-extensions:${Versions.lifecycle}"
        private const val lifecycleViewModel = "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.lifecycle}"
        private const val lifecycleLivedata = "androidx.lifecycle:lifecycle-livedata-ktx:${Versions.lifecycle}"
        private const val navigation = "androidx.navigation:navigation-fragment-ktx:${Versions.navigation}"
        private const val navigationUi = "androidx.navigation:navigation-ui-ktx:${Versions.navigation}"
        private const val coroutines = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.coroutines}"
        private const val glide = "com.github.bumptech.glide:glide:${Versions.glide}"
        private const val anko = "org.jetbrains.anko:anko:${Versions.anko}"

        val list = listOf(
                hilt,
                lifecycleExtensions,
                lifecycleViewModel,
                lifecycleLivedata,
                navigation,
                navigationUi,
                coroutines,
                glide,
                anko
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
        private const val okHttp = "com.squareup.okhttp3:logging-interceptor:${Versions.okHttp}"

        val list = listOf(
                retrofit,
                gson,
                okHttp
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