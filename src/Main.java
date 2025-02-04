import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        Worker worker1 = new Worker("00001", "Jack", "Smith", "Mr.", 1975,10.25);
        Worker worker2 = new Worker("00002", "Emma", "Johnson", "Ms.", 1982,13.45);
        Worker worker3 = new Worker("00003", "Michael", "Brown", "Dr.", 1990,15.45);
        SalaryWorker worker = new SalaryWorker(worker1,60000);
        SalaryWorker worker_2 = new SalaryWorker(worker2,80000);
        SalaryWorker worker_3 = new SalaryWorker(worker3,100000);
        ArrayList<Worker> workers = new ArrayList<Worker>();
        workers.add(worker1);
        workers.add(worker2);
        workers.add(worker3);
        workers.add(worker);
        workers.add(worker_2);
        workers.add(worker_3);
        int[] hoursWorkedInWeekSim = new int[3];
        hoursWorkedInWeekSim[0] = 40;
        hoursWorkedInWeekSim[1] = 50;
        hoursWorkedInWeekSim[2] = 40;
        ArrayList<Double> salary = new ArrayList<Double>();
        for(int hours:hoursWorkedInWeekSim){
            salary.add(workers.get(0).calculateWeeklyPay(hours));
            salary.add(workers.get(1).calculateWeeklyPay(hours));
            salary.add(workers.get(2).calculateWeeklyPay(hours));
        }
        System.out.printf("%-20s%-20s%-10s%-20s%-20s%10s\n","Week #","Amount worked","Worker", "First Name","Last Name","Amount Paid");
        int startIndex = 0;
        for(int i=0; i<hoursWorkedInWeekSim.length;i++){
            for(int k =0; k<3;k++){
                System.out.printf("%-20s%-20d%-10s%-20s%-20s%10f\n","Week "+(i+1),hoursWorkedInWeekSim[i],workers.get(k).getIdNumber(),workers.get(k).getFirstName(),workers.get(k).getLastName(), salary.get(k + startIndex));
            }
            startIndex += 3;
        }




    }
}
