package com.team2.worldtrekking;

import org.springframework.data.repository.CrudRepository;

public interface RegionRepository extends CrudRepository<Region, Long> {

    Region findRegionById(String id);

    /*Region findRegionByTitle(String title);*/
}