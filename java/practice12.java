// import java.util.ArrayList;
// public class practice12{
//             public static void main(String[] args) {
//                 ArrayList ar = new ArrayList();
//                 ar.add("Student 1");
//                 ar.add("Student 2");
//                 ar.add("Student 3");
//                 ar.add("Student 4");
//                 ar.add("Student 5");
//                 ar.add("Student 6");
//                 ar.add("Student 7");
//                 ar.add("Student 8");
//                 ar.add("Student 9");
//                 ar.add("Student 10");
//                 for(Object o: ar){
//                     System.out.println(o);
//                 }
// }
// }


//p(2)

// import java.util.Date; // this methode is descripted by the java doc14
// class practice12 {
//     public static void main(String[] args) {
//         Date d = new Date();
//         System.out.println(d.getHours() + ":" + d.getMinutes() + ":" + d.getSeconds());
//     }
// }

//P(3)

// import java.util.Calendar;
// import java.util.Date;

// public class practice12{
//             public static void main(String[] args) {
//                 Calendar c = Calendar.getInstance();
//                 System.out.println(c.get(Calendar.HOUR_OF_DAY) + ":" + c.get(Calendar.MINUTE) + ":" + c.get(Calendar.SECOND));
// }
// }

//p(4)

// import java.time.LocalDateTime;
// import java.time.format.DateTimeFormatter;

// public class practice12{
//             public static void main(String[] args) {
//                 LocalDateTime dt = LocalDateTime.now(); // This is the date
//                 DateTimeFormatter df = DateTimeFormatter.ofPattern("H:m:s"); // This is the format
//                 String mytime = dt.format(df); // Creating date string using date and format
//                 System.out.println(mytime);
// }
// }



//p(5)

import java.util.HashSet;
class practice12 {
    public static void main(String[] args) {
        HashSet<Integer> myHashSet = new HashSet<>();
        myHashSet.add(6);
        myHashSet.add(8);
        myHashSet.add(3);
        myHashSet.add(11);
        myHashSet.add(11); // Duplicate, will not be added

        // Print the HashSet
        System.out.println(myHashSet);
    }
}
  



