class Solution {
  public int[] intersect(int[] nums1, int[] nums2) {
      Arrays.sort(nums1);
      Arrays.sort(nums2);

      int i= 0, j= 0;
      List<Integer> result= new ArrayList<>();
      while(i< nums1.length && j< nums2.length){
          if(nums1[i]== nums2[j]){
              result.add( nums1[i] );
              i++;
              j++;
          }
          else if(nums1[i]> nums2[j])
              j++;
          else
              i++;
      }

      // conversion to desired format of output:
      int[] ans= new int[result.size()];

      i= 0;
      for(int num: result){
          ans[i++]= num;
      }

      return ans;
  }
}