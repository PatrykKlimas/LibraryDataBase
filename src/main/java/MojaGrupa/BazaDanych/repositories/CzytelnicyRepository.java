package MojaGrupa.BazaDanych.repositories;

import MojaGrupa.BazaDanych.BazyDanych.Czytelnicy;
import org.springframework.data.repository.CrudRepository;

public interface CzytelnicyRepository extends CrudRepository<Czytelnicy, Long> {
}
