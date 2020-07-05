package kr.co.tjoeun.intent_20200705

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        //따로 이벤트가 있는게 아니라, 액티비티에 오자마자 데이터 반영.

        //intent : 이 화면에 진입할때 사용한 Intent 객체
        //getStringExtra : 우리가 첨부한 데이터가 String이니 이를 뽑아내자.
        //"message" : 보내줄떄 붙여준 일므 표 (찾아낼 기준)

        val receivedMessage = intent.getStringExtra("message")

        //텍스트뷰의 text로 반영.
        messageTxt.text = receivedMessage
    }
}