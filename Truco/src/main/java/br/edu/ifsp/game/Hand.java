package br.edu.ifsp.game;

import br.edu.ifsp.deck.Card;
import br.edu.ifsp.deck.Deck;

import javax.swing.plaf.IconUIResource;

public class Hand {
    private Card vira;
    private final Player player1, player2;
    private final Round[] rounds;
    private int countRound;
    private Deck deck;
    public Hand(Player player1, Player player2){
        this.player1 = player1;
        this.player2 = player2;
        this.rounds = new Round[3];
        this.deck.shuffle();
        this.countRound =0;

    }
    public void playRound(){
//        deck.take(3);
        Card card1 = player1.chooseCard();
        Card card2 = player2.chooseCard();
        rounds[countRound] = new Round(player1,card1, player2, card2, vira);
        countRound++;
    }
    public boolean isDone(){return false;}
    public String getWinner(){return null;}
}
