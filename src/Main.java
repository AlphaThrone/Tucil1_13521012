import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //variables
        long startTime;
        long endTime;
        int opsiProgram;
        List<Integer>cardValue = new ArrayList<>(4);
        String[] userCard = new String[4];
        List<String>allResult = new ArrayList<>();
        boolean condition=false;

        //Deck of Cards
        List<String> deckCard = new ArrayList<>();
        deckCard.add("A");
        deckCard.add("2");
        deckCard.add("3");
        deckCard.add("4");
        deckCard.add("5");
        deckCard.add("6");
        deckCard.add("7");
        deckCard.add("8");
        deckCard.add("9");
        deckCard.add("10");
        deckCard.add("J");
        deckCard.add("Q");
        deckCard.add("K");
        
        //Algoritma
        Menu.splash();
        Menu.menu();
        opsiProgram=Input.choice();
        while(true){
            if(opsiProgram==1){
                do{
                    condition=false;
                    cardValue.removeAll(cardValue);
                    for (int i = 0; i < userCard.length; i++) {
                        userCard[i]=Input.manualInput();
                        if(deckCard.indexOf(userCard[i])==-1){
                            condition=true;
                        }
                        cardValue.add(i, Function.converterInput(userCard[i]));
                    }
                    if(condition==true){
                        Menu.errorMessage();
                    }
                }while(condition==true);
                System.out.println("Kartu Anda: ");
                Function.printStringArray(userCard);
                break;
            } else if (opsiProgram==2){
                for (int i = 0; i < userCard.length; i++) {
                    cardValue.add(Function.randomCard());   
                }
                for (int i = 0; i < cardValue.size(); i++) {
                    userCard[i]=Function.converterOutput(cardValue.get(i));
                }
                System.out.println("Kartu Anda: ");
                Function.printStringArray(userCard);
                break;
            } else {
                Menu.errorMessage();
                Menu.menu();
                opsiProgram=Input.choice();
            }
        }
        startTime = System.currentTimeMillis();
        allResult.addAll(BruteForce.getAllResult(cardValue));
        if(allResult.size()==0){
            System.out.println("TIdak ada solusi");
        }else{
            System.out.println("Diperoleh "+allResult.size()+" solusi:");
            for (int i = 0; i < allResult.size(); i++) {
                System.out.println(allResult.get(i));   
            }
        }
        endTime = System.currentTimeMillis();
        System.out.println("Time execution: "+(endTime-startTime)+" ms");
        if(allResult.size()!=0){
            if(File_Writer.isWriteResult()==true){
                File_Writer.writeResult(userCard, allResult);
            }
        }
    }
}