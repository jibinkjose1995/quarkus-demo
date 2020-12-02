package com.demo.repository;


import com.demo.entity.Player;
import org.springframework.data.repository.CrudRepository;

public interface PlayerRepository  extends CrudRepository<Player, Integer> {
}
