package au.edu.jcu.cp3406.guessinggame;
import java.util.Random;
class Game {
    private Random rnd = new Random();
    private int number = rnd.nextInt(10) + 1;

    boolean check(int i){
        return (i == number);
    }
}
