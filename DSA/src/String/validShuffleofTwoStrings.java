package String;

public class validShuffleofTwoStrings {

    public boolean validShuffle(String s1 , String s2,String res){
        String n = s1.concat(s2);       //concatenating two strings so that can check chars in one loop

        if(s1.length() + s2.length() == res.length() )
            for(int i=0; i< n.length(); i++) {
                char[] arr = n.toCharArray();
                if (res.indexOf(arr[i]) != -1)       //checking if char is present by checking its index
                    continue;
                else
                    break;
            }
        else return false;
        return true;
    }

    public static void main(String args[]){
        validShuffleofTwoStrings v = new validShuffleofTwoStrings();
        System.out.println("1XY2 " + v.validShuffle("XY","12","1XY2"));
        System.out.println("Y1X2 " + v.validShuffle("XY","12","Y1X2"));
        System.out.println("1X34Y2 " + v.validShuffle("XY","12","1X34Y2"));
    }
}
