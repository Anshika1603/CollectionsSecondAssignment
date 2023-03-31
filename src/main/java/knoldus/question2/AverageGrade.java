package knoldus.question2;

import java.util.HashMap;

public class AverageGrade {
    public static void main(String[] args) {
        HashMap<String, Double> studentAverage=new HashMap<>();
        studentAverage.put("Alexa", 97.00);
        studentAverage.put("Google Home", 67.50);
        studentAverage.put("Chatgpt", 84.75);
        double sum=0.0;
        // Calculating Sum of Student Grades
        for (double studentGrade:
             studentAverage.values()) {
          sum=studentGrade+sum;
        }
        // Calculating and Displaying Average Grade
        double averageGrade=sum/studentAverage.size();
        System.out.println(averageGrade);

    }
}
