import java.util.Random;

public class EmployeeWage {
    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;
    public static final int EMP_RATE_PER_HOUR = 20;
    public static final int NUM_OF_WORKING_DAYS = 20;//UC5
    public static final int MAX_HRS_IN_MONTH = 100;//UC6

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");//START

        int totalEmpWage = 0,totalWorkingDays = 0,totalEmpHrs =0;
        while (totalEmpHrs <= MAX_HRS_IN_MONTH && totalWorkingDays < NUM_OF_WORKING_DAYS){
            int empHrs = 0;
            totalWorkingDays++;
            int empCheck = (int) Math.floor((Math.random() * 10) % 3);//UC1
            switch (empCheck) {  //UC4
                case IS_FULL_TIME:
                    empHrs = 8;
                    break;
                case IS_PART_TIME:
                    empHrs = 4;
                    break;
                default:
                    empHrs = 0;
            }
            totalEmpHrs += empHrs;
            int empWage = empHrs * EMP_RATE_PER_HOUR;
            totalEmpWage += empWage;
            System.out.println("Emp Wage: " + empWage);
        }
        System.out.println("Total Emp Wage: " + totalEmpWage);
    }
}

