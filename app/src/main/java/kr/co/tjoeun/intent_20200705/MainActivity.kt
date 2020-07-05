package kr.co.tjoeun.intent_20200705

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
    }
}