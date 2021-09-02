package com.example.multipageapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.example.multipageapp.databinding.ActivityMainBinding

const val TAG ="MainActivity"
class MainActivity : AppCompatActivity() {



    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        Log.d(TAG, "onCreate: called")

        //send data to other activity
//        binding.btn.setOnClickListener {
//
//            val intent = Intent(this,SecondActivity::class.java)
//
//            intent.putExtra("name","DeveloperDays")
//
//            startActivity(intent)
//
//        }

        //set up bottom navigation component
        val navHost = supportFragmentManager.findFragmentById(binding.navHostFragment.id) as NavHostFragment

        binding.btmNav.setupWithNavController(navHost.navController)

    }


    override fun onStart() {
        super.onStart()

        Log.d(TAG, "onStart: called")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume: called")

    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause: called")

    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop: called")

    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy: called")

    }



}