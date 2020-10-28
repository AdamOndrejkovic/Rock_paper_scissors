import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Game {

    public void play() throws IOException {

        printWelcome();
        winnerChecker();


    }

    private void printWelcome() {
        System.out.println("Welcome to my rock, paper , scissors game ");
        System.out.println("To play the game write the one of the three objects");
    }

    private void winnerChecker()  {
        try {
            int playerInput = playerHandler();
            int computerInput = computerInput();

            if(playerInput == 0){
                System.out.println("Wrong input");
            }
        } catch (IOException e) {
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
            return 1;
        }else if(input.equals("scissors")){
            return 1;
        }else {
            return 0;
        }
    }

    private int computerInput(){
        int min = 1;
        int max = 4;
        return (int) ((Math.random() * (max - min)) + min);
    }




}
