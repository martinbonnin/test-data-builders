plugins {
  id("org.jetbrains.kotlin.jvm")
  id("com.apollographql.apollo3")
}

apollo {
  packageName.set("com.example.schema")
  generateApolloMetadata.set(true)
  generateDataBuilders.set(true)
  alwaysGenerateTypesMatching.set(listOf(".*"))
}

dependencies {
  implementation("com.apollographql.apollo3:apollo-api")
}