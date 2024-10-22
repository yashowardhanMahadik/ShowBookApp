package model;

import lombok.AllArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class Seat {
    private int row;
    private int column;
    @Setter
    private Seatlock lockStatus;

    Seat(int row, int col){
        this.row = row;
        this.column = col;
        this.lockStatus = Seatlock.UNLOCKED;
    }
}
