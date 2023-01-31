import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        List<UnlockMethod> unlockMethods = Arrays.asList(
                new FaceID(new Scanner(System.in), ":)"),
                new FingerPrint(new Scanner(System.in), "(__)"),
                new PIN(new Scanner(System.in), "4321"),
                new NoPassword()
        );
        chooseUnlockMode(unlockMethods);


//        FaceID fid = new FaceID(new Scanner(System.in), ":)");
//        System.out.println(fid.unlock());
//        FingerPrint fp = new FingerPrint(new Scanner(System.in), "(__)");
//        System.out.println(fp.unlock());
//        PIN pin = new PIN(new Scanner(System.in), "4321");
//        System.out.println(pin.unlock());
//        NoPassword np = new NoPassword();
//        System.out.println(np.unlock());
    }
    public static void chooseUnlockMode(List<UnlockMethod> unlockMethods){
        Scanner sc = new Scanner(System.in);
        System.out.println("Как вы желаете разблокировать устройство?\n"+
                "0 - Face id\n"+
                "1 - FingerPrint\n"+
                "2 - PIN\n"+
                "3 - NoPassword");
        int tempNumber = sc.nextInt();
        System.out.println(unlockMethods.get(tempNumber).unlock());
    }
}
