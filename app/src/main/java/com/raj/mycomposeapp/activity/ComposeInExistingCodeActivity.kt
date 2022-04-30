package com.raj.mycomposeapp.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.raj.mycomposeapp.fragment.NormalFragUsingComposeViewFragment
import com.raj.mycomposeapp.R

class ComposeInExistingCodeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_normal)

        supportFragmentManager
            .beginTransaction()
            .add(R.id.activity_linear, NormalFragUsingComposeViewFragment())
            .commit()
    }
}


