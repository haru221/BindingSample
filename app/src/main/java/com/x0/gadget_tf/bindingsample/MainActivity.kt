package com.x0.gadget_tf.bindingsample

import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.x0.gadget_tf.bindingsample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val binding: ActivityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        //binding.sampleTextView.text = "Hello Binding!"
        binding.counter = 1
        binding.inputText = "sample"

        binding.sampleButton.setOnClickListener {
            //binding.sampleTextView.text = "Hello Binding!"
            binding.counter = binding.counter + 1
            Toast.makeText(this@MainActivity, binding.inputText, Toast.LENGTH_SHORT).show()
        }

    }
}
