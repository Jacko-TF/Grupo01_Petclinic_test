package com.tecsup.petclinic.services;

import com.tecsup.petclinic.entities.Owner;
import com.tecsup.petclinic.exception.OwnerNotFoundException;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.yaml.snakeyaml.events.Event;

import java.util.List;

import static org.aspectj.bridge.MessageUtil.fail;
import static org.junit.jupiter.api.Assertions.assertEquals;
/**
 *
 * @author Mariajose_Soles
 */
@SpringBootTest
@Slf4j
public class OwnerServiceTest {

	@Autowired
	private OwnerService ownerService;

	@Test
	public void testFindOwnerById(){
		int ID = 1;
		String OWNER_FIRST_NAME = "Mariajose";
		Owner owner = null;

		try {

			owner = ownerService.findById(ID);

		} catch (OwnerNotFoundException e){
			fail(e.getMessage());
		}
		log.info(""+ owner);
		assertEquals(OWNER_FIRST_NAME,owner.getFirstName());
	}
	@Test
	public void testFindOwnerByName() {
		String OWNER_FIRST_NAME = "Mariajose";
		int SIZE_EXPECTED = 1;

		List<Owner> owners = this.ownerService.findByName(OWNER_FIRST_NAME);

		assertEquals(SIZE_EXPECTED, owners.size());
	}
	/*
	@Test
	public void testFindOwnerById() {

		long ID = 1;
		String NAME = "Jaime";
		Owner owner = null;

		try {

			owner = ownerService.findById(ID);

		} catch (OwnertNotFoundException e) {
			fail(e.getMessage());
		}
		log.info("" + owner);

		assertEquals(NAME, owner.getName());

	}
	*/
}
