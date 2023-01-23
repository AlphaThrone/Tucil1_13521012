import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Function {
    public static int converterInput (String inputManual) {
        int convert=0;
        if (inputManual.equals("A")){
            convert=1;
        } else if (inputManual.equals("2")){
            convert=2;
        } else if (inputManual.equals("3")){
            convert=3;
        } else if (inputManual.equals("4")){
            convert=4;
        } else if (inputManual.equals("5")){
            convert=5;
        } else if (inputManual.equals("6")){
            convert=6;
        } else if (inputManual.equals("7")){
            convert=7;
        } else if (inputManual.equals("8")){
            convert=8;
        } else if (inputManual.equals("9")){
            convert=9;
        } else if (inputManual.equals("10")){
            convert=10;
        } else if (inputManual.equals("J")){
            convert=11;
        } else if (inputManual.equals("Q")){
            convert=12;
        } else if (inputManual.equals("K")){
            convert=13;
        }
        return convert;
    }

    public static String converterOutput (Integer autoInput) {
        String convert="";
        if (autoInput==1){
            convert="A";
        } else if (autoInput==2){
            convert="2";
        } else if (autoInput==3){
            convert="3";
        } else if (autoInput==4){
            convert="4";
        } else if (autoInput==5){
            convert="5";
        } else if (autoInput==6){
            convert="6";
        } else if (autoInput==7){
            convert="7";
        } else if (autoInput==8){
            convert="8";
        } else if (autoInput==9){
            convert="9";
        } else if (autoInput==10){
            convert="10";
        } else if (autoInput==11){
            convert="J";
        } else if (autoInput==12){
            convert="Q";
        } else if (autoInput==13){
            convert="K";
        }
        return convert;
    }

    public static void printStringArray(String[] array){
        for (int i = 0; i < 4; i++) {
            if(i!=3){
                System.out.printf(array[i]+" ");
            } else {
                System.out.println(array[i]);
            }
        }
    }

    public static int getRandomElement(List<Integer> list)
    {
        Random rand = new Random();
        return list.get(rand.nextInt(list.size()));
    }

    public static int randomCard(){
        //List
        List<Integer> cardDeck = new ArrayList<>(13);
        cardDeck.add(1);
        cardDeck.add(2);
        cardDeck.add(3);
        cardDeck.add(4);
        cardDeck.add(5);
        cardDeck.add(6);
        cardDeck.add(7);
        cardDeck.add(9);
        cardDeck.add(9);
        cardDeck.add(10);
        cardDeck.add(11);
        cardDeck.add(12);
        cardDeck.add(13);
        //Array
        int selectedCard;

        //Algorithm
        selectedCard=getRandomElement(cardDeck);
        
        return selectedCard;
    }


}
