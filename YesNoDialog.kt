package com.example.dialog

import android.app.Dialog
import android.content.Context
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
class YesNoDialog(context: Context,var str:String): Dialog(context){

    private lateinit var OKBtn:()->Unit
    private lateinit var CancelBtn:()->Unit
    private var OkBtn:Button?=null
    private var CalcneBtn:Button?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.dialog_yes_no)
        var mesg = findViewById<TextView>(R.id.dialog_yes_no_message)
        mesg.text = str
        OkBtn = findViewById(R.id.dialog_positive)
        OkBtn?.setOnClickListener{
            dismiss()
        }
        CalcneBtn = findViewById(R.id.dialog_negative)
        CalcneBtn?.setOnClickListener{
            dismiss()
        }
        println("create")
    }

    fun setbtnfun(okfun:()->Unit,Cancelbtn:()->Unit)
    {
        this.OKBtn = okfun
        this.CancelBtn = Cancelbtn
        println("setfun")
    }
}