import classes.Powers;

public class Main {
    public static void main(String[] args) {
        for(long i = 1; i <= 10; i++){
            new Powers(i).start();
        }
    }
}
