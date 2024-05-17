package com.example.demo.index.frame

import jakarta.transaction.Transactional
import kotlin.jvm.Throws

interface Biz<K, V> {
    @Transactional
    @Throws(Exception::class)
    fun get(k: K): V

    @Throws(Exception::class)
    fun getAll() : List<V>

}
