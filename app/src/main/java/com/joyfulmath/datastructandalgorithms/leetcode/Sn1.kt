package com.joyfulmath.datastructandalgorithms.leetcode

import com.joyfulmath.datastructandalgorithms.utils.TraceLog

/**
 * Created by deman.lu on 2018/4/25 0025.
 */
class Sn1 {
    companion object {
        @JvmStatic
        fun twoSum(nums: IntArray, target: Int): IntArray {
            var list:MutableList<Int> = mutableListOf()
            var i = 0;
            var j = 0;
            for (i in 0 until nums.size){
                for(j in i+1 until nums.size){
                    if(attachTarget(nums[i],nums[j],target)){
                        list.add(i)
                        list.add(j)
                        break
                    }
                }
            }
            return list.toIntArray()
        }

        @JvmStatic
        fun attachTarget(a:Int,b:Int,target: Int):Boolean{
            return (a+b) == target
        }

        @JvmStatic
        fun sample(){
            var target = 9
            var nums = intArrayOf(2,3,5,7,8,6,10)
            var intArray = twoSum(nums,target)
            intArray.forEachIndexed {_,value->
                TraceLog.i("index:$value,value:${nums[value]}")
            }
        }
    }



}