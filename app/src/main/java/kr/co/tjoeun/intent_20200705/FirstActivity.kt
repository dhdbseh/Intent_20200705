package kr.co.tjoeun.intent_20200705

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_first.*

class FirstActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)

        moveToBackBtn.setOnClickListener {

            //val myIntent = Intent( this, MainActivity :: class.java)
            //startActivity(myIntent)

            //지금 보는 액티비티를 종료 => 이전 화면으로 돌아감
            finish()
        }
    }
}