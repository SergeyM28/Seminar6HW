public class NoPassword implements UnlockMethod{
    public NoPassword() {
    }

    @Override
    public boolean unlock() {
        return true;
    }
}
