package com.fcprovin.chukcheck

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.fcprovin.chukcheck.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private var mBinding : ActivityMainBinding? = null
    private val binding get() = mBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)
    }
}