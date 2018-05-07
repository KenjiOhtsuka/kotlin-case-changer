package com.improve_future.case_changer

import org.junit.Assert.assertEquals
import org.junit.Test

class CaseChangerTest {
    @Test
    fun testToSnakeCase() {
        assertEquals("abc", "Abc".toSnakeCase())
        assertEquals("a_b_c", "ABC".toSnakeCase())
        assertEquals("abc_def_ghi", "AbcDefGhi".toSnakeCase())
        assertEquals("a_b_c_def_g_hi", "ABCDefGHi".toSnakeCase())
    }

    @Test
    fun testToCamelCase() {
        assertEquals("Abc", "abc".toCamelCase())
        assertEquals("ABC", "a_b_c".toCamelCase())
        assertEquals("AbcDefGhi", "abc_def_ghi".toCamelCase())
        assertEquals("ABCDefGHi", "a_b_c_def_g_hi".toCamelCase())
    }

    @Test
    fun testBeginWithUpperCase() {
        assertEquals("Abc", "abc".beginWithUpperCase())
    }

    @Test
    fun testBeginWithLowerCase() {
        assertEquals("abc", "Abc".beginWithLowerCase())
    }
}