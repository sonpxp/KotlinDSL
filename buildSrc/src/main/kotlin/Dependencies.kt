object Dependencies {
    /**
     * To define plugins
     */
    object BuildPlugins {
        val application by lazy { "com.android.application:${Versions.application}" }
        val android by lazy { "com.android.tools.build:gradle:${Versions.gradlePlugin}" }
        val kotlin by lazy { "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}" }
    }

    /**
     * To define dependencies
     */
    object Deps {
        val coreKtx by lazy { "androidx.core:core-ktx:${Versions.coreKtx}" }
        val appCompat by lazy { "androidx.appcompat:appcompat:${Versions.appCompat}" }
        val timber by lazy { "com.jakewharton.timber:timber:${Versions.timber}" }
        val kotlin by lazy { "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.kotlin}" }
        val materialDesign by lazy { "com.google.android.material:material:${Versions.material}" }
        val constraintLayout by lazy { "androidx.constraintlayout:constraintlayout:${Versions.constraintLayout}" }
        val junit by lazy { "junit:junit:${Versions.jUnit}" }
    }

    object AndroidX {

    }
}