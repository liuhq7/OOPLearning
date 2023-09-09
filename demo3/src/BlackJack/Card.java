package BlackJack;

public class Card {
    private Color color;
    private int number;

    public Card(Color color, int number) {
        this.color = color;
        this.number = number;
    }

    public Color getColor() {
        return color;
    }

    public  int getNumber() {
        return number;
    }
}
