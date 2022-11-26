package com.Locationweb04.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;


import com.Locationweb04.Entity.Location;

public interface LocationRepository extends JpaRepository<Location, Long> {

}
