package com.example.demo.index.vo

import lombok.AllArgsConstructor
import lombok.NoArgsConstructor
import lombok.ToString

@AllArgsConstructor
@NoArgsConstructor
@ToString
data class IndexVO(
    var id: Int = 0,
    var name: String = "",
    var msurDt: String = "", // msur_dt 필드 추가
    var desc: String = "",   // desc 필드 추가
    var groupId: String = "" // group_id 필드 추가
)
