package TableReservation.Presenters;

import java.util.Date;

public interface ViewObserver {

    void onReservationTable(Date reservtionDate, int tableNo, String name);
    void onChangeReservationTable(int reservationNumber, Date newDate, int newTableNo, String newName);
}
