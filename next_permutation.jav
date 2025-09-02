class Solution {
    public void nextPermutation(int[] arr) {
        
        // code here
        int pivot=-1,n=arr.length;
        
        //find pivot
        for(int i=n-2;i>=0;i--){
            if(arr[i]<arr[i+1]){
                pivot=i;
                break;
            }
        }
        
        //if decreasing order
        if(pivot==-1){
            reverse(arr,0,n-1);
        }
        //next greater element
        else{
            for(int i=n-1;i>=pivot;i--){
                if(arr[i]>arr[pivot]){
                    swap(arr,i,pivot);
                    break;
                }
            }
            reverse(arr,pivot+1,n-1);
        }
        
        
    }
    void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    void reverse(int[] arr,int start,int end){
        while(start<=end){
            swap(arr,start,end);
            start++;
            end--;
        }
    }
}
    
