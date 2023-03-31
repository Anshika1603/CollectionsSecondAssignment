package knoldus.question4;

import java.util.HashMap;

public class RaiseEmployeeSalary {
    public static void main(String[] args) {
        HashMap<String, Double> employeeSalaries=new HashMap<>();
        employeeSalaries.put("Jitin", 50000.00);
        employeeSalaries.put("Anshika", 30000.00);
        employeeSalaries.put("Rahul", 40000.00);
        employeeSalaries.put("Rishika", 45000.00);

         /*Looping through the employee salaries and updating salaries for employees who earn less than 50,000
         using KeySet() to store the Employee Names into a Set*/
        for (String employeeName : employeeSalaries.keySet()) {
            double currentSalary = employeeSalaries.get(employeeName);
            if (currentSalary < 50000) {
                double newSalary = currentSalary * 1.05; // giving a 5% raise
                employeeSalaries.put(employeeName, newSalary);
            }
        }

        // Printing the updated employee salaries
        for (String employeeName : employeeSalaries.keySet()) {
            double salary = employeeSalaries.get(employeeName);
            System.out.println(employeeName + " : " + salary);
        }

    }
}

