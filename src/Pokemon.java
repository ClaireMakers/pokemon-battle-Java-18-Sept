public class Pokemon {
    private String name;
    private Number healthPoints;
    private Number attackPoints;

    public Pokemon(String name, Number healthPoints, Number attackPoints) {
        this.name = name;
        this.healthPoints = healthPoints;
        this.attackPoints = attackPoints;
    }

    public String getName() {
        return this.name;
    }
}
