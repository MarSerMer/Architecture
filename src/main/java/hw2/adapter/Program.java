package hw2.adapter;

public class Program {
    public static void main(String[] args) {
        HumanData humData = new HumanNote();
        SensorAnalytic analytic = new SensorAnalytic();
        ProgramData prData = new DataAdapter(humData);
        analytic.sensor(prData);
    }
}
