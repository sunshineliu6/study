public class LeetCode28 {
    public int strStr(String haystack, String needle){
        int nlength = needle.length();
        int hlength = haystack.length();
        if(nlength == 0) return 0;
        int ps = 0;
        while (ps < hlength - nlength + 1){
            while (ps < hlength - nlength + 1 && haystack.charAt(ps) != needle.charAt(0)){
                ps++;
            }
            int pn = 0;
            int num = 0;
            while (ps < hlength && pn <nlength && haystack.charAt(ps) == needle.charAt(pn)){
                ps++;
                pn++;
                num++;
            }
            if(num == nlength) return ps - nlength ;
            ps=ps-num+1;
        }
        System.out.println();
    return -1;
    }

}
