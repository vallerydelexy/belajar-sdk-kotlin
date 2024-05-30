package com.example.lib_count

import android.content.Context
import android.widget.Toast


object ToasterMessage {
    fun s(c: Context?, message: String?) {
        Toast.makeText(c, message, Toast.LENGTH_SHORT).show()
    }
}