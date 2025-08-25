class Solution {
    public boolean isalphanumeric(char ch){
            if((ch>='0' && ch<='9') || (Character.toLowerCase(ch)>='a' && Character.toLowerCase(ch)<='z')){
                return true;
            }
            else{
                return false;
            }
        }
    public boolean isPalindrome(String s) {
        
         
        int st=0,end=s.length()-1;
        while(st<end){
            if(!isalphanumeric(s.charAt(st))){
                st++;continue;
            }
            if(!isalphanumeric(s.charAt(end))){
                end--;continue;
            }
            if(Character.toLowerCase(s.charAt(st))!=Character.toLowerCase(s.charAt(end))){
                return false;
            }
            st++;
            end--;
        }
        return true;
    }
}
