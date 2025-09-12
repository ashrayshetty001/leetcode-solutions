class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int pali=x;
        int num=0;
        while (pali>0){
            int n=pali%10;
            num=num*10+n;
            pali=(int)pali/10;
        }
        return num==x;
    }
}
