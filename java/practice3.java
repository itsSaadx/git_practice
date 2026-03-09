import java.util.Scanner;

class practice3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//         int dbms, java, python;

//         System.out.print("ENTER THE MARKS OF DBMS, JAVA, PYTHON: ");
//         dbms = sc.nextInt();
//         java = sc.nextInt();
//         python = sc.nextInt();
        
//         float totalMarks = (dbms + java + python) / 3.0f;
        
//         if (totalMarks >= 40 && dbms >= 33 && java >= 33 && python >= 33) {
//             System.out.println("Congratulations, you have passed.");
//         } else {
//             System.out.println("Sorry, you have failed.");
//         }
//     }
// }

//______________________ 2nd problem___________________________________

//        System.out.println("Enter your income in Lakhs per annum");
//        float tax = 0;
//        float income = sc.nextFloat();
//        if(income<=2.5){
//            tax = tax + 0;
//        }
//        else if(income>2.5f && income <= 5f){
//            tax = tax + 0.05f * (income - 2.5f);
//        }
//        else if(income>5f && income <= 10.0f){
//            tax = tax + 0.05f * (5.0f - 2.5f);
//            tax = tax + 0.2f * (income - 5f);
//        }
//        else if(income>10.0f){
//            tax = tax + 0.05f * (5.0f - 2.5f);
//            tax = tax + 0.2f * (10.0f - 5f);
//            tax = tax + 0.3f * (income - 10.0f);
//        }

//        System.out.println("The total tax paid by the employee is: " + tax);

 //     }
  // }


// ____________________________3rd problem______________________________

// we use enhanec case stmt 
// int day = sc.nextInt();
// switch(day){
//     case 1 -> System.out.println("MONDAY"); 
//     case 2 -> System.out.println("TUESDAY"); 
//     case 3 -> System.out.println("WEDNESDAY"); 
//     case 4 -> System.out.println("THURSEDAY"); 
//     case 5 -> System.out.println("SATERDAY"); 
//     case 6 -> System.out.println("SUNDAY");     
// }

//     }
// }

// ____________________________4rd problem______________________________
        
  

// public class LeapYearCheck {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
        
//         System.out.println("ENTER THE YEAR TO CHECK IF IT IS A LEAP YEAR OR NOT:");
//         int year = sc.nextInt();


//         if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
//             System.out.println("THE YEAR " + year + " IS A LEAP YEAR.");
//         } else {
//             System.out.println("THE YEAR " + year + " IS NOT A LEAP YEAR.");
//         }
        
    
//     }
// }

// ____________________________5rd problem______________________________

       String website = sc.next();
       if(website.endsWith(".org")){
           System.out.println("This is an organizational website");
       }
       else if(website.endsWith(".com")){
           System.out.println("This is a Commercial website");
       }
       else if(website.endsWith(".in")){
           System.out.println("This is an Indian website");
       }
        }
    }