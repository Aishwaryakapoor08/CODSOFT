//Project 2:--> MAKE A WORD COUNTER PROGRAM


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


public class WordCounter_program {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Welcome to Word Counter!!");
        System.out.println("Enter '1' to input text or '2' to provide a file path: ");
        int choice=sc.nextInt();
        sc.nextLine();

        String inputText = "";

        switch(choice){
            case 1:
                System.out.println("Enter you text: ");
                inputText = sc.nextLine();
                break;
            case 2:
                System.out.println("Enter the file path: ");
                String filePath =sc.nextLine();
                try{
                    inputText = readFromFile(filePath);
                } 
                catch(IOException e){
                   System.out.println("Error reading the file: " + e.getMessage() );
                   System.exit(1);
                }
                break;
            default:
                System.out.println("Invalid choice.Please try again.");
                System.exit(1);          
        }


        int WordCount= countWords(inputText);
        System.out.println("Total word count: " + WordCount ); 
    }


    private static String readFromFile(String filePath) throws IOException{
        StringBuilder content = new StringBuilder();
        try(BufferedReader br= new BufferedReader(new FileReader(filePath))){
            String line;
            while((line = br.readLine())!=null){
                content.append(line).append("\n");
            }
        }
        return content.toString();

    }

    
    private static int countWords(String intputText){
        String[] words=intputText.split("\\s+|\\p{Punct}");
        return words.length;
    }
}
