package com.thehecklers.sburrestdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thehecklers.sburrestdemo.service.PokemonService;
import com.thehecklers.sburrestdemo.model.Pokemon;

@RestController
@RequestMapping("/pokemons")
public class PokemonController
{
    @Autowired
    private PokemonService pokemonService;

	@GetMapping
	Iterable<Pokemon> getAllPokemons() {
		return pokemonService.getAllPokemons();
	}

    @GetMapping("/{id}")
    Pokemon getPokemonById(@PathVariable String id)
    {
        return pokemonService.getPokemonById(id);
    }

    @PostMapping
    Pokemon addPokemon(@RequestBody Pokemon pokemon)
    {
        return pokemonService.addPokemon(pokemon);
    }

    @PutMapping("/{id}")
    Pokemon editPokemon(@PathVariable String id, @RequestBody Pokemon pokemon)
    {
        return pokemonService.editPokemon(id, pokemon);
    }

    @DeleteMapping("{id}")
    Boolean deletePokemon(@PathVariable String id)
    {
        return pokemonService.deletePokemon(id);
    }
}

