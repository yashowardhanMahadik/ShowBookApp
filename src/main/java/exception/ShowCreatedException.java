package exception;

import org.springframework.stereotype.Component;

@Component
public class ShowCreatedException extends RuntimeException{
    public ShowCreatedException(String msg){
        super(msg);
    }
}
