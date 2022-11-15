plugins {
  id("org.jetbrains.kotlin.jvm")
  id("com.apollographql.apollo3")
}

apollo {
  packageName.set("com.example.feature1")
  generateDataBuilders.set(true)
}

dependencies {
  implementation(project(":schema"))
  implementation("com.apollographql.apollo3:apollo-runtime")
  apolloMetadata(project(":schema"))
}