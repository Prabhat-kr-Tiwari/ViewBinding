package com.example.viewbinding

import android.app.ActivityManager.TaskDescription
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.viewbinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    var binding:ActivityMainBinding?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)
        val adapter=MainAdapter(TaskList.taskList)
        binding?.taskRv?.adapter=adapter




    }

    override fun onDestroy() {
        super.onDestroy()
        binding=null
    }
}