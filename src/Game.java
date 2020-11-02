import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Game {

    public void play() throws IOException {
        boolean start = true;
        printWelcome();
        while(start) {
            winnerChecker();
        }

    }

    private void printWelcome() {
        System.out.println("Welcome to my rock, paper , scissors game ");
        System.out.println("To play the game write the one of the three objects");
    }

    private void winnerChecker()  {
        try {
            int playerInput = playerHandler();
            int computerInput = 3;
            System.out.println(playerInput + " " + computerInput);
            if(playerInput == 0){
                System.out.println("Wrong input");
            }else if(computerInput == playerInput){

                System.out.println("Player : Computer --> " + printChoicePlayer(playerInput) + " : " + printChoiceComputer(computerInput) );
                System.out.println("It's a draw");
            }
            else if((playerInput == 1 && computerInput == 3) || (playerInput == 2 && computerInput == 1)
                   || (playerInput == 3 && computerInput == 2)){
                System.out.println("Player : Computer --> " + printChoicePlayer(playerInput) + " : " + printChoiceComputer(computerInput) );
                System.out.println("Player has won");
            }else{
                System.out.println("Player : Computer --> " + printChoicePlayer(playerInput) + " : " + printChoiceComputer(computerInput) );
                System.out.println("Computer has won");
            }
        } catch (IOException e) {
            //for user
            System.out.println();
            e.printStackTrace();
        }


    }

    private String checkInput() throws IOException {
        System.out.println();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String inputPlayer = reader.readLine();
        return inputPlayer.toLowerCase();
    }

    private int playerHandler() throws IOException {

        String input = checkInput();

        if(input.equals("rock")){
            return 1;
        }else if(input.equals("paper")){
            return 2;
        }else if(input.equals("scissors")){
            return 3;
        }else {
            return 0;
        }
    }

    private int computerInput(){
        int min = 1;
        int max = 4;
        return (int) ((Math.random() * (max - min)) + min);
    }

    private String printChoicePlayer(int choice){

            int playerInput = choice ;
            if(playerInput == 1){
                return "rock";
            }else if(playerInput == 2){
                return "paper";
            }else{
                return " scissors";
            }

    }

    private String printChoiceComputer(int choice){
        int computerInput = choice;

        if(computerInput == 1){
            return "rock";
        }else if(computerInput == 2){
            return "paper";
        }else if(computerInput == 3){
            return " scissors";
        }else {
            return "";
        }
    }


}
