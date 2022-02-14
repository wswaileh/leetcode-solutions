import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] vector, int target) {
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>(); 
        for (int i=0;i<vector.length;i++){
            if (map.containsKey(target - vector[i]) && 
               i != map.get(target - vector[i])) {
                return new int[]{map.get(target - vector[i]), i};
            } 
            map.put(vector[i], i);
        }
        return new int[2];
    }
}