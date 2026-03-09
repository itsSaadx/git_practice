// import java.time.*;
// public class TIME extends Thread{
//     public static void main(String[] args) {
//         Clock cl = Clock.systemDefaultZone();
//         System.out.println(cl.getZone());
//     }
// }


// import java.time.LocalDateTime;
// import java.time.format.DateTimeFormatter;

// public class TIME extends Thread{
//             public static void main(String[] args) {

//                         LocalDateTime dt = LocalDateTime.now();
//                         System.out.println("The current date is : " + dt);

//                         DateTimeFormatter df = DateTimeFormatter.ofPattern("dd.MM.yyyy"); // This is the format

//                         String myDate = dt.format(df); // Creating date string using date and format
//                         System.out.println("Date after formattin : "+ myDate);

//                     }
// }


// import java.time.LocalDateTime;
// import java.time.format.DateTimeFormatter;

// public class TIME extends Thread{
//             public static void main(String[] args) {

//                         LocalDateTime dt = LocalDateTime.now();

//                           DateTimeFormatter df = DateTimeFormatter.ISO_LOCAL_DATE;// Formatting the date in the ISO format

//                         String myDate = dt.format(df); // Creating date string using date and format
//                         System.out.println("Date in ISO format : "+ myDate);

//                     }
// }



// import java.time.LocalDateTime;
// import java.time.format.DateTimeFormatter;

// public class TIME extends Thread{
//             public static void main(String[] args) {

//                         LocalDateTime dt = LocalDateTime.now();

//                         DateTimeFormatter df = DateTimeFormatter.ISO_ORDINAL_DATE;

//                         String myDate = dt.format(df);
//                         System.out.println("Date in ISO_WEEK_DATE Format  : "+ myDate);

//                     }
// }



import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TIME {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.now(); // This is the date
        System.out.println(dt);

        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy -- E H:m a"); // This is the format
        DateTimeFormatter df2 = DateTimeFormatter.ISO_LOCAL_DATE;

        String myDate = dt.format(df); // Creating date string using date and format
        System.out.println(myDate);

    }
}
