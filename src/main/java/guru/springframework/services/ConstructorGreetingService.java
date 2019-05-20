package guru.springframework.services;

import org.springframework.stereotype.Service;

/**
 * Created by Doa on 20-5-2019.
 */
@Service
public class ConstructorGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello I was injecte via the constructor!!!";
    }
}
