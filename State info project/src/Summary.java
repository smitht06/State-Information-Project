/*
 * File:    Summary.java
 * Author:  Anthony Smith
 * Date:    6 October 2018
 * Purpose: This class allows a summary of the states entered and their birds and flowers to be printed at the end of the program.
 *
 */
public class Summary {
    //create fields for each piece of information
    public String state;
    public String bird;
    public String flower;

    //no argument constructor
    public Summary(String state, String bird, String flower) {
        this.state = state;
        this.bird = bird;
        this.flower = flower;
    }

    //toString method to return the summary
    public String toString() {
        return
                "State: " + state + '\n' +
                "Bird: " + bird + '\n' +
                "Flower: " + flower;
    }
}
