import java.util.Scanner;
/*
/ Manages data about diseases with the affecting rate and the amount of people it affects
*/
public class UserStory {
 private String[] disease; // the name of the diseases we are presenting
  private String[] sex;      // the sex that the disease is affecting
  private int[] count;       // the amount of people of a certain sex the disease is affecting
  private double[] rate;     // the rate of the diseases
/*
/ Reads data from the disease, sex, count, and rate files
*/
public UserStory (String diseaseFile, String sexFile, String countFile, String rateFile){
  disease = FileReader.toStringArray(diseaseFile);
  sex = FileReader.toStringArray(sexFile);
  count = FileReader.toIntArray(countFile);
  rate = FileReader.toDoubleArray(rateFile);
}
  //Creates a toString() method to print out the data in the console for diseases that include the disease name, sex, count affected, and the rate.
  public String toString(){
    String result = "";

    for (int i = 0; i < disease.length; i++) {
      result += "Diseases: " + disease[i] +"\nSex: " + sex[i] + "\nCount: " + count[i] + "\nRate: " + rate[i] + "\n\n";
    }
    
  return result;
  }

  
}