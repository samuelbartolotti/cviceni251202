public class SpaceShip {
    String name;
    String pilot;

    @Override
    public String toString() {
        return "SpaceShip{" +
                "name='" + name + '\'' +
                ", pilot='" + pilot + '\'' +
                '}';
    }

    public SpaceShip(String n, String p) {
        name = n;
        pilot = p;
    }
}
