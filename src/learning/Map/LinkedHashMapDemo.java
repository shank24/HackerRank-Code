package learning.Map;

import java.util.LinkedHashMap;

public
class LinkedHashMapDemo {
    public static
    void main (String[] args) {

        LinkedHashMap <String, String> link = new LinkedHashMap <> ( );

        link.put ( "DADA" , "PADA" );
        link.put ( "RADA" , "" );
        link.put ( "TADA" , "UADA" );
        link.put ( "UADA" , "YADA" );
        link.put ( "IADA" , "TADA" );
        link.putIfAbsent ( "IADALL" , "TADA" );

        System.out.println ( link );
        System.out.println (link.size () );

    }
}
