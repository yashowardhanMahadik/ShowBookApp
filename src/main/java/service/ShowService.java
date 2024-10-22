package service;

import exception.ShowCreatedException;
import model.Seat;
import model.Seatlock;
import model.Show;
import org.springframework.stereotype.Component;
import repo.ShowRepo;

import java.util.List;
import java.util.Map;

@Component
public class ShowService {

    ShowRepo repo;

    public ShowService(ShowRepo repo) {
        this.repo = repo;
    }

    public void  createShow(String id, String name){
        repo.addShow(new Show(id,name));
    }

    public Map<String,Seat> getAvailableSeats(String showId){
        if(repo.getShows() == null || repo.getShows().get(showId)==null){
            throw new ShowCreatedException("Unable to get the seats");
        }
        return repo.getShows().get(showId).getTheaterSeats();
    }

    public void setSeatLocks(List<String> selectedSeats, String showId){
        Map<String,Seat> seats = repo.getShows().get(showId).getTheaterSeats();
        selectedSeats.stream().map(id-> seats.get(id)).forEach(seat -> seat.setLockStatus(Seatlock.LOCKED));
    }

    public void releaseSeatLocks(List<String> selectedSeats, String showId){
        Map<String,Seat> seats = repo.getShows().get(showId).getTheaterSeats();
        selectedSeats.stream().map(id-> seats.get(id)).forEach(seat -> seat.setLockStatus(Seatlock.UNLOCKED));
    }

    public void blockSeatLocks(List<String> selectedSeats, String showId){
        Map<String,Seat> seats = repo.getShows().get(showId).getTheaterSeats();
        selectedSeats.stream().map(id-> seats.get(id)).forEach(seat -> seat.setLockStatus(Seatlock.BLOCKED));
    }
}
