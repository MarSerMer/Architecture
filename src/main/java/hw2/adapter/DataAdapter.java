package hw2.adapter;

public class DataAdapter implements ProgramData{

    HumanData humanData;

    public DataAdapter(HumanData humanData) {
        this.humanData = humanData;
    }

    @Override
    public void translate() {
        humanData.write();
    }
}
