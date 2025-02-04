import java.util.List;

public class Worker extends Human {
    private final double hourlyPay;

    public Worker(String idNumber, String firstName, String lastName, String title, int YOB, double hourlyPay) {
        super(idNumber, firstName, lastName, title, YOB);
        this.hourlyPay=hourlyPay;
    }
    public double calculateWeeklyPay(double hoursWorked){
        double pay;
        if (hoursWorked > 40){
            pay = hourlyPay*(hoursWorked*1.5);
        }
        else{
            pay = hourlyPay *hoursWorked;
        }
        return pay;
    }
    public void displayWeeklyPay(double hoursWorked){
        double pay;
        if (hoursWorked > 40){
            pay = hourlyPay*(hoursWorked*1.5);
        }
        else{
            pay = hourlyPay *hoursWorked;
        }
        System.out.println("After "+hoursWorked+"hrs worked the pay would come out to "+pay);
    }

    @Override
    public List<String> toCSV() {
        List<String> actuaStuff = super.toCSV();
        actuaStuff.add(String.valueOf(hourlyPay));
        return actuaStuff;
    }

    @Override
    public String toXML() {
        String xml = super.toXML();
        return xml.replace("</person>","<Hourly Pay>"+hourlyPay+"</Hourly Pay>\n"+"</person>");
    }

    @Override
    public String toJson() {
        String json = super.toJson();
        return json.replace("}","  \"Hourly Pay\": " + hourlyPay+ "\n"+"}");

    }

    public double getHourlyPay() {
        return hourlyPay;
    }
}
