package com.example.demo.index.biz

import com.example.demo.index.frame.Biz
import com.example.demo.index.mapper.IndexMapper
import com.example.demo.index.vo.IndexVO
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional


@Service
class IndexBiz @Autowired constructor(private val dao: IndexMapper) : Biz<Int, IndexVO> {

    @Throws(Exception::class)
    override fun get(k: Int): IndexVO {
        println("get.......")

        val vo: IndexVO = dao.select(k)

        vo?.let {
            println(it.toString())
        } ?: run {
            println("vo is null")
        }

        return vo
    }

    @Throws(Exception::class)
    override fun getAll(): List<IndexVO> {
        println("getAll.......")
        return dao.selectAll()
    }
}
