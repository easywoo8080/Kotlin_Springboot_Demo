package com.example.demo.global.controller

import org.springframework.boot.web.servlet.error.ErrorController
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping

@Controller
class CustomErrorController : ErrorController {

    @GetMapping("/error")
    fun handleError(model: Model): String {
        // 에러 유형에 따라 다른 에러 페이지를 표시합니다.
        return when (getStatusCode(model)) {
            404 -> "error/404" // 404 에러 페이지
            else -> "error/500" // 기타 에러 페이지 (500 등)
        }
    }

    private fun getStatusCode(model: Model): Int? {
        return model.getAttribute("javax.servlet.error.status_code") as? Int
    }

    fun getErrorPath(): String {
        return "/error"
    }
}