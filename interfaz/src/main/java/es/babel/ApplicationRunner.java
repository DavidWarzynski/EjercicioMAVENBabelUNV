package es.babel;

import es.babel.applications.HangmanApplication;
import es.babel.configuration.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ApplicationRunner {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        HangmanApplication hangmanApplication = context.getBean(HangmanApplication.class);
        hangmanApplication.startNewGame();
    }
}
