package com.tecsup.petclinic.services;

import com.tecsup.petclinic.entities.Owner;

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
}
