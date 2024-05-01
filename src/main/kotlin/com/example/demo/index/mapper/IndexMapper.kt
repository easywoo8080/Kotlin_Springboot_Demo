package com.example.demo.index.mapper

import org.apache.ibatis.annotations.Mapper
import org.springframework.stereotype.Repository

//@Repository
//@Mapper
interface IndexMapper {
    fun getData(): List<String>
}