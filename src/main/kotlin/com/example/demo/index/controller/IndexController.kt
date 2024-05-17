package com.example.demo.index.controller



import com.example.demo.index.biz.IndexBiz
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping

@Controller
class IndexController {

    @Autowired
    lateinit var indexBiz : IndexBiz

    /**@author moon
     * @see - 참고자료 ( 사이트 링크 )
     * @return
     * @param {}
     * @
     * mainPage()
     * */
    @GetMapping("/")
    fun mainPage(): String {

        /**
         * @author moon
         * @see - (naver.com)
         * */
        var a:Int = 1;

        /**
         * @author moon
         *
         * */
        var b:Int = 3;

        /**
         * @author moon
         * @see dfadf
         *
         * */
        var puls:Int =5;

        val result:Int;

        result = a + b ;

        println("controller....")
        indexBiz.get(1)
        return "index" // 메인 페이지의 뷰 이름을 반환합니다.
    }

}