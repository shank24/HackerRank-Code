package learning.InnerClasses.anonymousInnerClass;

public
class DriverManager {

    static Connection getConnection(){

        // Anonymous Inner Class
        Connection conn = new Connection(){

            @Override
            public
            void createStatement ( ) {
                System.out.println ("Anonymous Inner Classes Methods" );
            }
        };

        return conn;
    }
}
