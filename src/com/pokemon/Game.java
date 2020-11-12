package com.pokemon;


import java.util.HashSet;
import java.util.Scanner;

public class Game {


    public void runGame() {
        System.out.println("Welcome Ash!");
        HashSet<Coordenadas> visitedCoords= new HashSet<>();
        String input;

        //I do a do while in here so I can run the program at least one time for the user to get the output
        do{
            //In this next 4 lines I get the user input and split that input in an array
            System.out.println("Insert the desired path");
            Scanner in = new Scanner(System.in);
            input = in.nextLine();
            String[] separatedString= input.split("");

            //After the spliting i run a method to verify if the string covers the input requirements (N, S, E ,O)
            if(validString(separatedString)){

                //if the string is valid I play the game method where every movements and pokemon caught count happens
                int catchedPokemons= playGame(separatedString, visitedCoords);

                //After that I send the output to the user.
                System.out.println(catchedPokemons);
            }else{
                //In case the input field is invalid or QUIT
                if(input.equals("QUIT")){
                    //If the user writes QUIT i end the program.
                    //Also this if is here if the user writes "QUIT" the program has to run the whole code to get this to finish,
                    //And for that It would print the invalid Input line and that is why I put it here.
                    System.out.println("Thanks for playing");
                    System.exit(0);
                }else{
                    //If the user writes an invalid input I send him a warning message and then He can try again and rewrite a new input
                    System.out.println("Invalid Input, Try Again");
                }
            }
        } while(!input.equals("QUIT"));

    }


    public boolean validString(String[] separatedString){
        //in this method I iterate the input string and see if the values are the required.
        for (String s : separatedString) {
            if (!s.equals("N") && !s.equals("S") && !s.equals("E") && !s.equals("O")) {
                return false;
            }
        }
        return true;
    }



    public int playGame(String[] separatedString, HashSet<Coordenadas> visitedCoords){

        //After the input verified, this method is called

        //The first thing I do here is to set the starting point of Ash and
        // he is in a specific coordinate so he has to catch the pokemon there so I start the count already as 1
        Coordenadas cords = new Coordenadas(0,0);

        //the variable below is to set the last coordinates known where Ash went
        Coordenadas lastCords = cords;
        int countPokemons= 1;

        //I had the visited coordinate to the hashset so if he goes there again I can check that he has been there
        visitedCoords.add(cords);


        //Here we will start the movements for Ash, iterating the array
        for (String s : separatedString) {

            //first to know where he will be moving I need to know where he stands, so I grab the last coordinate known
            Coordenadas cordActual = new Coordenadas(lastCords.getX(), lastCords.getY());

            //After that I check where he wants to go (N, S, E, O), and to differentiate the movements i do a switch here.
            switch (s) {
                case "N":
                    //If it is North I add one to the Y axis
                    cordActual.setY(cordActual.getY() + 1);
                    //after getting the needed coordinates I verify if that cordActual has been visited,
                    // if not, I count one more pokemon and add those coordinates to the hashset
                    if (!visitedCoords.contains(cordActual)){
                        countPokemons++;
                        visitedCoords.add(cordActual);
                    }
                    //if the coordinates has been visited there is no pokemon there to be caught
                    // so I just set the lastCords the ones Ash standing in at the moment and repeat the process
                    lastCords= cordActual;
                    break;
                case "S":
                    //If it is North I take off one to the Y axis
                    cordActual.setY(cordActual.getY() - 1);
                    if (!visitedCoords.contains(cordActual)){
                        countPokemons++;
                        visitedCoords.add(cordActual);
                    }
                    lastCords= cordActual;
                    break;
                case "E":
                    //If it is North I add one to the X axis
                    cordActual.setX(cordActual.getX() + 1);
                    if (!visitedCoords.contains(cordActual)){
                        countPokemons++;
                        visitedCoords.add(cordActual);
                    }
                    lastCords= cordActual;
                    break;
                case "O":
                    //If it is North I take off one to the X axis
                    cordActual.setX(cordActual.getX() - 1);
                    if (!visitedCoords.contains(cordActual)){
                        countPokemons++;
                        visitedCoords.add(cordActual);
                    }
                    lastCords= cordActual;
                    break;
            }
        }
        return countPokemons;
    }

}
