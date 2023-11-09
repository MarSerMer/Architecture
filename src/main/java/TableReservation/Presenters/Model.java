package TableReservation.Presenters;

import TableReservation.Models.Reservation;
import TableReservation.Models.Table;

import java.util.Collection;
import java.util.Date;

public interface Model {

    Collection<Table> loadTables();

    int reservationTable(Date reservationDate, int tableNo, String name);

    int changeReservationTable(int reservationNumber, Date newDate, int newTableNo, String newName);

}
