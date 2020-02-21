package learning.collections.sortingObjects;

public
class Employee implements Comparable<Employee> {
    int id;
    String name;

    Employee(int id,String name){
        this.id=id;
        this.name=name;
    }


    @Override
    public
    int compareTo (Employee o) {

        // Here id1 is the one which is invoking compareTo Method
        // id2 is the ID which is being passed as o
        int id1=this.id;
        int id2=o.id;

        if(id1<id2){
            return -1;
        }
        else if(id1>id2){
            return 1;
        }
        else{
            return 0;
        }

    }
}
