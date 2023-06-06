package com.tecsup.petclinic.repositories;

import com.tecsup.petclinic.entities.Owner;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OwnerRepository extends CrudRepository<Owner,Integer> {
    List<Owner> insert(Owner owner);
    List<Owner> findbyNmae(String first_name);
    List<Owner> findById(int id);
    List<Owner> update(int id);
    List<Owner> delete(int id);
    List<Owner> delete(String last_name);

}
