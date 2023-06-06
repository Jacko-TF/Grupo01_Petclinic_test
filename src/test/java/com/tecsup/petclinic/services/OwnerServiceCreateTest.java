package com.tecsup.petclinic.services;

import com.tecsup.petclinic.entities.Owner;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
@Slf4j
public class OwnerServiceCreateTest {

    @Autowired
    private OwnerService ownerService;

    @Test
    public void testCreateOwner() {

        String OWNER_FIRST_NAME = "Jacko";
        String OWNER_LAST_NAME = "Jacko";
        String OWNER_ADRESS = "315 Huarochiri Mayorazgo";
        String OWNER_CITY = "Ate";
        String OWNER_TELEFONO = "964950100";

        Owner owner = new Owner(OWNER_FIRST_NAME,OWNER_LAST_NAME, OWNER_ADRESS, OWNER_CITY, OWNER_TELEFONO);

        Owner ownerCreated = this.ownerService.create(owner);

        log.info("OWNER CREATED :" + ownerCreated.toString());

        assertNotNull(ownerCreated.getId());
        assertEquals(OWNER_FIRST_NAME, ownerCreated.getFirst_name());
        assertEquals(OWNER_LAST_NAME, ownerCreated.getLast_name());
        assertEquals(OWNER_ADRESS, ownerCreated.getAddress());
        assertEquals(OWNER_CITY, ownerCreated.getCity());
        assertEquals(OWNER_TELEFONO, ownerCreated.getTelephone());

    }
}
