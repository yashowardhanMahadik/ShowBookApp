package repo;

import lombok.Getter;
import model.Seat;
import model.Seatlock;
import model.Show;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;

@Component
@Getter
public class ShowRepo {
    private Map<String,Show> shows;

    private void init(Show s1){
        if(shows == null)
            shows = new HashMap<>();
        Map<String,Seat> seats = new HashMap<>();
//        for(int i =1;i<21;i++){
//            seats.put(i+","+i,new Seat(i,i,Seatlock.UNLOCKED));
//        }
        //done:  add Streams functions to do that
        IntStream.range(1,21).forEach(i-> seats.put(i+","+i, new Seat(i,i,Seatlock.UNLOCKED)));
        s1.setTheaterSeats(seats);
    }

    public void addShow(Show show){
        init(show);
        shows.put(show.getId(),show);
    }

    public void modifySeats(List<String> seatIds, String showId, Seatlock type){
        Show currentShow = shows.get(showId);
        Map<String, Seat> theaterSeats = currentShow.getTheaterSeats();
        seatIds.stream().forEach(seatId -> {
            int c = Integer.getInteger( seatId.split(",")[0]);
             theaterSeats.put(seatId,new Seat(c,c,type));});
    }
}
