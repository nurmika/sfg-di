package nurmika.sfgdi.services;

import org.springframework.stereotype.Service;

@Service
public class PropertyGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hallo Welt - Property";
    }
}
