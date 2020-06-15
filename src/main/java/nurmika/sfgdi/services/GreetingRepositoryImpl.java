package nurmika.sfgdi.services;

import org.springframework.stereotype.Component;

@Component
public class GreetingRepositoryImpl implements GreetingRepository {
    @Override
    public String getEnglishGreeting() {
        return "Hello World - EN";
    }

    @Override
    public String getSpanishGreeting() {
        return "Hola Mundo - ESP";
    }

    @Override
    public String getGermanGreeting() {
        return "Hallo Welt - DEUTSCHLAND";
    }
}
