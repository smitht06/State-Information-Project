/*
 * File:    TestStateInformation.java
 * Author:  Anthony Smith
 * Date:    6 October 2018
 * Purpose: This class is a program that tests the summary and stateInformation class by allowing users to input states and the program will output that states bird,
 * it wil give a summary ate the end
 *
 */
import java.util.ArrayList;
import java.util.Scanner;

public class TestStateInformation {
    public static void main(String[]args){
        //create arraylist to store information entered by user and output
        ArrayList<Summary> state = new ArrayList<>();
        //scanner for input
        Scanner input = new Scanner(System.in);
        //create state information object
        StateInformation searchStates = new StateInformation();
        //create two dimensional array and set it equal to the array in the stateInformation class
        String[][] stateInformation = searchStates.getStateBirdsAndFlowers();
        //while loop to make sure the program continues running
        while(true){
            //prompt user for input
            System.out.println("Enter a state or Washington D.C or enter none to exit:");
            //store input in variable
            String stateName = input.nextLine();

            //if statement to print summary and exit the program if the user enters 'none'
            if(stateName.equalsIgnoreCase("none")){
                System.out.print("*****Summary*****\n");
                for(Summary st : state){
                    System.out.println(st.toString());
                    System.out.println("*****************");
                }
                //exit program
                System.exit(0);
            }else{
                //user getter method and set parameters
                int lookUp = getInformation(stateInformation,stateName);
                if(lookUp != -1){
                    //print the bird and flower of the state entered referencing the spot in the array
                    System.out.println("Bird: " + stateInformation[lookUp][1]);
                    System.out.println("Flower: " + stateInformation[lookUp][2] + "\n");
                    //save information in the array list for summary
                    state.add(new Summary(stateInformation[lookUp][0],stateInformation[lookUp][1],stateInformation[lookUp][2]));
                }else{
                    //validate input
                    System.out.println("Invalid, please enter U.S state or Washington D.C");
                }
            }
        }
    }
    //getInformation method to return the array position of the state entered
    public static int getInformation(String stateInformation[][],String state)
    {
        int lookUp = -1;
        int length = stateInformation.length;
        //for loop to initialize array
        for(int i = 0; i < length; i++){
            //if statement to make sure position in array is found
            if(stateInformation[i][0].equalsIgnoreCase(state))
                lookUp = i;
        }
        return lookUp;
    }
}
