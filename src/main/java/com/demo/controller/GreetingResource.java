package com.demo.controller;

import com.demo.entity.Player;
import com.demo.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;


@RestController
@RequestMapping("/players")
public class GreetingResource {

    @Autowired
    PlayerRepository playerRepository;

    @GetMapping
    public List<Player> getPlayers() {
        List<Player> players = StreamSupport.stream(playerRepository.findAll().spliterator(), false).collect(Collectors.toList());
        return players;
    }

    @PostMapping
    public Player addPlayer(@RequestBody Player player)
    {
        return playerRepository.save(player);
    }
}