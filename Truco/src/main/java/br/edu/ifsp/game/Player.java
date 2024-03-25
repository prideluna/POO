package br.edu.ifsp.game;

import br.edu.ifsp.deck.Card;

public class Player {
    private String name;
    private int score;
    private Card[] cards;

    public Player(String name) {
        this.name = name;
        this.score = 0;
        this.cards = new Card[3]; //TODO verificar quantidade
    }

    public void setCards(Card[] cards) {
        this.cards = cards;
    }
    public String getName() {
        return name;
    }
    public Card chooseCard() {
        Card card = null;
        for (int i = 0; i < cards.length; i++) {
            if (cards[i] == null) {
                continue;
            }
            card = cards[i];
            cards[i] = null;
            break;
        }
        return card;
    }
    public void incrementScore(){
        this.score++;
    }
    public int getScore() {
        return score;
    }

}
