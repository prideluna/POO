package br.edu.ifsp.game;

import br.edu.ifsp.Principal;
import br.edu.ifsp.deck.Card;

public class Round {
    private String winner;
    private final Card card1;
    private final Card card2;
    private final Card vira;
    private final Player player1;
    private final Player player2;
    public Round(Player player1, Card card1, Player player2, Card card2, Card vira){
        this.player1 = player1;
        this.player2 = player2;
        this.card1 = card1;
        this.card2 = card2;
        this.vira = vira;
        getWinner();
    }
    public String getWinner(){

        if(card1.compareValueTo(card2, vira) > 0){
            player1.incrementScore();
            return player1.getName();
        } else if (card1.compareValueTo(card2, vira) < 0) {
            player2.incrementScore();
            return player2.getName();
        }else{
            return null;
        }
    }
}
