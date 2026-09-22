class Solution {
    public int trailingZeroes(int n) {
        int countOf2 = 0;
        int countOf5 = 0;

        for(int i=1;i<=n;i++){
            int num = i;
            while(num%2==0){
                countOf2++;
                num = num/2;
            }
            while(num%5==0){
                countOf5++;
                num = num/5;
            }
        }
        return Math.min(countOf2,countOf5);
    }
}