package alface.francisco.kata_maxibons;

import java.util.List;

/**
 * Created by franciscoalfacemartin on 4/2/17.
 */

public class KarumiHQs {

    private Chat systemChat;

    private static int MIN_MAXIBONS = 3;
    private int maxibonsLeft = 10;

    public KarumiHQs(Chat systemChat) {
        this.systemChat = systemChat;
    }

    public int getMaxibonsLeft() {
        return maxibonsLeft;
    }

    public void setMaxibonsLeft(int maxibonsLeft) {
        this.maxibonsLeft = maxibonsLeft;
    }

    public void openFridge(List<Developer> developers) {
        for (Developer developer : developers) {
            openFridge(developer);
        }
    }

    public void openFridge(Developer developer) {
        if (maxibonsLeft - developer.getNumberOfMaxibons() >= 0) {
            maxibonsLeft -= developer.getNumberOfMaxibons();
        } else {
            maxibonsLeft = 0;
        }

        if (maxibonsLeft <= 3) {
            buyMaxibons();
            systemChat.sendMessage(String.format("Hi guys, I'm %s. We need more maxibons!", developer.getName()));
        }
    }

    private void buyMaxibons() {
        maxibonsLeft += 10;
    }
}
