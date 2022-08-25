package com.exam.tictaetoegame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import android.widget.Toast
import com.exam.tictaetoegame.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    var userTurn= true
    private lateinit var binding: ActivityMainBinding
    var clickedBy1=0
    var clickedBy2=0
    var clickedBy3=0
    var clickedBy4=0
    var clickedBy5=0
    var clickedBy6=0
    var clickedBy7=0
    var clickedBy8=0
    var clickedBy9=0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        onClick()
    }
    //onclicklistenerforTextView
    fun onClick(){
        binding.tv1.setOnClickListener {
             clickedBy1=checkUser(binding.tv1)
        }
        binding.tv2.setOnClickListener {
            clickedBy2=checkUser(binding.tv2)
        }
        binding.tv3.setOnClickListener {
            clickedBy3=checkUser(binding.tv3)
        }
        binding.tv4.setOnClickListener {
            clickedBy4=checkUser(binding.tv4)
        }
        binding.tv5.setOnClickListener {
            clickedBy5=checkUser(binding.tv5)
        }
        binding.tv6.setOnClickListener {
             clickedBy6=checkUser(binding.tv6)
        }
        binding.tv7.setOnClickListener {
             clickedBy7=checkUser(binding.tv7)
        }
        binding.tv8.setOnClickListener {
             clickedBy8=checkUser(binding.tv8)
        }
        binding.tv9.setOnClickListener {
            clickedBy9=checkUser(binding.tv9)
        }

    }

    //use to check user turn
    fun checkUser(textchange:TextView) : Int{
        var clickedBy =0
        if (userTurn){
            textchange.text="X"
            userTurn=false
            clickedBy=1
            textchange.isClickable= false
            //Toast.makeText(this, "$clickedBy", Toast.LENGTH_SHORT).show()
        }
        else{
            textchange.text="O"
            userTurn=true
            clickedBy=2
            textchange.isClickable= false
        }
        checkWinner()
        return clickedBy

    }

    //use to check winner
    fun checkWinner(){
        //vertical
        var tv1=binding.tv1.text.toString()
        var tv2=binding.tv2.text.toString()
        var tv3=binding.tv3.text.toString()
        var tv4=binding.tv4.text.toString()
        var tv5=binding.tv5.text.toString()
        var tv6=binding.tv6.text.toString()
        var tv7=binding.tv7.text.toString()
        var tv8=binding.tv8.text.toString()
        var tv9=binding.tv9.text.toString()
        
        if (tv1 == tv4 && tv4==tv7 && tv1!="" ){
                Toast.makeText(this, "Player $tv1 Won", Toast.LENGTH_SHORT).show()
                clearText()
        }
        else if (tv2 == tv5 && tv5==tv8 && tv2!="" ){
            Toast.makeText(this, "Player $tv2 Won", Toast.LENGTH_SHORT).show()
            clearText()
        }
        else if (tv3 == tv6 && tv6==tv9 && tv3!="" ){
            Toast.makeText(this, "Player $tv3 Won", Toast.LENGTH_SHORT).show()
            clearText()
        }
        //diagonal
        else if (tv1 == tv5 && tv5==tv9 && tv1!="" ){
            Toast.makeText(this, "Player $tv1 Won", Toast.LENGTH_SHORT).show()
            clearText()

        }
        else if (tv3 == tv5 && tv5==tv7 && tv3!="" ){
            Toast.makeText(this, "Player $tv3 Won", Toast.LENGTH_SHORT).show()
            clearText()
        }
        //horizontal
        else if (tv1 == tv2 && tv2==tv3 && tv3!="" ){
            Toast.makeText(this, "Player $tv3 Won", Toast.LENGTH_SHORT).show()
            clearText()
        }
        else if (tv4 == tv5 && tv5==tv6 && tv4!="" ){
            Toast.makeText(this, "Player $tv4 Won", Toast.LENGTH_SHORT).show()
            clearText()
        }
        else if (tv7 == tv8 && tv8==tv9 && tv9!="" ){
            Toast.makeText(this, "Player $tv9 Won", Toast.LENGTH_SHORT).show()
            clearText()
        }
        else if (
            tv1!="" &&
            tv2!="" &&
            tv3!="" &&
            tv4!="" &&
            tv5!="" &&
            tv6!="" &&
            tv7!="" &&
            tv8!="" &&
            tv9!=""
                ){
            clearText()
            Toast.makeText(this, "Draw", Toast.LENGTH_SHORT).show()
        }

    }

    //Use to clear text
    fun clearText(){
        binding.tv1.text=""
        binding.tv2.text=""
        binding.tv3.text=""
        binding.tv4.text=""
        binding.tv5.text=""
        binding.tv6.text=""
        binding.tv7.text=""
        binding.tv8.text=""
        binding.tv9.text=""

        binding.tv1.isClickable=true
        binding.tv2.isClickable=true
        binding.tv3.isClickable=true
        binding.tv4.isClickable=true
        binding.tv5.isClickable=true
        binding.tv6.isClickable=true
        binding.tv7.isClickable=true
        binding.tv8.isClickable=true
        binding.tv9.isClickable=true

    }
}