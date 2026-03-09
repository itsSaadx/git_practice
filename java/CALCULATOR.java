import java.util.Scanner;

// Custom Exception Classes
class Maxnumberexception extends Exception {
    @Override
    public String getMessage() {
        return "THIS NUMBER IS NOT SUPPORTED";
    }
}

class Symbolexception extends Exception {
    @Override
    public String getMessage() {
        return "THIS SYMBOL IS INVALID";
    }
}

class Dividexception extends Exception {
    @Override
    public String getMessage() {
        return "OOPS DIVISION ERROR";
    }
}

class Multiplyexception extends Exception {
    @Override
    public String getMessage() {
        return "ERROR: 7000 SHOULD NOT BE MULTIPLIED";
    }
}

class UnknownException extends Exception {
    @Override
    public String getMessage() {
        return "DEFAULT EXCEPTION";
    }
}

public class CALCULATOR {
    private int n1, n2;
    private String sym;

    public void mthd() throws Maxnumberexception, Symbolexception, Dividexception, Multiplyexception, UnknownException {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter num1:");
        n1 = s.nextInt();

        System.out.println("Enter an operator (+, -, *, /):");
        sym = s.next();

        System.out.println("Enter num2:");
        n2 = s.nextInt();

        if (n1 > 100000 || n2 > 100000) {
            throw new Maxnumberexception();
        }
        if (!sym.matches("[+\\-*/]")) {
            throw new Symbolexception();
        }
        if (sym.equals("/") && n2 == 0) {
            throw new Dividexception();
        }
        if (n1 >= 7000 && n2 >= 7000 && sym.equals("*")) {
            throw new Multiplyexception();
        }

        switch (sym) {
            case "+":
                System.out.println("ADDITION: " + (n1 + n2));
                break;
            case "-":
                System.out.println("SUBTRACTION: " + (n1 - n2));
                break;
            case "*":
                System.out.println("MULTIPLICATION: " + (n1 * n2));
                break;
            case "/":
                System.out.println("DIVISION: " + (n1 / n2));
                break;
            default:
                throw new UnknownException();
        }

        s.close();
    }

    public static void main(String[] args) {
        CALCULATOR calc = new CALCULATOR();
        try {
            calc.mthd();
        } catch (Maxnumberexception m) {
            System.out.println(m.getMessage());
        } catch (Dividexception d) {
            System.out.println(d.getMessage());
        } catch (Multiplyexception m) {
            System.out.println(m.getMessage());
        } catch (Symbolexception s) {
            System.out.println(s.getMessage());
        } catch (UnknownException un) {
            System.out.println(un.getMessage());
        }
    }
}


