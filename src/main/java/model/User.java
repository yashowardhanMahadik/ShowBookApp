package model;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class User {
    private final String name;
    private final String email;
    private final String userId;
    //etc
}
