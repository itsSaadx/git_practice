// class cell_phone {
// void ring(){
//     System.out.println("RINGING.....");
// }

// void vibrate(){
//     System.out.println("VIBERATING.....");
// }

// }

// public class practice7{
//     public static void main(String[] args) {
//     cell_phone apple = new cell_phone();
//     apple.ring();
//     apple.vibrate();
// }
// }

//p(2)

// class Square {
//     int square(int a) {
//         return (a * a);
//     }

    
//     int perimeter(int a) {
//         return (4 * a);
//     }
// }

// public class practice7 {
//     public static void main(String[] args) {
//         Square sq = new Square();

//         System.out.println("Area of square: " + sq.square(4));
//         System.out.println("Perimeter of square: " + sq.perimeter(3));
//     }
// }

//p(3)
class Rectangle {

    int area(int w, int l) {
        return (w * l);
    }


    int perimeter(int l, int w) {
        return 2 * (l + w);
    }
}

public class practice7 {
    public static void main(String[] args) {

        Rectangle rec = new Rectangle();


        System.out.println("Area of rectangle: " + rec.area(4, 3));
        System.out.println("Perimeter of rectangle: " + rec.perimeter(3, 3));
    }
}
