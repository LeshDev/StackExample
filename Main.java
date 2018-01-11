package de.lukas.schule.programm;

import de.lukas.schule.programm.utils.Stack;

public class Main {

    static Stack<Object> sZahl = new Stack<Object>();

    public static void main(String[] args) {
        createCoins();
        System.out.println(sZahl.top().zahl);
        listCoins();
    }

    public static void createCoins(){
        for(int i=0; i < 20; i++){
            int finalCoin = (int)(Math.random() * Object.munzen.length);
            sZahl.push(new Object(Object.munzen[finalCoin]));
        }
    }

    public static void listCoins() {
        int totalCoins = 0;
        for (int i = 0; i < 21; i++) {
            totalCoins++;
            System.out.print(sZahl.top().zahl + "\n");
            sZahl.pop();
        }
        System.out.println("Total Coins: " + totalCoins);
    }
}
