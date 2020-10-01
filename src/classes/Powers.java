package classes;

public class Powers extends Thread{

    private final long number;

    Powers(long number){
        this.number = number;
    }

    @Override
    public void run(){
        for(int i = 1; i <= 10; i++){
            System.out.printf("%s: %d ^ %d = %d", getName(), number, i, i * number);
        }
    }


}
