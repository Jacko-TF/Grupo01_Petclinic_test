package com.tecsup.petclinic.services;

import com.tecsup.petclinic.entities.Owner;
import com.tecsup.petclinic.entities.Pet;
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

    /**
     *
     * @param owner
     * @return
     */
    Owner update(Owner owner);

    Iterable<Owner> findAll();

    void delete(Integer id, String firstName) throws OwnerNotFoundException;

    Owner findById(Integer id) throws OwnerNotFoundException;

    List<Owner> findByName(String firstName);




}
