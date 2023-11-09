package TableReservation.Models;

import java.util.Date;

public class Reservation {

    //region Methods
    @Override
    public String toString(){
        return String.format(date.toLocaleString() + " Бронирование #%d на имя: %s, номер столика: %d", id, name, tableNo);
    }

    //endregion

    //region Constructors

    public Reservation(int tableNo, Date date, String name) {
        this.tableNo = tableNo;
        this.date = date;
        this.name = name;
    }

    //endregion

    //region Public Properties

    public Date getDate() {
        return date;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    //endregion

    //region Fields

    private static int counter = 1000;
    private final int id;

    private final int tableNo;

    {
        id = ++counter;
    }

    private Date date;

    private String name;
    //endregion







}
