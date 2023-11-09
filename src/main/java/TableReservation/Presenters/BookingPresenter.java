package TableReservation.Presenters;

import java.util.Date;

public class BookingPresenter implements ViewObserver {

    private final Model model;
    private final View view;

    public BookingPresenter(Model model, View view) {
        this.model = model;
        this.view = view;
        this.view.registerObserver(this);
    }
    public void updateTables(){
        view.showTables(model.loadTables());
    }

    public void updateReservations(){
        view.showReservations(model.loadTables());
    }

    private void showReservationTableResult(int reservationNo){
        view.showReservationTableResult(reservationNo);
    }

    private void showChangeReservationTable(int reservationNo){
        view.showChangeReservationTableResult(reservationNo);
    }

    @Override
    public void onReservationTable(Date reservtionDate, int tableNo, String name) {
        try {
            int reservationNo = model.reservationTable(reservtionDate, tableNo, name);
            showReservationTableResult(reservationNo);
        }
        catch (RuntimeException e){
            showReservationTableResult(-1);
        }
    }

    @Override
    public void onChangeReservationTable(int reservationNumber, Date newDate, int newTableNo, String newName) {
        try {
            int no = model.changeReservationTable(reservationNumber,newDate,newTableNo,newName);
            showChangeReservationTable(no);
        }
        catch (RuntimeException e){
            showChangeReservationTable(-1);
        }
    }



}
