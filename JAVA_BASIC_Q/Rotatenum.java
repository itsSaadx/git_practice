import java.util.Scanner;

class Rotatenum{
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int num,exdigit,extractnum=0,newnum=0,rnum=0;
        
        System.out.println("enter the number");
        num = s.nextInt();

        System.out.println("enter rotation");
        int r = s.nextInt();
       
        
        
        

        for(int i=0; i<r; i++){
        exdigit = num%10;
        extractnum = extractnum * 10 + exdigit;
        num = num/10;         
    }


          // now reorder extractnum
        while (extractnum!=0) {
      int orderdg = extractnum%10;
        newnum = newnum * 10 + orderdg;
        extractnum = extractnum/10;
        }

    
    int shift = 1;    
    int copy = num;
     while (copy!=0) {
     shift = shift*10;
     copy/=10;
     }

   // print the rotated number
   rnum = newnum * shift + num;
   System.out.println(rnum);

    }
}