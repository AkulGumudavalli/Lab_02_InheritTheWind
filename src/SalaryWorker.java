public class SalaryWorker extends Worker{
    private double annualSalary;
    public SalaryWorker(Worker worker, double annualSalary) {
        super(worker.getIdNumber(), worker.getFirstName(), worker.getLastName(), worker.getTitle(), worker.getYOB(), worker.getHourlyPay());
        this.annualSalary = annualSalary;

    }


    @Override
    public double calculateWeeklyPay(double hoursWorked) {
        return annualSalary/52;
    }

    public void displayWeeklyPay() {
        System.out.println("Given there are 52 weeks in a year, we can calulate given the annual pay "+annualSalary+" the weekly pay, by dividing annual pay by 52, we get"+annualSalary/52);
    }
}
