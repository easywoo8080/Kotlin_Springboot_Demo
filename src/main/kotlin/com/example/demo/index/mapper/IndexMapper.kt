package com.example.demo.index.mapper

import com.example.demo.index.vo.IndexVO
import org.apache.ibatis.annotations.Mapper
import org.springframework.stereotype.Repository

@Repository
@Mapper
interface IndexMapper {
    @Throws(Exception::class)
    fun select(id: Int): IndexVO

    @Throws(Exception::class)
    fun selectAll()

}

