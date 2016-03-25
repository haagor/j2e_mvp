package fr.unice.bf.isola3000;


import fr.unice.bf.isola3000.entities.Customer;

import javax.ejb.Local;
import java.util.Optional;

@Local
public interface CustomerFinder {

	Optional<Customer> findByName(String name);

}

