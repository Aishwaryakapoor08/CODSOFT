//Project 1:->> MAKE A NUMBER GUESSING GAME


import java.util.Random;
import java.util.Scanner;
public class Number_game{
    public static void main(String[] args) {
        int count;
        int attempts=1;
        String ans;
        boolean b=false;
        int value =0;


        Scanner sc= new Scanner(System.in);
        System.out.println("**Rules of the game**");
        System.out.println("There are total **THREE** attempts.");
        System.out.println("You have **TEN** chances to guess the answer in sigle attempt. ");


        if(value<3){
            for(int j=1;j<=3;j++){
                if (b==false){
                    count =1;
                    Random r= new Random();
                    int com_num=r.nextInt(100);
                    do{
                        for(int i=1;i<=10;i++){
                            System.out.println("Enter your number: ");
                            int user_no=sc.nextInt();
                            if(user_no == com_num){
                                System.out.println("Yes you guessed it right!!");
                                System.out.println("You gussed in " + count + "times in" + attempts + "attempt");
                                break;
                            }else if(user_no > com_num){
                                System.out.println("The number is to High!!");
                                count++;
                            }else if(user_no < com_num){
                                System.out.println("The number is low!!");
                                count++;
                            }else
                            System.out.println("Can't Guess!!");
                        }
                        attempts++;
                        System.out.println("Do you want to play again? Yes OR No");
                        ans= sc.next().toLowerCase();
                    }while(ans=="Yes");
                    if(!ans.equals("yes")){
                        b=true;
                        System.out.println("Thank you");
                    }
                }
            }
            value++;
        }
        if(attempts>3)
        System.out.println("Sorry!!,Attemps over! \nThank you for playing the game!!");
    
    }
}