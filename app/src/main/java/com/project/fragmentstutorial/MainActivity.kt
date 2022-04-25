package com.project.fragmentstutorial

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction

class MainActivity : AppCompatActivity() {
    private lateinit var firstFragmentBtn: Button;
    private lateinit var secondFragmentBtn: Button;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        firstFragmentBtn = this.findViewById(R.id.btn_fragment_1)
        secondFragmentBtn = this.findViewById(R.id.btn_fragment_2)

        firstFragmentBtn.setOnClickListener {
            replaceFragment( Fragment(R.layout.fragment_1))
        }

        secondFragmentBtn.setOnClickListener{

            replaceFragment( Fragment(R.layout.fragment_2));
        }

    }

    private fun replaceFragment(fragment: Fragment) {
        val fragmentManager : FragmentManager = supportFragmentManager;
        val fragmentTransaction : FragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.fragment_holder_frame, fragment)
        fragmentTransaction.commit()
    }
}