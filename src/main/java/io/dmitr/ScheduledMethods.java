package io.dmitr;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * Created by dmaslov on 9/17/17.
 */
@Component
@Qualifier("ScheduledMethods")
public class ScheduledMethods {


    @Scheduled(fixedRate = 1000)
    public void firstLongMethod() {
    //
        while (true) {
            long i = 100 + System.currentTimeMillis();

        }
    }

    @Scheduled(fixedRate = 1000)
    public void secondLongMethod() {

        System.out.println("Second Method Invoked");

    }

}
