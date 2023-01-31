import java.util.Scanner;

public class FingerPrint implements UnlockMethod{
    Scanner sc = new Scanner(System.in);
    private String fingerPrint;

    public FingerPrint(Scanner sc, String fingerPrint) {
        this.sc = sc;
        this.fingerPrint = fingerPrint;
    }

    @Override
    public boolean unlock() {
        System.out.println("Приложите палец");
        return sc.nextLine().equals(fingerPrint);
    }
}
