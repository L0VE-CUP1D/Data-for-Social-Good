import java.util.Scanner;

public class DataRunner {
  public static void main(String[] args) {

    UserStory userStory = new UserStory("disease.txt", "sex.txt", "count.txt", "rate.txt");
    System.out.println("Our user story's goal with this data is to figure out the rates of the disease");
    System.out.println("Then we figure out what is causing the rate to be so high then we can get rid of those factors!");
    System.out.println("This is our data we collected for diseases including the name, the sex and count it affects, and the rate of the disease!");
    System.out.println("-------------------------------------------------------------------------------------------------------------------------");
    //Print outs the data from the txt files for diseases using a toString() method
      System.out.println(userStory);
    System.out.println("-------------------------------------------------------------------------------------------------------------------------");


