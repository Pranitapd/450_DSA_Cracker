package String;

public class longestPalindrome {

    public boolean checkPalindrome(String n){
        int l = n.length();
        for(int i=0; i<l/2; i++){
            if(n.charAt(i) == n.charAt(l-i-1))
                continue;
            else return false;
        }
        return true;
    }

    public String longestPalindrome(String str){
        int max = 0; String result = "";
        for(int i=0; i<str.length(); i++) {
            for (int j = str.length(); j>0; j--) {
                String sub = str.substring(i,j);
                System.out.println(sub);
                if(checkPalindrome(sub)){
                    if(sub.length() > max){
                        max = sub.length();
                        result = sub;
                        System.out.println("result: " + result);
                        break;
                    }
                }
            }
        }
        return result;
    }

    public static void main(String args[]){
        longestPalindrome l = new longestPalindrome();
        System.out.println(l.longestPalindrome("aaaabbaa"));
    }
}
