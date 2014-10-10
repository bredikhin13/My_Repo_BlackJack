package com.company;

/**
 * Created by Павел on 09.10.2014.
 */
public class Card {
    public int number = 0;
    public int suit = 0;
    public int weight = 0;
    public String label;

    public void setNumber(int number) {
        this.number = number;
        if(number>10) {
            this.weight = 10;
            switch (number){
                case 10: {this.label = "10";}
                case 11: {this.label = "J";}
                case 12: {this.label = "Q";}
                case 13: {this.label = "K";}
            }
        }
        else if (number == 0) {
            this.weight = 11;
            this.label = "A";
        }
        else {
            this.weight = number;
            this.label = String.valueOf(number);
        }

    }
}

