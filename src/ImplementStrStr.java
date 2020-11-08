class ImplementStrStr {
    // easy: 28. Implement strStr()
    public static int strStr(String haystack, String needle) {

        char[] hS = haystack.toCharArray();
        char[] nS = needle.toCharArray();

        if(haystack.equals("") && needle.equals("")){
            return 0;
        }

        for(int i = 0; i < hS.length; i++){
            boolean res = true;

            for(int j = 0; j < nS.length; j++){
                if(i + j >= hS.length){
                    res = false;
                    break;
                }
                if(nS[j] != hS[i + j]){
                    res = false;
                    break;
                }
            }

            if(res){
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

       int res = strStr("helco", "lca");
       System.out.println(res);
    }
}