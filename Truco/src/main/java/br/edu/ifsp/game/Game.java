package br.edu.ifsp.game;

public class Game {
    private Player player1, player2;
    private Hand[] hands;
    private int counterHands;
    public Game(Player player1, Player player2){
        this.player1 = player1;
        this.player2 = player2;
        this.hands = new Hand[30];
        this.counterHands = 0;
    };

    public void play(){
        hands[counterHands].playRound();
        counterHands++;
    }
    public boolean isDone(){return false;}

    public Player getWinner(){
        int scorePlayer1 = player1.getScore();
        int scorePlayer2 = player2.getScore();

        if(scorePlayer1>scorePlayer2){
            return  player1;
        }
        return player2;
    }


}
