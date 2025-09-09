package edu.temple.classactivity

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var textView = findViewById<TextView>(R.id.TextView)
        var edittext= findViewById<EditText>(R.id.enterText)

        findViewById<Button>(R.id.clickMe).setOnClickListener {

            if (edittext.text.isEmpty()){
                textView.text = "Please try again"
            }
            else{
                textView.text = "Hello, ${edittext.text}"
                edittext.setText("")

            }
        }

    }
}