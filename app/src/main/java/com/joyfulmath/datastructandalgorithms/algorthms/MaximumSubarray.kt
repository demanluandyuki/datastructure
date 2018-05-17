package com.joyfulmath.datastructandalgorithms.algorthms

import com.joyfulmath.datastructandalgorithms.utils.TraceLog

/**
 * leetcode 53
 */
class MaximumSubarray {

    companion object {
        fun maxSubArray(nums: IntArray): Int {
            return maxSumRec(nums, 0, nums.lastIndex)
        }

        /**
         * 分治思想，先获得左边最大值。右边最大值，还有一种是中间值是最大值。
         */
        fun maxSumRec(nums: IntArray, left: Int, right: Int): Int {

            if (left == right) {
                return when {
                    nums[left] > 0 -> nums[left]
                    else -> 0
                }
            }

            var center = (left + right) / 2
            var maxLeftSum = maxSumRec(nums, left, center)
            var maxRightSum = maxSumRec(nums, center + 1, right)

            var maxLeftBorderSum = Int.MIN_VALUE
            var leftBorderSum = Int.MIN_VALUE
            for (i in center downTo left) {
                leftBorderSum += nums[i]
                if (leftBorderSum > maxLeftBorderSum) {
                    maxLeftBorderSum = leftBorderSum
                }
            }

            var maxRightBorderSum = Int.MIN_VALUE
            var rightBorderSum = Int.MIN_VALUE
            for (i in (center + 1)..right) {
                rightBorderSum += nums[i]
                if (rightBorderSum > maxRightBorderSum) {
                    maxRightBorderSum = rightBorderSum
                }
            }
//            TraceLog.i("maxLeftSum:$maxLeftSum,maxRightSum:$maxRightSum,maxLeftBorderSum + maxRightBorderSum:${maxLeftBorderSum + maxRightBorderSum}")
            return Math.max(Math.max(maxLeftSum, maxRightSum), maxLeftBorderSum + maxRightBorderSum)
        }

        fun sample(){
            TraceLog.i()
            var numArray:IntArray = intArrayOf(1,2,3,-2,10,-5,12,11,3,-8,18)
            TraceLog.i("${maxSubArray(numArray)}")
        }
    }


}