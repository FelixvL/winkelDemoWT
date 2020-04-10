package com.felix.winkel.controller;

import com.felix.winkel.domein.Bestelling;
import org.springframework.data.repository.CrudRepository;

public interface BestellingRepository extends CrudRepository<Bestelling, Long> {
}
