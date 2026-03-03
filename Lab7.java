/*import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.InputMismatchException;

class NumberNotFoundException extends Exception {
    public NumberNotFoundException(String message) {
        super(message);
    }
}
class Lab7{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the file name:");
        String fileName = scanner.nextLine();

        System.out.println("Enter the divisor:");
        int divisor;
        try {
            divisor = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a valid integer.");
            return;
        }

        try {
            File file = new File(fileName);
            Scanner fileScanner = new Scanner(file);

            int number = findNumberInFile(fileScanner);
            if (number == -1) {
                throw new NumberNotFoundException("Number not found in the file.");
            }

            if (divisor == 0) {
                throw new ArithmeticException("Cannot divide by zero.");
            }

            int result = number / divisor;
            System.out.println("Result: " + result);
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic exception: " + e.getMessage());
        } catch (NumberNotFoundException e) {
            System.out.println("Number not found exception: " + e.getMessage());
        }
   

 private static int findNumberInFile(Scanner scanner) {
        while (scanner.hasNext()) {
            if (scanner.hasNextInt()) {
                return scanner.nextInt();
            } else {
                scanner.next(); // Skip non-integer values
            }
        }
        return -1; // Number not foundjava
    }
   
}
}
//...........................................
import java.util.Scanner;
class MoneyException extends Exception{
    MoneyException(String s){
        super(s);
    }

}
class InsufficientException extends Exception{
    InsufficientException (String p){
        super(p);
    }
}
class BankingApplication {
    private int balance=0;
    private  Scanner sc=new Scanner(System.in);
    void deposit() throws MoneyException{
        System.out.println("Enter the money to be deposited:");
        int deposit=sc.nextInt();
        if(deposit>50000){
            throw new MoneyException("Can't deposit that much of money");
        }
        else{
            balance+=deposit;
            System.out.println("Money deposited Successfully"+balance);
        }
    }
    void withdraw() throws InsufficientException{
        System.out.println("Enter the money to be withdraw:");
        int with=sc.nextInt();
        if(with>balance){
            throw new InsufficientException("Money is insufficient to withdraw");
        }
        else{
            balance-=with;
            System.out.println("Withdrawl Succesfully"+balance);
        }
    }
}
class Lab7{
    public static void main(String[] args){
        BankingApplication bank=new BankingApplication();
        try{
            bank.deposit();
            bank.withdraw();
        }
        catch(MoneyException e ){
            System.out.println(e.getMessage());
        }
        catch (InsufficientException e){
            System.out.println(e.getMessage());
        }
    }
}




import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.InputMismatchException;

class NumberNotFoundException extends Exception {
    public NumberNotFoundException(String message) {
        super(message);
    }
}

class Lab7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the file name:");
        String fileName = scanner.nextLine();
        System.out.println("Enter the divisor:");
        int divisor;
        try {
            divisor = scanner.nextInt();
            if (divisor == 0) {
                throw new ArithmeticException("Cannot divide by zero.");
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a valid integer.");
            return;
        }

        try {
            File file = new File(fileName);
            Scanner fileScanner = new Scanner(file);
            int number = findNumberInFile(fileScanner);
            int result = number / divisor;
            System.out.println("Result: " + result);
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic exception: " + e.getMessage());
        } catch (NumberNotFoundException e) {
            System.out.println("Number not found exception: " + e.getMessage());
        }
    }

    private static int findNumberInFile(Scanner scanner) throws NumberNotFoundException {
        while (scanner.hasNext()) {
            if (scanner.hasNextInt()) {
                return scanner.nextInt();
            } else {
                scanner.next(); // Skip non-integer values
            }
        }
        throw new NumberNotFoundException("Number not found in the file.");
    }
}
*/



import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.InputMismatchException;

class NumberNotFoundException extends Exception {
    public NumberNotFoundException(String message) {
        super(message);
    }
}

class Lab7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the file name:");
        String fileName = scanner.nextLine();
        System.out.println("Enter the divisor:");
        int divisor;
        try {
            divisor = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a valid integer.");
            return;
        }
        try {
            File file = new File(fileName);
            Scanner fileScanner = new Scanner(file);
            int number = findNumberInFile(fileScanner);
            if (number == -1) {
                throw new NumberNotFoundException("Number not found in the file.");
            }
            if (divisor == 0) {
                throw new ArithmeticException("Cannot divide by zero.");
            }
            int result = number / divisor;
            System.out.println("Result: " + result);
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic exception: " + e.getMessage());
        } catch (NumberNotFoundException e) {
            System.out.println("Number not found exception: " + e.getMessage());
        }
    }

    private static int findNumberInFile(Scanner scanner) {
        while (scanner.hasNext()) {
            if (scanner.hasNextInt()) {
                return scanner.nextInt();
            } else {
                scanner.next(); // Skip non-integer values
            }
        }
        return -1; // Number not found
    }
}


