import java.util.Scanner;

public class PIN implements UnlockMethod{
    Scanner sc = new Scanner(System.in);
    private String pass;

    public PIN(Scanner sc, String pass) {
        this.sc = sc;
        this.pass = pass;
    }

    @Override
    public boolean unlock() {
        System.out.println("Введите пароль");
        return sc.nextLine().equals(pass);
    }
}
