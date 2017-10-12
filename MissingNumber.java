/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chandantroughia
 * @date 07/02/2017
 * 
 */

//Time O(n), Space O(1)
public class MissingNumber {
    public static int missingNumber(int[] nums) {
    int sum = 0;
    for (int i = 0; i < nums.length; i++)
        sum += nums[i] - i;
    return nums.length - sum;
}
    
    public static void main(String[] args){
        int[] nums = {0,1,2,3,5};
        System.out.println(missingNumber(nums));
    }
}
