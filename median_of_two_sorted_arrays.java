class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] res=new int[(nums1.length)+(nums2.length)];
        int i=0;
        for(i=0;i<nums1.length;i++){
            res[i]=nums1[i];
        }
        for(int j=0;j<nums2.length;j++){
            res[i]=nums2[j];
            i++;
        }
        Arrays.sort(res);
        int n=res.length;
        if(n%2==0){
            return (double)(res[n/2]+res[n/2-1])/2;
        }
        else{
            return (double)res[n/2];
        }
    }
}
