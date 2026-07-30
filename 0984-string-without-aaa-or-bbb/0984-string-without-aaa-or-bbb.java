class Solution {
    public String strWithout3a3b(int a, int b) {
        StringBuilder sb = new StringBuilder();

        for (; a > 0 || b > 0;) {

            if (a > b) {
                if (a > 1) {
                    sb.append("aa");
                    a -= 2;
                } else {
                    sb.append("a");
                    a--;
                }

                if (b > 0) {
                    sb.append("b");
                    b--;
                }
            } 
            else if (b > a) {
                if (b > 1) {
                    sb.append("bb");
                    b -= 2;
                } else {
                    sb.append("b");
                    b--;
                }

                if (a > 0) {
                    sb.append("a");
                    a--;
                }
            } 
            else {
                if (a > 0) {
                    sb.append("a");
                    a--;
                }
                if (b > 0) {
                    sb.append("b");
                    b--;
                }
            }
        }

        return sb.toString();
    }
}