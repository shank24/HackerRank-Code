package string.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public
class PatternFind {

    public static
    void main (String[] args) {

        String s1 = "hellofdffdhellohfdjhellokkhello";
        Pattern pattern = Pattern.compile ( "hello" );
        Matcher matcher = pattern.matcher ( s1 );

        int count=0;

        while(matcher.find ()){
            count++;
        }
        System.out.println (count );
    }
}
