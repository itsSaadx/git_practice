// class KeyPadPhone{
//     void sendMessage(){
//         System.out.println("Text message sent!");
//     }
// }

// class AndroidPhone extends KeyPadPhone{
//     @Override
//     void sendMessage(){
//         System.out.println("Message sent via WhatsApp!");
//     }
// }

// public class annotation{
//         public static void main(String args[]){
//             AndroidPhone Samsung = new AndroidPhone();
//             Samsung.sendMessage();
// }
// }

//______________________________________________________________

class KeyPadPhone {
    @Deprecated
    void sendMessage() {
        System.out.println("Text message sent!");
    }
}

class AndroidPhone extends KeyPadPhone {
     @SuppressWarnings("deprecation")  // Suppress warning for overriding a deprecated method
    void sendMessage() {
        System.out.println("Message sent via WhatsApp!");
    }
}

public class annotation {
    public static void main(String args[]) {
        AndroidPhone Samsung = new AndroidPhone();
        Samsung.sendMessage();
    }
}





//_____________________________________________________________________

// // @FunctionalInterface >> it define interface functional or not
// interface myFunctionalInterface {
//     void method1();
//     void methodd2();
// }
// public class annotation{
//         public static void main(String args[]){
//             System.out.println("Functonal interface annotation");

// }
// }
