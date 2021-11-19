package com.develena.design.tm

class DefaultGameConnectHelper: AbstGameConnectHelper() {

    override fun doSecurity(string: String): String {
        println("(강화된 알고리즘을 이용한)디코드")
        return string
    }

    override fun authentication(id: String, password: String): Boolean {
        println("아이디/패스워드 확인 과정")
        return true
    }

    override fun authorization(userName: String): Int {
        println("권한 확인")
        // 유저의 나이와 현재 시간을 확인하고
        // 10시가 지났다면 권한 에러로 return.
        return 0
    }

    override fun connection(info: String): String {
        println("마지막 접속 단계")
        return info;
    }


}