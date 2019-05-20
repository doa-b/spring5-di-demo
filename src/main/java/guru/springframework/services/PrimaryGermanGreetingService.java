package guru.springframework.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Created by Doa on 20-5-2019.
 */
@Service
@Primary
@Profile("de")
public class PrimaryGermanGreetingService implements GreetingService{

    @Override
    public String sayGreeting() {
        return "Guten tag from the German primary Greeting device";
    }
}
