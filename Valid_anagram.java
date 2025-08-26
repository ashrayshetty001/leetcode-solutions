class Solution {
    public boolean isAnagram(String s, String t) {
        char f[]=s.toCharArray();
        char b[]=t.toCharArray();
        Arrays.sort(f);
        Arrays.sort(b);
        return Arrays.equals(f,b);
    }
}
