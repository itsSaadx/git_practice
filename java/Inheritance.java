
// class Base{
//     public int x;

//     public int getX() {
//         return x;
//     }

//     public void setX(int x) {
//         System.out.println("I am in base and setting x now");
//         this.x = x;
//     }

//     public void printMe(){
//         System.out.println("I am a constructor");
//     }
// }

// class Derived extends Base{
//     public int y;

//     public int getY() {
//         return y;
//     }

//     public void setY(int y) {
//         this.y = y;
//     }
// }

// public class Inheritance {
//     public static void main(String[] args) {
//         // Creating an Object of base class
//         Base b = new Base();
//         b.setX(4);
//         System.out.println(b.getX());

//         // Creating an object of derived class
//         Derived d = new Derived();
//         d.setY(43);
//         System.out.println(d.getY());
//     }
// }


class Base1{
    Base1(){
        System.out.println("I am a constructor");
    }
    Base1(int x){
        System.out.println("I am an overloaded constructor with value of x as: " + x);
    }
}

class Derived1 extends Base1{
    Derived1(){
        //super(0);
        System.out.println("I am a derived class constructor");
    }
    Derived1(int x, int y){
        super(x);
        System.out.println("I am an overloaded constructor of Derived with value of y as: " + y);
    }
}

class ChildOfDerived extends  Derived1{
    ChildOfDerived(){
        System.out.println("I am a child of derived constructor");
    }
    ChildOfDerived(int x, int y, int z){
        super(x, y);
        System.out.println("I am an overloaded constructor of Derived with value of z as: " + z);
    }
}
public class Inheritance {
    public static void main(String[] args) {
        // Base1 b = new Base1();
        // Derived1 d = new Derived1();
        // Derived1 d = new Derived1(14, 9);
        // ChildOfDerived cd = new ChildOfDerived();
        ChildOfDerived cd = new ChildOfDerived(12, 13, 15);
    }
}

