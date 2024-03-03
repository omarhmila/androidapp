package com.example.test1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import android.widget.Button


public class MainActivity : AppCompatActivity() {
    private lateinit var taille: EditText;
    private lateinit var poid: EditText;
    private lateinit var btn: Button;
    private lateinit var result: TextView;

protected override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        taille =  findViewById<EditText>(R.id.taille)
    poid = findViewById<EditText>(R.id.poid)
    btn = findViewById<Button>(R.id.btn)
    result = findViewById<TextView>(R.id.result)
    btn.setOnClickListener{


            val t: Double = taille.text.toString().toDouble()
            val p: Double = poid.text.toString().toDouble()
            val r: Double = p / (t * t)
            var res: String = ""
            if (r>=40){
                res= "Obésité morbide ou massive";
            }else if(r<40&& r>=35 ){
                res = "Obésité sévère";

            }else if (r<35&& r >=30){
                res = "Obésité modérée";
            }else if (r<33 && r>=25){
                res = "Surpoids";

            }else if (r<25 && r>=18.5){
                res = "Corpulence normale";

            }else if (r<18.5 && r>=16.5){
                res = "Maigreur";


        }
            else {
                res = "Famine"
            }
            result.text = res
    }

    }
}