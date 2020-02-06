package learning.Inheritance;

public
class Animal {

    public  Animal(){
        System.out.println ("In Animal" );
    }

    public void say(){
        System.out.println ("Animal Saying" );
    }


}

class Canine extends Animal{

    public  Canine(){
        System.out.println ("In Canine" );
    }

    public void walk(){
        System.out.println ("Canine Walking" );
    }
}

class Cat extends Canine{
    public Cat(){
        System.out.println ("In Cat");
    }

    public void run(){
        System.out.println ("Cat Running" );
    }

    public static
    void main (String[] args) {
        //Cat c1 = new Canine ();

        Canine cn = new Canine ();

        //Canine c2 =new Cat();

        //c2.say ();
        //c2.walk ();

        /*Cat c3 = new Cat ();
        c3.walk ();
        c3.say ();
        c3.run ();*/



    }

}

