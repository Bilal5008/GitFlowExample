package com.example.gitflowexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Feature is done for this branch
        // Bug fixes ins done for this release branch
        // hot fixes done with master branch
        // New hot fixes

    }
}