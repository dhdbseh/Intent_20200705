package kr.co.tjoeun.intent_20200705

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_edit_nick_name.*

class EditNickNameActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_nick_name)

        //완료 버튼을 눌러야 완료.
        okBtn.setOnClickListener {
            //새 닉네임이 뭔지 값으로 저장.
             val newNicName = newNickNameEdt.text.toString()

            //복귀에 사용할 Intent (결과를 담기위한 용도)
            //출발지 / 목적지 기재 x
            val resultIntent = Intent()

            //입력한 값을 결과용 Intent에 첨부
            resultIntent.putExtra("nick", newNicName)

            //이 화면의 최종 결과가 -> OK를 눌렀다 + resultIntent 데이터라고 명시
            setResult(Activity.RESULT_OK, resultIntent)

            //기존 화면으로 복귀
            finish()
        }
    }
}