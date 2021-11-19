package com.develena.design

import com.develena.design.tm.AbstGameConnectHelper
import com.develena.design.tm.DefaultGameConnectHelper

fun main(args: Array<String>) {
    var helper: AbstGameConnectHelper = DefaultGameConnectHelper()
    helper.requestConnection("아이디/비밀번호 등 접속 정보")
}