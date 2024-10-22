package service;

import model.Booking;
import org.springframework.stereotype.Component;
import repo.BookingRepo;

@Component
public class BookingService {

    BookingRepo bookingRepo;
    ShowService showService;

    public BookingService(BookingRepo bookingRepo, ShowService showService) {
        this.bookingRepo = bookingRepo;
        this.showService = showService;
    }

    public void createBooking(Booking booking){
        bookingRepo.addBooking(booking);
    }

    public void completeBooking(String bookingId){
        Booking booking = bookingRepo.getBooking(bookingId);
        showService.blockSeatLocks(booking.getSelectedSeatIds(),booking.getShowId());
    }

}
