package com.tecsup.petclinic.repositories;

import com.tecsup.petclinic.entities.Owner;
import com.tecsup.petclinic.entities.Pet;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OwnerRepository
        extends CrudRepository<Owner,Integer> {
    // Fetch owners by first_name
   /*List<Owner> findByFirstname(String first_name);*/

    // Fetch owners by id
    List<Owner> findById(int Id);

    @Override
    List<Owner> findAll();

}
