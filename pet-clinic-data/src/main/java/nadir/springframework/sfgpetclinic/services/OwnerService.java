package nadir.springframework.sfgpetclinic.services;

import nadir.springframework.sfgpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {
    Owner FindByLastName(String lastName);
}
