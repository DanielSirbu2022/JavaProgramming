package day04_Variables;

public class SalaryCalculator {

    public static void main(String[] args) {


        //declare the variable for: hourlyRate, weeklyHours, calculate the salary

        int hourlyRate = 50;
        int weeklyHours = 40;
        int numberOfWeks = 52;
        int salary = hourlyRate * weeklyHours * numberOfWeks;

        System.out.println(salary);
// system.out.println( salary)

        System.out.println("hourlyRate = $" + hourlyRate);
        System.out.println("weeklyHours = " + weeklyHours);
        System.out.println("numberOfWeks = " + numberOfWeks);
        System.out.println("salary = $" + salary);



    }

}
