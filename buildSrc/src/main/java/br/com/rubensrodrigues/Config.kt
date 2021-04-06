package br.com.rubensrodrigues

object Config {

    object AppVersion {

        private const val PATCH = 1
        private const val MINOR = 0
        private const val MAJOR = 0

        const val versionCode = MAJOR * 1000000 + MINOR * 1000 + PATCH
        const val versionName = "$MAJOR.$MINOR.$PATCH"
    }

    object SdkVersions {
        const val compileSdk = 30
        const val buildToolsVersion = "30.0.3"

        const val minSdk = 21
        const val targetSdk = 30
    }
}