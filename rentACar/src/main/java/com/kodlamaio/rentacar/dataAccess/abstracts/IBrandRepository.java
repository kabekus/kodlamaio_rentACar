package com.kodlamaio.rentacar.dataAccess.abstracts;

import com.kodlamaio.rentacar.entities.concrets.Brand;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IBrandRepository extends JpaRepository<Brand,Integer> {

}
