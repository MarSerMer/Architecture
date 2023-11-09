package TableReservation.Views;

import TableReservation.Models.Reservation;
import TableReservation.Models.Table;
import TableReservation.Presenters.View;
import TableReservation.Presenters.ViewObserver;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

public class BookingView implements View {

    private Collection<ViewObserver> observers = new ArrayList<>();

    @Override
    public void registerObserver(ViewObserver observer) {
        observers.add(observer);
    }

    @Override
    public void showTables(Collection<Table> tables) {
        for (Table table : tables){
            System.out.println(table);
        }
    }

    @Override
    public void showReservations(Collection<Table> tables) {
        for (Table table: tables){
            for (Reservation res: table.getReservations()) {
                System.out.println(res);
            }
        }
    }

    @Override
    public void showReservationTableResult(int reservationNo) {
        if (reservationNo > 0)
            System.out.printf("Столик успешно забронирован. Номер резерва #%d\n", reservationNo);
        else
            System.out.println("Невозможно забронировать столик.\nПовторите попытку позже.");
    }

    @Override
    public void showChangeReservationTableResult(int reservationNo) {
        if (reservationNo > 0)
            System.out.printf("Изменения внесены. Новый номер резерва #%d\n", reservationNo);
        else
            System.out.println("Что-то пошло не так, зменения не внесены.\nПовторите попытку позже.");
    }


    public void reservationTable(Date reservationDate, int tableNo, String name){
        for (ViewObserver observer : observers)
            observer.onReservationTable(reservationDate, tableNo, name);
    }

    public void changeReservationTable(int oldReservation, Date reservationDate, int tableNo, String name){
        for (ViewObserver observer : observers)
            observer.onChangeReservationTable(oldReservation,reservationDate,tableNo,name);
    }

}
