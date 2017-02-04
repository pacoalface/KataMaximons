package alface.francisco.kata_maxibons;

/**
 * Created by franciscoalfacemartin on 4/2/17.
 */

public class SystemChat implements Chat {

    @Override public void sendMessage(String message) {
        System.out.println(message);
    }
}
