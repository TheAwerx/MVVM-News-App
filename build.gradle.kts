// NOTE: Do not place your application dependencies here; they belong
// in the individual module build.gradle files

buildscript {
    repositories {
        google()
        mavenCentral()
    }
    dependencies {
        classpath("com.android.tools.build:gradle:3.6.4")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.9.21")
        classpath("androidx.navigation:navigation-safe-args-gradle-plugin:2.7.6")
    }
}

allprojects {
    repositories {
        google()
        mavenCentral()

    }
}