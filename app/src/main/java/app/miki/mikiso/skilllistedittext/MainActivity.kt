package app.miki.mikiso.skilllistedittext

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
            //入力したテキストを取得
            if (editText.text != null){
                //取得したテキストをTextViewに反映する
                textView.text = editText.text.toString()
            }
        }
    }
}