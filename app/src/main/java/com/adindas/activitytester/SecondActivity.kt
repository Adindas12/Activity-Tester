package com.adindas.activitytester

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast

class SecondActivity : AppCompatActivity() {
    private val TAG = SecondActivity::class.java.simpleName
    private var message : string? = null
    private var student : student? = null

    companion object {
        const val EXTRAS_MESSAGE = "EXTRAS_MESSAGE"
        const val EXTRAS_STUDENT_DATA = "EXTRAS_STUDENT_DATA"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        Log.d(TAG, "onCreate: ")
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart: ")
        getIntentData ()
        Toast.makeText(this,
            "Message : $message, sender : $(student.tostring()}", Toast.LENGTH_SHORT).show()
    }

    private fun getIntentData() {
        message = intent.getStringExtra(EXTRAS_MESSAGE)
        student = intent.getParcelableExtra(EXTRAS_STUDENT_DATA)
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume: ")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop: ")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy: ")
    }
}