import java.util.Scanner;

 class elseif{
   
    public static void main(String[] args){
         Scanner s = new Scanner(System.in);
        int  age;
        System.out.print("enter you age");
            age = s.nextInt();
    

         if(age>46){
            System.out.print("you are seme-exprienced");
        }

        else if(age>36){
            System.out.print("you are semi semi exprienced");

        }

        else {
            System.out.print("you are not exprienced");

        }
    }
}