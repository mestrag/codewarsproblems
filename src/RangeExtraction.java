public class RangeExtraction {
    public static String rangeExtraction(int[] s) {
        int[] s1= new int[] {-6,-3,-2,-1,0,1,3,4,5,7,8,9,10,11,14,15,17,18,19,20};
        int[] s2 = new int[s.length];
        for(int i=0;i<s.length;i++){
            for(int j=i+1;j<i;j++){
                if(s[i]-s[j]==1){

                }
                else {
                    s2[i]=s[i];
                }
            }
        }
        return null;
    }
}
