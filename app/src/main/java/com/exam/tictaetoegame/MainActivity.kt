package com.exam.tictaetoegame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import com.exam.tictaetoegame.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private var userTurn= true
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        onClick()
    }
    //onclicklistenerfor TextView
    private fun onClick(){
        binding.tv1.setOnClickListener {
             checkUser(binding.tv1)
        }
        binding.tv2.setOnClickListener {
            checkUser(binding.tv2)
        }
        binding.tv3.setOnClickListener {
            checkUser(binding.tv3)
        }
        binding.tv4.setOnClickListener {
            checkUser(binding.tv4)
        }
        binding.tv5.setOnClickListener {
            checkUser(binding.tv5)
        }
        binding.tv6.setOnClickListener {
             checkUser(binding.tv6)
        }
        binding.tv7.setOnClickListener {
             checkUser(binding.tv7)
        }
        binding.tv8.setOnClickListener {
             checkUser(binding.tv8)
        }
        binding.tv9.setOnClickListener {
            checkUser(binding.tv9)
        }

    }

    //used to check user turn
    private fun checkUser(textChange:TextView){
        if (userTurn){
            textChange.text="X"
            userTurn=false
            textChange.isClickable= false
            //Toast.makeText(this, "$clickedBy", Toast.LENGTH_SHORT).show()
        }
        else{
            textChange.text="O"
            userTurn=true
            textChange.isClickable= false
        }
        checkWinner()

    }

    //used to check winner
    private fun checkWinner(){

        val tv1=binding.tv1.text.toString()
        val tv2=binding.tv2.text.toString()
        val tv3=binding.tv3.text.toString()
        val tv4=binding.tv4.text.toString()
        val tv5=binding.tv5.text.toString()
        val tv6=binding.tv6.text.toString()
        val tv7=binding.tv7.text.toString()
        val tv8=binding.tv8.text.toString()
        val tv9=binding.tv9.text.toString()

        //vertical
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
        //diagonal
        else if (tv1 == tv5 && tv5==tv9 && tv1!="" ){
            Toast.makeText(this, "Player $tv1 Won", Toast.LENGTH_SHORT).show()
            clearText()

        }
        else if (tv3 == tv5 && tv5==tv7 && tv3!="" ){
            Toast.makeText(this, "Player $tv3 Won", Toast.LENGTH_SHORT).show()
            clearText()
        }
        //draw
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

    //Used to clear text
    private fun clearText(){
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