package guru.springframework.services;

import org.springframework.stereotype.Service;

/**
 * Created by Doa on 16-5-2019.
 */
@Service
public class GreetingServiceImpl implements GreetingService{

    public static final String HELLO_GURUS = "Hello Gurus!!!!";

    @Override
    public String sayGreeting() {
        return HELLO_GURUS;
    }
}
