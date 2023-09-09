package BlackJack;

import java.util.ArrayList;
import java.util.List;

public class Dealer {
    private int totalBets;
    private int value = 0;
    private List<Card> cards = new ArrayList<>();

    public Dealer(int totalBets) {
        this.totalBets = totalBets;
    }

    public void drawCard(Card card) {
        cards.add(card);
    }

    public int getBestValue() {
        return 0;
    }

    public boolean isWin(Player p) {
        return value >= p.getValue();
    }

    public void getBets(Player p) {
        totalBets += 2 * p.getCurrentBets();
    }

    public void clear() {
        cards.clear();
    }
}
