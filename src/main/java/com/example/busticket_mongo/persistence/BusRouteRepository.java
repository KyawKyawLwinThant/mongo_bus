package com.example.busticket_mongo.persistence;

import com.example.busticket_mongo.model.BusRoute;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface BusRouteRepository extends MongoRepository<BusRoute,String> {

    List<BusRoute> findByBusNameContains(String busName);

    List<BusRoute> findByRoutesToCity(String toCity);

    @Query("{'bus.name':{$eq:?0}}")
    List<BusRoute> findAllBusName(String busName);
}
