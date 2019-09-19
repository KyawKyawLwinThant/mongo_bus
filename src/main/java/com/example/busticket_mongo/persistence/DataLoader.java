package com.example.busticket_mongo.persistence;

import com.example.busticket_mongo.model.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Collection;

@Service
public class DataLoader implements CommandLineRunner {

    private MongoTemplate mongoTemplate;

    public DataLoader(MongoTemplate mongoTemplate) {
        this.mongoTemplate = mongoTemplate;
    }

    @Override @Profile("dev")
    public void run(String... args) throws Exception {
        BusRoute mandalayYangon=
                new BusRoute(
                   new Bus("JJ",BusStatus.MODERATE,
                           Arrays.asList(
                        new Seats("A1", SeatStaus.VACANT),
                        new Seats("A2", SeatStaus.VACANT),
                        new Seats("A3", SeatStaus.VACANT),
                        new Seats("A4", SeatStaus.VACANT),
                        new Seats("A5", SeatStaus.VACANT)
                   )),
                        new Routes("Mandalay","Yangon"),
                        LocalDateTime.now().plusDays(1),
                        LocalDateTime.now().plusDays(2),
                        Arrays.asList("Pegu","Pyinmana")
                );


        BusRoute yangonMandalay=
                new BusRoute(
                        new Bus("AungMyanmar",BusStatus.MODERATE,
                                Arrays.asList(
                                        new Seats("A1", SeatStaus.VACANT),
                                        new Seats("A2", SeatStaus.VACANT),
                                        new Seats("A3", SeatStaus.VACANT),
                                        new Seats("A4", SeatStaus.VACANT),
                                        new Seats("A5", SeatStaus.VACANT)
                                )),
                        new Routes("Yangon","Mandalay"),
                        LocalDateTime.now().plusDays(1),
                        LocalDateTime.now().plusDays(2),
                        Arrays.asList("Pegu","Pyinmana")
                );


        BusRoute yangonTaungyi=
                new BusRoute(
                        new Bus("TT",BusStatus.MODERATE,
                                Arrays.asList(
                                        new Seats("A1", SeatStaus.VACANT),
                                        new Seats("A2", SeatStaus.VACANT),
                                        new Seats("A3", SeatStaus.VACANT),
                                        new Seats("A4", SeatStaus.VACANT),
                                        new Seats("A5", SeatStaus.VACANT)
                                )),
                        new Routes("Yangon","Taungyi"),
                        LocalDateTime.now().plusDays(1),
                        LocalDateTime.now().plusDays(2),
                        Arrays.asList("TharSyi","Pyinmana","Kalaw")
                );

        Collection<BusRoute> busRoutes=
                Arrays.asList(mandalayYangon,yangonMandalay,yangonTaungyi);

      //  this.mongoTemplate.insertAll(busRoutes);


    }
}
