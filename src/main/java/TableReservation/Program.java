package TableReservation;

import TableReservation.Models.TableModel;
import TableReservation.Presenters.BookingPresenter;
import TableReservation.Presenters.Model;
import TableReservation.Views.BookingView;

import java.util.Date;

public class Program {

    //TODO: метод changeReservationTable должен заработать
    public static void main(String[] args) {
        Model model = new TableModel();
        BookingView view = new BookingView();
        BookingPresenter presenter = new BookingPresenter(model, view);
        presenter.updateTables();

        view.reservationTable(new Date(), 3, "Станислав");
        presenter.updateReservations();

        view.changeReservationTable(1001, new Date(), 2, "Станислав");
        presenter.updateReservations();
    }

}
