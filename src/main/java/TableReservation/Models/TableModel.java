package TableReservation.Models;

import TableReservation.Presenters.Model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

public class TableModel implements Model {

    private Collection<Table> tables;

    @Override
    public Collection<Table> loadTables() {
        if (tables == null){
            tables = new ArrayList<>();
            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
        }
        return tables;
    }

    @Override
    public int reservationTable(Date reservationDate, int tableNo, String name) {
        for (Table table : tables){
            if (table.getNo() == tableNo){
                Reservation reservation = new Reservation(tableNo, reservationDate, name);
                table.getReservations().add(reservation);
                return reservation.getId();
            }
        }
        throw new RuntimeException("Некорректный номер столика");
    }

    @Override
    public int changeReservationTable(int reservationNumber, Date newDate, int newTableNo, String newName) {
        Boolean reservationFound = false;
        for (Table table : tables){
            for (Reservation res : table.getReservations()){
                if (res.getId() == reservationNumber){
                    table.getReservations().remove(res);
                    reservationFound = true;
                    break;
                }
            }
        }
        if (reservationFound){
            return reservationTable(newDate,newTableNo,newName);
        }
        throw new RuntimeException("Некорректный номер бронирования. Изменения не внесены.");
    }

}
