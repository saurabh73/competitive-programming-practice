package competitive.programming.practice.platform.leetcode.problem0001;

public class DecodeString {
    public static void main(String[] args) {
        DecodeString decodeString = new DecodeString();
        System.out.println(decodeString.decodeString("3[a]2[bc]"));
        System.out.println(decodeString.decodeString("11[a]12[b]"));
        System.out.println(decodeString.decodeString("2[abc]3[cd]ef"));
    }

    public String decodeString(String s) {
        int i = 0;
        StringBuilder ans = new StringBuilder(s);
        int num =0;
        int bracketCount =0;
        int startBracketIndex = 0;
        int startIndex = 0;
        String subStr = "";
        while(i < ans.length()){
            Character ch = ans.charAt(i);
            // find number.

            if(Character.isDigit(ch) && bracketCount == 0) {
                // increase i till, it's a digit.
                startIndex=i;
                int j = i+1;
                while(Character.isDigit(ans.charAt(j))) {
                    j++;
                }
                num = Integer.parseInt(ans.substring(i, j));
                if (j-i > 1){
                    i=j-1;
                }
            }
            else if(ch == '[') {
                if (bracketCount == 0) {
                    startBracketIndex = i+1;
                }
                bracketCount++;
            }
            else if (ch== ']') {
                bracketCount--;
                if (bracketCount == 0) {
                    subStr = stringRepeater(num, ans.substring(startBracketIndex, i));
                    ans.delete(startIndex, i+1);
                    ans.insert(startIndex,subStr);
                    i=-1;
                    num =0;
                    bracketCount =0;
                    startBracketIndex = 0;
                    startIndex = 0;
                    subStr = "";
                }
            }
            i++;
        }
        return ans.toString();
    }

    private String stringRepeater(int num, String substring) {
        StringBuilder ans = new StringBuilder();
        while (num-- > 0) {
            ans.append(substring);
        }
        return ans.toString();
    }
}
