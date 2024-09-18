import java.util.ArrayList;

public class Trainer {
    private String name;
    private ArrayList<Pokemon> pokemons = new ArrayList<Pokemon>();

    Trainer(String name) {
        this.name = name;
    }

    void catchPokemon(Pokemon inputPokemon) {
        //add a pokemon to the pokemons ArrayList

         this.pokemons.add(inputPokemon);
         System.out.println(this.pokemons.get(0).getName());
         System.out.println(this.name);
    }

    //Method to access the trainer's pokemons and pick one - return Pokemon
}
