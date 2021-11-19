package com.develena.design.tm

// open으로 선언해줘야 상속 가능함.
open abstract class AbstGameConnectHelper {

    // protected : 외부에서 호출 금지
    // open : 재정의 하게 함.
    protected open abstract fun doSecurity(string:String):String

    protected open abstract fun authentication(id:String,password:String):Boolean

    protected open abstract fun authorization(userName:String):Int

    protected open abstract fun connection(info:String):String

    // Template Method
    fun requestConnection(encodedInfo:String):String {
        // 보안  -> 암호화 된 문자열을 복호화
        var decodedInfo: String = doSecurity(encodedInfo);
        // 인증 과정 : 복호화된 문자열을 가지고 아이디, 암호를 할당.
        var id:String = "aaa";
        var password:String  = "bbb";
        if(!authentication(id, password)){
            throw Error("아이디 패스워드 불일치");
        }
        var userName:String = "develena";
        var i:Int = authorization(userName);
        // switch-case to when
        when (i) {
            -1 ->  throw Error("셧다운")
            0 -> print("게임 매니저")
            1 -> print("유료 회원")
            2 -> print("무료 회원")
            3 -> print("권한 없음")
            else -> print("기타") }

        return connection(decodedInfo);

    }

}