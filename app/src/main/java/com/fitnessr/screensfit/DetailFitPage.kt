package com.fitnessr.screensfit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.fitnessr.adapterfitnessr.FitnessrAdapter
import com.fitnessr.databinding.ActivityDetailFitPageBinding

class DetailFitPage : AppCompatActivity() {
    private lateinit var binding : ActivityDetailFitPageBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailFitPageBinding.inflate(layoutInflater)
        setContentView(binding.root)
        getFitData()
    }

    private fun getFitData() = with(binding){
      val desc = intent.getStringExtra(FitnessrAdapter.DESC)
      val title = intent.getStringExtra(FitnessrAdapter.TITLE)


        tvFit.text = title.toString()
        textDesc.text = desc.toString()

        fbBack.setOnClickListener {
            finish()
        }
    }
}