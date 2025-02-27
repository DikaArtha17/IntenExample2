package Dikaartha.example.intenexam2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import Dikaartha.example.intenexam2.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val receiveData = intent.getStringExtra("main_activity_data")
        binding.textView.text = receiveData
    }
}
