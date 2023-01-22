public class Main {
    public static void main(String[] args) {
        // initiate

        //variables
        int opsiProgram;
        int[] cardValue = new int[4];
        boolean condition;
        String[] userCard = new String[4];
        String[] result;

        //Algoritma
        Menu.splash();
        Menu.menu();
        opsiProgram=Input.choice();
        while(true){
            if(opsiProgram==1){
                for (int i = 0; i < userCard.length; i++) {
                    userCard[i]=Input.manualInput();
                    cardValue[i]=Function.converterInput(userCard[i]);
                }
                break;
            } else if (opsiProgram==2){
                cardValue=Function.randomCard();
                for (int i = 0; i < cardValue.length; i++) {
                    userCard[i]=Function.converterOutput(cardValue[i]);
                }
                Function.printStringArray(userCard);
                break;
            } else {
                Menu.errorMessage();
                Menu.menu();
                opsiProgram=Input.choice();
            }
        }
        //algoritmee


        // condition=File_Writer.isWriteResult();
        // if(condition==true){
        //     File_Writer.writeResult(userCard, result);
        // }
    }
}