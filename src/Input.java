import java.util.Scanner;

public class Input extends Menu{
    static Scanner scan = new Scanner(System.in);

    public static int choice(){
        int pilihan = scan.nextInt();
        return pilihan;
    }

    public static String manualInput(){
        String inputManual;
        inputManual=scan.next();
        return inputManual;
    }
}
