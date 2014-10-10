package com.company;

import java.util.Scanner;

/**
 * Created by Павел on 10.10.2014.
 */


public class Game {
    int bank = 500;
    int bet = 50;
    int player_points = 0;
    int dealer_points = 0;
    Card [] deck = new Card[52];
    Game(){
        BJ.init_Deck(deck);
    }
    int curCard = 0;
    int count_player_cards = 0;

    public void dealer_Game(){
        System.out.print("Dealer cards: ");
        while (dealer_points<17){
            dealer_points += deck[curCard].weight;
            System.out.print(deck[curCard++].label+" ");
        }
        System.out.print("Dealer points: "+dealer_points);
        System.out.println();
        if (dealer_points>21) {
            System.out.println("CONGRATULATIONS! YOU WIN!");
            return;
        }
        if(dealer_points == player_points)
            System.out.println("TIE");
        else if (dealer_points > player_points)
            System.out.println("CASINO WIN! YOU LOOSE");
        else
            System.out.println("CONGRATULATIONS! YOU WIN!");
    }

    public void player_Game(){
        Scanner scan = new Scanner(System.in);
        Card[] player_cards = new Card[5];
        player_cards[count_player_cards++] = deck[curCard++];
        player_cards[count_player_cards++] = deck[curCard++];
        for (int i = 0; i<count_player_cards;i++){
            player_points += player_cards[i].weight;
            System.out.print(player_cards[i].label + " ");
        }
        System.out.println("You points:"+ player_points +" Card?");
        String d;
        d = scan.next();
        while (d.equals("Y")){
            player_points += deck[curCard].weight;
            player_cards[count_player_cards++] = deck[curCard++];
            for (int i = 0; i<count_player_cards;i++) {
                System.out.print(player_cards[i].label + " ");
            }
            System.out.println("You points:"+ player_points +" Card?");

            d = scan.next();
        }
        if (player_points > 21){
            System.out.println("OVER 9000");
            return;
        }
        dealer_Game();
    }
}
