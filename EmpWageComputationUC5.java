public class EmpWageComputationUC5{

    public static final int isPartTime=1;
    public static final int isFullTime=2;

    public static final int empRatePerHr=20;
    public static final int numWorkingDays=2;
    public static void main(String[] args){
        int empHrs = 0, empWage = 0, totalEmpWage= 0;
        for (int day =0; day<numWorkingDays; day++){
            int empCheck = (int) Math.floor(Math.random()) * 10 % 3;
            switch (empCheck){
                case isPartTime:
                    empHrs=4;
                    break;
                case isFullTime:
                    empHrs=8;
                    break;
                default:
                    empHrs=0;
            }
            empWage= empHrs * empRatePerHr;
            totalEmpWage += empWage;
            System.out.println("Emp Wage:" + empWage);
        }
        System.out.println("Total Emp Wage:" + totalEmpWage);
    }
}
