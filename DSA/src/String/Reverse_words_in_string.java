package String;

public class Reverse_words_in_string {

    public String reverseWords(String s) {
        StringBuffer res = new StringBuffer();
        for(String i:s.split(" ")) {
            res.append(reverse(i));
            res.append(reverse(" "));
        }
        return String.valueOf(res).trim();
    }

    public String reverse(String s)
    {
        StringBuffer s1 = new StringBuffer(s);
        return String.valueOf(s1.reverse());
    }

    public static void main(String args[])
    {
        Reverse_words_in_string r = new Reverse_words_in_string();
        System.out.println(r.reverseWords("Let's take LeetCode contest"));
    }
}
