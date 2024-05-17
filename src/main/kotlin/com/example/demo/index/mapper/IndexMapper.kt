package com.example.demo.index.mapper

import com.example.demo.index.vo.IndexVO
import lombok.RequiredArgsConstructor
import org.apache.ibatis.annotations.Mapper
import org.springframework.stereotype.Repository


@Repository
@Mapper
interface IndexMapper {
    fun select(id: Int): IndexVO

    fun selectAll(): List<IndexVO>
}


