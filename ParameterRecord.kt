package com.example.recordparameter

import androidx.preference.PreferenceManager
import android.content.Context
import android.content.SharedPreferences

class ParameterRecord(private val Key:String,private var Initvalue:String) {
    fun GetValue():Any
    {
        return GetRecord()
    }

    fun SetValue(Value:String)
    {
        SaveRecord(Value)
    }

    private fun GetRecord():Any
    {
        var rec =  preferences.getString(Key, Initvalue) ?: ""
        return rec

    }

    private fun SaveRecord(value: String)
    {
        val editor = preferences.edit()
        editor.putString(Key,value)
        editor.apply()
    }

    companion object
    {
       lateinit var preferences: SharedPreferences
       fun SetContext(context:Context)
       {
           this.preferences = PreferenceManager.getDefaultSharedPreferences(context)
       }
    }
}
