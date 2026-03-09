import java.util.Date;

// class DATE_TIME{
//     public static void main(String[] args){
//         System.out.println(System.currentTimeMillis()/1000/3600/24/365);
    
//     }
// }

class DATE_TIME{
    public static void main(String[] args){
        Date d = new Date();
        System.out.println(d);
        System.out.println(d.getTime());
        System.out.println(d.getYear());
        }
}