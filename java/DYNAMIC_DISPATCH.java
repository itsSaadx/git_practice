// class Phone{
//     public void showTime(){
//         System.out.println("Time is 8 am");
//     }
    
//     public void on(){
//         System.out.println("Turning on Phone...");
//     }
// }

// class SmartPhone extends Phone{
//     public void music(){
//         System.out.println("Playing music...");
//     }
//     // public void on(){
//     //     System.out.println("Turning on SmartPhone...");
//     // }
// }
// public class DYNAMIC_DISPATCH {
//     public static void main(String[] args) {

//         Phone obj = new SmartPhone(); // Yes it is allowed
//         // SmartPhone obj2 = new Phone(); // Not allowed
//         // This means obj can only access the methods and properties that are defined in the Phone class. However, if a method is overridden in the SmartPhone class, the overridden version will be executed due to runtime polymorphism.

//         obj.showTime();
//         obj.on();
//        //  obj.music(); //Not Allowed


//     }
// }
