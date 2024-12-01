package com.thehecklers.sburrestdemo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.thehecklers.sburrestdemo.model.Pokemon;

@Service
public class PokemonService
{
    private List<Pokemon> pokemons = new ArrayList<>();

	public PokemonService() {
		pokemons.addAll(List.of(
				new Pokemon("Pikachu"),
				new Pokemon("Charmander"),
				new Pokemon("Bulbasaur")
		));
	}

    public List<Pokemon> getAllPokemons()
    {
        return pokemons;
    }

    public Pokemon getPokemonById(String id)
    {
        for (Pokemon pokemon : pokemons)
            if (pokemon.getId().equals(id))
                return pokemon;

        return null;
    }

    public Pokemon addPokemon(Pokemon pokemon)
    {
        pokemons.add(pokemon);
        return pokemon;
    }

    public Pokemon editPokemon(String id, Pokemon editedPokemon)
    {
        Pokemon pokemon = getPokemonById(id);

        if (pokemon != null)
            pokemon.setName(editedPokemon.getName());
                
        return pokemon;
    }

    public Boolean deletePokemon(String id)
    {
        Pokemon pokemon = getPokemonById(id);

        if (pokemon != null)
        {
            pokemons.remove(pokemon);
            return true;
        }

        return false;
    }
}
