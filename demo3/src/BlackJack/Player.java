package BlackJack;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private int ID;
    private int totalBets;
    private int currentBets = 0;
    private int value = 0;
    private List<Card> cards = new ArrayList<>();
    private boolean dealing = true;

    public Player(int ID, int totalBets) {
        this.ID = ID;
        this.totalBets = totalBets;
    }

    public void addBets(int bets) {
        currentBets +=  bets;
        totalBets -= bets;
    }

    public void drawCard(Card card) {
        cards.add(card);
    }

    public int getValue() {
        return 0;
    }

    public void getBets() {
        totalBets += 2 * currentBets;
    }

    public void clear() {
        cards.clear();
        currentBets = 0;
    }

    public int getCurrentBets() {
        return currentBets;
    }

    public void stopDealing() {
        dealing = false;
    }

    public boolean isDealing() {
        return dealing;
    }
}
