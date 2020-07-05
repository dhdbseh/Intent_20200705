package kr.co.tjoeun.intent_20200705

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        moveToFirstBtn.setOnClickListener {
            
            //비행기 티켓 발권 (출발 / 도착)
            val myIntent = Intent(this, FirstActivity::class.java)
            //실제로 출발하기
            startActivity(myIntent)
         }
        //두번쨰 화면 버튼 누르면

        sendToSecondBtn.setOnClickListener {

            //입력한 메세지 받아오기

             val inputMessage = messageEdt.text.toString()

            //두번째 화면으로 이동하기
            val myIntent = Intent(this,SecondActivity::class.java)

            //myIntent에 데이터 붙여주기

            myIntent.putExtra("message", inputMessage)

            startActivity(myIntent)
        }

        //닉네임 변경 버튼을 누르면
        changeNicBtn.setOnClickListener{

            //닉네임 변경 화면으로 가야함.Intent

            val myIntent = Intent(this, EditNickNameActivity::class.java)

            //화면으로 이동 -> 단순 조회 이동 X
            //데이터 받으러 (결과를 얻으러) 가는 이동 -> 뭘 받으러 가는지 명시.
            //받을 데이터 (요청) 구별 고유 숫자 : requestCode

            //어떤 결과? -> 새 닉네임을 얻으러.(1000 : 새 닉네임)
            startActivityForResult(myIntent, 1000)
        }


    }

    // MainActivity로 복귀하는 모든 시점에 실행되는 함수.
    // Ex. 닉네임을 받으러 갔다 -> OK로 돌아와도 실행
    // Ex. 닉네임을 받으러 갔다 -> 취소로 돌아와도 실행
    // Ex. 비번을 변경하러 갔다가 -> OK로 돌아와도 실행.
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

    //어떤 걸 가지러 다녀온건지 확인 ( 닉네임 인지)
        if (requestCode == 1000){

            //완료를 누른게 맞는지
            if (resultCode == Activity.RESULT_OK) {

                //결과로 받아온 닉네임을 텍스트뷰에 적용
                val newNickName = data?.getStringExtra("nick")

                nickNameTxt.text = newNickName
            }
        }
    }

}