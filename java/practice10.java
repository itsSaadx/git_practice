// abstract class pen {
// abstract int write(int five,int fife);
// abstract void refill(int result);

// } 

// class cello extends pen{

// int write(int five,int fife){
//     System.out.println("WRITE CONTENT ON PAPER");
//     return five + fife;
// }

// void refill(int result){
//     System.out.println("PLEASE FILL THE REFILL IN THE PEN" + "  " + result + " ML ");
// }
// }

// class practice10{
//     public static void main(String [] args){
//     cello c = new cello();
//     int res = c.write(5,5);
//     c.refill(res);
//     }
// }


//p(2)

// abstract class pen {
// abstract int write(int five,int fife);
// abstract void refill(int result);
// } 

// class fountain_pen extends pen{

// int write(int five,int fife){
//     System.out.println("WRITE CONTENT ON PAPER");
//     return five + fife;
// }

// void refill(int result){
//     System.out.println("PLEASE FILL THE REFILL IN THE PEN" + "  " + result + " ML ");
// }

// void change_nib(){
//     System.out.println("FOR CHANGE NIB PRESS 1");
// }

// }

// class practice10{
//     public static void main(String [] args){
//     fountain_pen p = new fountain_pen();
//    int res = p.write(5,5);
//     p.refill(res);
//     p.change_nib();
//     }
// }

//p(3)
// class Monkey{
//     void jump(){
//         System.out.println("Jumping...");
//     }
//     void bite(){
//         System.out.println("Biting...");
//     }
// }

// interface BasicAnimal{
//     void eat();
//     void sleep();
// }

// class Human extends Monkey implements BasicAnimal{
//     void speak(){
//         System.out.println("Hello sir!");
//     }

//     @Override
//     public void eat() {
//         System.out.println("Eating");
//     }

//     @Override
//     public void sleep() {
//         System.out.println("Sleeping");
//     }
// }


// class practice10{
//     public static void main(String[] args){
//        Human harry = new Human();
//         harry.sleep();
        
//         Monkey m1 = new Human(); // this is polymorphisem
//         m1.jump();
//         m1.bite(); 

//         BasicAnimal lovish = new Human();
//         lovish.eat();
//         lovish.sleep();
//     }
// }

//p(4)

interface tv_remote {
    void buttons();
    void main_buttons();
}

interface smart_tvremote extends tv_remote {
    void youtube_button();
    void setting_button();
}

class func_of_remote implements smart_tvremote {
    public void buttons() {
        System.out.println("BUTTONS");
    }

    public void main_buttons() {
        System.out.println("MAIN BUTTONS");
    }

    public void youtube_button() {
        System.out.println("YOUTUBE BUTTON");
    }

    public void setting_button() {
        System.out.println("SETTING BUTTON");
    }
}

public class practice10 {
    public static void main(String[] args) {
        smart_tvremote tv = new func_of_remote(); // Use a class that implements the interface
        tv.buttons();
        tv.main_buttons();
        tv.youtube_button();
        tv.setting_button();
    }
}
