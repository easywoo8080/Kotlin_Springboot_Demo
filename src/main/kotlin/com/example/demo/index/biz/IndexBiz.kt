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
        return dao.select(k)
    }

    @Throws(Exception::class)
    override fun get() {
        TODO("Not yet implemented")
        return dao.selectAll()
    }


}
