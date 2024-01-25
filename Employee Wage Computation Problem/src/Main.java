import java.util.Random;

// UC1: Check Employee is Present or Absent - Use ((RANDOM)) for Attendance Check
class EmployeeWageComputation {

    // UC7: Refactor the Code to write a Class Method to Compute Employee Wage - Use Class Method and Class Variables
    public static int checkEmployeeAttendance() {
        Random random = new Random();
        return random.nextInt(2); // 0 for absent, 1 for present
    }

    // UC2: Calculate Daily Employee Wage - Assume wage per Hour is 20, Assume full day Hour is 8
    public static int calculateDailyWage() {
        int wagePerHour = 20;
        int fullDayHour = 8;
        return wagePerHour * fullDayHour;
    }

    // UC3: Add Part-time Employee & Wage - Assume Part-time Hour is 8
    public static int calculatePartTimeWage() {
        int wagePerHour = 20;
        int partTimeHour = 8;
        return wagePerHour * partTimeHour;
    }

    // UC4: Solving using Switch Case Statement
    public static int calculateWageUsingSwitch(int employeeType) {
        int wagePerHour = 20;
        int hoursWorked = 0;

        switch (employeeType) {
            case 1:
                hoursWorked = 8; // Full-time
                break;
            case 2:
                hoursWorked = 4; // Part-time
                break;
            default:
                break;
        }

        return wagePerHour * hoursWorked;
    }

    // UC5: Calculating Wages for a Month - Assume 20 Working Day per Month
    public static int calculateMonthlyWage() {
        int workingDaysPerMonth = 20;
        int totalWage = 0;

        for (int day = 0; day < workingDaysPerMonth; day++) {
            totalWage += calculateDailyWage();
        }

        return totalWage;
    }

    // UC6: Calculate Wages till a condition of total working hours or days is reached for a month - Assume 100 hours and 20 days
    public static int calculateWagesWithCondition() {
        int workingDaysPerMonth = 20;
        int maxWorkingHours = 100;
        int totalWage = 0;
        int totalWorkingHours = 0;

        while (totalWorkingHours < maxWorkingHours && workingDaysPerMonth > 0) {
            totalWage += calculateDailyWage();
            totalWorkingHours += 8; // Assuming full-time hours
            workingDaysPerMonth--;
        }

        return totalWage;
    }

    // UC8: Compute Employee Wage for multiple companies - Note: Each Company has its own wage, number of working days and working hours per month - Use Class Method with function parameters instead of Class Variables
    public static int calculateWageForCompany(int wagePerHour, int workingDaysPerMonth, int maxWorkingHours) {
        int totalWage = 0;
        int totalWorkingHours = 0;

        while (totalWorkingHours < maxWorkingHours && workingDaysPerMonth > 0) {
            totalWage += wagePerHour * 8; // Assuming full-time hours
            totalWorkingHours += 8;
            workingDaysPerMonth--;
        }

        return totalWage;
    }

    public static void main(String[] args) {
        // UC1: Check Employee is Present or Absent
        int attendance = checkEmployeeAttendance();
        System.out.println("Employee is " + (attendance == 1 ? "Present" : "Absent"));

        // UC2: Calculate Daily Employee Wage
        int dailyWage = calculateDailyWage();
        System.out.println("Daily Wage: " + dailyWage);

        // UC3: Add Part-time Employee & Wage
        int partTimeWage = calculatePartTimeWage();
        System.out.println("Part-time Wage: " + partTimeWage);

        // UC4: Solving using Switch Case Statement
        int fullTimeWage = calculateWageUsingSwitch(1);
        System.out.println("Full-time Wage using Switch: " + fullTimeWage);

        // UC5: Calculating Wages for a Month
        int monthlyWage = calculateMonthlyWage();
        System.out.println("Monthly Wage for 20 days: " + monthlyWage);

        // UC6: Calculate Wages till a condition of total working hours or days is reached for a month
        int wageWithCondition = calculateWagesWithCondition();
        System.out.println("Wage with condition: " + wageWithCondition);

        // UC8: Compute Employee Wage for multiple companies
        int companyWage = calculateWageForCompany(25, 22, 120);
        System.out.println("Wage for Company: " + companyWage);
    }
}
