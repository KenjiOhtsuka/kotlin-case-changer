package com.improve_future.case_changer

/**
 * Make first letter lower case
 *
 * ```
 * "Abc".beginWithLowerCase() // => "abc"
 * ```
 */
fun String.beginWithLowerCase(): String {
    return when (this.length) {
        0 -> ""
        1 -> this.toLowerCase()
        else -> this[0].toLowerCase() + this.substring(1)
    }
}

/**
 * Make first letter upper case
 *
 * ```
 * "abc".beginWithUpperCase() // => "Abc"
 * ```
 */
fun String.beginWithUpperCase(): String {
    return when (this.length) {
        0 -> ""
        1 -> this.toUpperCase()
        else -> this[0].toUpperCase() + this.substring(1)
    }
}

/**
 * Make snake case string to camel case
 *
 * ```
 * "a_b_c".toCamelCase() // => "ABC"
 * ```
 */
fun String.toCamelCase(): String {
    return this.split('_').map {
        it.beginWithUpperCase() } .joinToString("")
}

/**
 * Make camel case string to snake case
 *
 * ```
 * "ABC".toSnakeCase() // => "a_b_c"
 * ```
 */
fun String.toSnakeCase(): String {
    var text: String = ""
    var isFirst = true
    this.forEach {
        if (it.isUpperCase()) {
            if (isFirst) isFirst = false
            else text += "_"
            text += it.toLowerCase()
        } else {
            text += it
        }
    }
    return text
}