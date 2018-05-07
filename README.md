# Kotlin Case Changer

Extension methods to make String to snake/camel case.

[![CircleCI](https://circleci.com/gh/KenjiOhtsuka/kotlin-case-changer/tree/master.svg?style=svg)](https://circleci.com/gh/KenjiOhtsuka/kotlin-case-changer/tree/master) [![](https://jitpack.io/v/KenjiOhtsuka/kotlin-case-changer.svg)](https://jitpack.io/#KenjiOhtsuka/kotlin-case-changer)

[![Twitter Follow](https://img.shields.io/twitter/follow/escamilloIII.svg?style=social)](https://twitter.com/escamilloIII)

## Usage

```kotlin
"ABC".toSnakeCase() // => "a_b_c"
"a_b_c".toCamelCase() // => "ABC"
"abc".beginWithUpperCase() // => "Abc"
"Abc".beginWithLowerCase() // => "abc"
```

## Install

```groovy
repositories {
  maven { url 'https://jitpack.io' }
}
dependencies {
  compile 'com.github.KenjiOhtsuka:kotlin-case-changer:0.1.0'
}
```