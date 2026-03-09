// class Employee { // private modifire

//     private int id;
//     private  String name;

// }

// public  class getter_setter {
//     public static void main(String[] args) {
//         Employee emp1 = new Employee();
//         emp1.id = 3;
//         emp1.name = "Shubham";

//     }
// }

// class Employee {

//     private int id;
//     private  String name;

//     public String getName(){
//         return name;
//     }
//     public void setName(String n){
//         name = n;
//     }
//     public void setId(int i){
//         id = i;
//     }
//     public int getId(){
//         return id;
//     }
// }

// public  class CWH {
//     public static void main(String[] args) {
//         Employee emp1 = new Employee();

//         emp1.setName("Shubham");
//         System.out.println(emp1.getName());
//         emp1.setId(1);
//         System.out.println(emp1.getId());

//     }
// }

class Circule {

    private double pi;
    private  int radius;

    public double get_pi(){
        return pi;
    }
    public void set_pi(double n){
        pi = n; 
    }
    public void set_rad(int i){
        radius = i;
    }
    public int get_rad(){
        return radius;
    }

   public double area_circule(double p, int r){
    return p*(r*r);
   }
}

public  class getter_setter {
    public static void main(String[] args) {
        Circule  cir = new Circule();

        cir.set_pi(3.14);
        System.out.println("the value of pi is: " + cir.get_pi());
        cir.set_rad(3);
        System.out.println("the value of radius is: " + cir.get_rad());
        System.out.println("the area of circule is: " + cir.area_circule(3.14,4));
    
    }
}

