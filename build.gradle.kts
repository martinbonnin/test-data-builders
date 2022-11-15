plugins {
  id("org.jetbrains.kotlin.jvm").version("1.7.20").apply(false)
  id("com.apollographql.apollo3").version("3.7.0").apply(false)
}

allprojects {
  repositories {
    mavenCentral()
  }
}