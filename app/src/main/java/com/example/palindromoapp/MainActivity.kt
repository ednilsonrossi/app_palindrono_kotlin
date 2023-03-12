package com.example.palindromoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.View.OnClickListener
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.palindromoapp.model.Palindromo

class MainActivity : AppCompatActivity(), OnClickListener {

    private lateinit var button: Button
    private lateinit var output: TextView
    private lateinit var input : EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button = findViewById(R.id.btn_check);
        output = findViewById(R.id.textview_output)
        input = findViewById(R.id.edittext_sentence)
        button.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        if(v == button){
            process()
        }
    }

    fun process(){
        val objPalindromo : Palindromo = Palindromo(input.text.toString())
        var textOutput : String
        textOutput = input.text.toString()
        if(objPalindromo.isPalindromo())
            textOutput += " é "
        else
            textOutput += " não é "
        textOutput += "palíndromo."

        output.visibility = View.VISIBLE
        output.text = textOutput
    }
}