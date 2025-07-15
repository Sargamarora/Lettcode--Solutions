//problem : https://leetcode.com/problems/two-sum/description/?envType=problem-list-v2&envId=array
//Difficulty : Easy
//Topic : Arrays
//BRUTE FORCE APPROACH 
   class Solution {
    public int[] twoSum(int[] nums, int target) {
      
        
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};
        
    }
    
} 

// OPTIMAL SOLUTION
import java.util.*;
class Solution {
    public int[] twoSum(int[] nums, int target) {
       int [] copy = Arrays.copyOf(nums,nums.length);
       Arrays.sort(nums);
       int i = 0 ;
       int j = nums.length-1;
       int first=-1;
       int second =-1;
       int a = -1;
        int b=-1;
       while(i<j){
        int sum = nums[i]+nums[j];
        if(sum==target){
            first=nums[i];
            second=nums[j];
            break;
        }
        else if( sum<target){
            i++;
        }
        else if(sum>target){
            j--;
        }
       }
        
        for( int k = 0 ; k<copy.length;k++){
            if(a==-1 && copy[k]==first){
                a=k;
            }
            else if(b==-1 && copy[k]==second){
                b=k;
            }
        }
       
       return new int[]{a,b};
    }
}
      
