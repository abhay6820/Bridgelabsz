class EmployeeWageComputation {

    public static final int FULL_TIME = 1;
    public static final int PART_TIME = 2;
    public static final int WAGE_PER_HOUR = 20;
    public static final int FULL_DAY_HOURS = 8;
    public static final int PART_TIME_HOURS = 4;
    public static final int WORKING_DAYS_PER_MONTH = 20;
    public static final int MAX_WORKING_HOURS = 100;

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program on Master Branch\n");
        System.out.println("Employee Type:");
        System.out.println("1-Full Time");
        System.out.println("2-Part Time");

        int totalWorkingHours = 0;
        int totalWorkingDays = 0;

        while (totalWorkingDays < WORKING_DAYS_PER_MONTH && totalWorkingHours < MAX_WORKING_HOURS) {
            int empType = (int) Math.floor(Math.random() * 3); // 0, 1, or 2

            int empHours = 0;
            switch (empType) {
                case FULL_TIME:
                    empHours = FULL_DAY_HOURS;
                    break;
                case PART_TIME:
                    empHours = PART_TIME_HOURS;
                    break;
                default:
                    empHours = 0;
            }

            int dailyWage = empHours * WAGE_PER_HOUR;
            totalWorkingHours += empHours;
            totalWorkingDays++;

            System.out.println("Day " + totalWorkingDays + ": Employee Type - " + empType +
                    ", Work Hours - " + empHours + ", Daily Wage - " + dailyWage);
        }

        int totalWage = totalWorkingHours * WAGE_PER_HOUR;
        System.out.println("\nTotal Wages for the month: " + totalWage);
    }
}
