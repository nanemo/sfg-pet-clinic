package nadir.springframework.sfgpetclinic.services;

import nadir.springframework.sfgpetclinic.model.Owner;

import java.util.Set;

public interface OwnerService {

    Owner FindByLastName(String lastName);

    Owner findById(Long id);

    Owner save(Owner owner);

    Set<Owner> findAll();
}
