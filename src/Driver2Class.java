import java.util.ArrayList;

public class Driver2Class {

    public static void main(String args[]){
        String s="fun";
        System.out.println(Driver2Class.subString("fun"));

    }
    public static   ArrayList<String> subString(String s) {
        ArrayList<String> strings = new ArrayList<String>();
        for(int i=0;i<s.length();i++) {

            for (int j = i; j<s.length(); j++) {
                strings.add(s.substring(i,j+1));
            }

        }
        return strings;

    }

}
