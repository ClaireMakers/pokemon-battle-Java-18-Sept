public class Main {
    public static void main(String[] args) {
        Pokemon pikachu = new Pokemon("Pikachu", 10, 3 );
        Pokemon bulbasaur = new Pokemon("Bulbasaur", 15, 10 );

        Trainer ash = new Trainer("Ash");
        ash.catchPokemon(pikachu);

        Trainer gary = new Trainer("Gary");
        gary.catchPokemon(bulbasaur);
    }
}