package com.example.tip

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.tip.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)

        binding.button.setOnClickListener {
            var amount = binding.editTextNumber.text
            val tipAmt = binding.radioGroup.checkedRadioButtonId
            var checked = binding.checkBox.isChecked
            if(!checked){

            }
        }
    }
}