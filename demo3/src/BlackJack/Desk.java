package BlackJack;

import java.util.ArrayList;
import java.util.List;

public class Desk {
    private List<Card> cards;
    private int nextIdx;
    private Dealer dealer;
    private List<Player> players = new ArrayList<>();

    public Desk(List cards, Dealer dealer) {
        this.cards = cards;
        this.dealer = dealer;
    }

    public void addPlayer(Player p) {
        players.add(p);
    }

    public void initGame() {
        return;
    }

    public void processing() {
        return;
    }

    public void check() {
        return;
    }
}
