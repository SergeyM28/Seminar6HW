import java.util.Scanner;

public class FaceID implements UnlockMethod{
    public FaceID(Scanner sc, String face) {
        this.sc = sc;
        this.face = face;
    }

    Scanner sc = new Scanner(System.in);
    private String face;
    @Override
    public boolean unlock() {
        System.out.println("Покажите лицо");
        return sc.nextLine().equals(face);
    }
}
