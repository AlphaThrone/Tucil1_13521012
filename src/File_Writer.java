import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class File_Writer extends Input {
    public static boolean isWriteResult(){
        int pilihan;
        boolean condition;
        while (true) {
            System.out.println("Apakah hasil mau disimpan ke dalam file?");
            System.out.println("1. YA");
            System.out.println("2. TIDAK");
            System.out.print(">> ");
            pilihan = scan.nextInt();

            if (pilihan == 1) {
                condition = true;
                break;

            } else if (pilihan == 2) {
                condition = false;
                break;

            } else {
                System.out.println("Input tidak valid!");
            }

        }
        return condition;
    }

    public static void writeResult(String[] input, List<String> result) {
        try {
            System.out.print("Input nama file: ");
            String fileName = scan.next();
            String address = "../test/"+fileName+".txt";
            FileWriter writer = new FileWriter(address);
            writer.write("Kartu Anda: \n");
            writer.append(input[0]);
            for (int i = 1; i < input.length; i++) {
                writer.append(" "+input[i]);
            }
            writer.append("\nDiperoleh "+result.size()+" solusi:\n");
            for (int j = 0; j < result.size(); j++) {
                if(j!=result.size()-1){
                    writer.append(result.get(j)+"\n");
                } else if (j==result.size()-1){
                    writer.append(result.get(j));
                }
            }

            writer.close();
        } catch (IOException e) {
            System.out.println("Error Found");
        }
    }
}
