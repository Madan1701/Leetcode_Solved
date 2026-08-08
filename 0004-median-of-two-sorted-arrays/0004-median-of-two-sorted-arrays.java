class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int[] result = new int[n+m];
        int i =0,j=0,k=0;
        while(i<n && j<m){
            if(nums1[i]<=nums2[j]){
                result[k++] = nums1[i++];
            }
            else{
                result[k++] = nums2[j++];
            }
        }
        while(i<n){
            result[k++] = nums1[i++];
        }
        while(j<m){
            result[k++] = nums2[j++];
        }
        
        int left = 0;
        int right = result.length-1;
        if(result.length%2!=0){
            int mid = left+(right-left)/2;
            return result[mid];
        }
        else{
            int mid = left+(right-left)/2;
            return (result[mid]+result[mid+1])/2.0;
        }
        
    }
}