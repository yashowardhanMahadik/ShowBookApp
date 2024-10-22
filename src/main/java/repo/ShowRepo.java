package repo;

import lombok.Getter;
import model.Seat;
import model.Seatlock;
import model.Show;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
@Getter
public class ShowRepo {
    private Map<String,Show> shows;

    private void init(Show s1){
        if(shows == null)
            shows = new HashMap<>();
        Map<String,Seat> seats = new HashMap<>();
        for(int i =1;i<21;i++){
            seats.put(i+","+i,new Seat(i,i,Seatlock.UNLOCKED));
        }
        s1.setTheaterSeats(seats);
    }
    //todo add Streams functions to do that

    public void addShow(Show show){
        init(show);
        shows.put(show.getId(),show);
    }
}
