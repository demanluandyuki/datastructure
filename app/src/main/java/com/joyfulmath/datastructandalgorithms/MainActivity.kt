package com.joyfulmath.datastructandalgorithms

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.joyfulmath.datastructandalgorithms.algorthms.MaximumSubarray
import com.joyfulmath.datastructandalgorithms.leetcode.Sn1

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        testLeetCode()
    }

    private fun testLeetCode() {
//        Sn1.sample()
        MaximumSubarray.sample()
    }
}
