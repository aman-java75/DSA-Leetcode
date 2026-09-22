class Solution {
    public int trailingZeroes(int n) {
        int count = 0;
        int i = 5;
        while(i<=n){
            count = count + n/i;
            i = i*5;
        }
        return count;
    }
}