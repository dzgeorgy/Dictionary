package dependencies

object Dependencies {

    private const val path = "../commonFiles/gradleScript/"
    const val common = "${path}common.gradle"

    const val dependency = "./dependencies.gradle"

    object Module {
        const val domain = ":domain"
    }

    object Compose {
        const val ui = "androidx.compose.ui:ui:${Version.compose}"
        const val material = "androidx.compose.material:material:${Version.compose}"
        const val tooling = "androidx.compose.ui:ui-tooling:${Version.compose}"
        const val test = "androidx.compose.ui:ui-test-junit4:${Version.compose}"
    }

    object Core {
        const val core = "androidx.core:core-ktx:${Version.core}"
    }

    object AppCompat {
        const val appcompat = "androidx.appcompat:appcompat:${Version.appcompat}"
    }

    object Lifecycle {
        const val viewModel = "androidx.lifecycle:lifecycle-viewmodel-ktx:${Version.lifecycle}"
        const val livedata = "androidx.lifecycle:lifecycle-livedata-ktx:${Version.lifecycle}"
    }

    object Activity {
        const val compose = "androidx.activity:activity-compose:${Version.activity}"
    }

    object Paging {
        const val common = "androidx.paging:paging-common:${Version.paging}"
    }

    object Test {
        const val junit = "junit:junit:${Version.junit}"
        const val androidTest = "androidx.test.ext:junit:${Version.androidTest}"
    }

}
