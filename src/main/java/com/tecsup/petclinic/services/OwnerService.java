package com.tecsup.petclinic.services;

import com.tecsup.petclinic.entities.Owner;
import com.tecsup.petclinic.exception.OwnerNotFoundException;

import java.util.List;

/**
 *
 * @author Jacko_Tinoco
 */
public interface OwnerService {
    /**
     *
     * @param owner
     * @return
     */
    Owner create(Owner owner);

    Iterable<Owner> findAll();
    Owner update(Owner owner);

    void delete(String firstName) throws OwnerNotFoundException;

    void deleteById(Integer id) throws OwnerNotFoundException;

    void deleteByName(String firstName) throws OwnerNotFoundException;

    Owner findById(Integer id) throws OwnerNotFoundException;

    List<Owner> findByName(String firstName);

    List<Owner> findByFirstName(String firstName);
}
