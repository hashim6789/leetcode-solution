class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int M=0,N=0,S;


        for(int i=0;i<nums1.length-1;i++){
           for(int j=i+1;j<nums1.length;j++){
               if(nums1[i] > nums1[j]){
                   int temp = nums1[i];
                   nums1[i] = nums1[j];          
                   nums1[j] = temp;
               }
           }
        }                                                           //sorted
        for(int i=0;i<nums2.length-1;i++){
           for(int j=i+1;j<nums2.length;j++){
               if(nums2[i] > nums2[j]){
                   int temp = nums2[i];
                   nums2[i] = nums2[j];
                   nums2[j] = temp;
               }
           }
        }

        for(int i=0;i<nums1.length;i++){
            if(nums2[i] == 0){
                M++;
            }
        }   
        m= nums1.length-M;                                               //count zeroes
        for(int i=0;i<nums2.length;i++){
            if(nums1[i] == 0){
                N++;
            }
        }
         n= nums2.length-N;


        for(int i=0;i<nums1.length;i++){
            if(nums1[i] !=0){
                nums1[i-M] = nums1[i];
                nums1[i] = null;
            }
        }                                                 //zeroes are removed
        for(int i=0;i<nums2.length;i++){
            if(nums2[i] !=0){
                nums2[i-N] = nums2[i];
                nums2[i] = null;
            }
        }

        if(m>n){
            S=m;
        }else{
            S=n;
        }


        int k=0;
        for(int i=0;i<S;i++){
            while()
           if(nums1[i] > nums2[j]){
               while(nums1[k] != null){
                   k++;
               }
               while(k>=i){
                   nums1[k+1] =nums1[k];
                   k--;
               }
               nums1[i] = nums2[j];
           }
        }




}