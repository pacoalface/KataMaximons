package alface.francisco.kata_maxibons;

/**
 * Created by franciscoalfacemartin on 4/2/17.
 */

class Developer {

    private String name;
    private int numberOfMaxibons;

    public Developer(String name, int numberOfMaxibons) {
        this.name = name;
        this.numberOfMaxibons = numberOfMaxibons >= 0 ? numberOfMaxibons : 0;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfMaxibons() {
        return numberOfMaxibons;
    }

    @Override public String toString() {
        return "Developer{" + "name='" + name + '\'' + ", numberOfMaxibons=" + numberOfMaxibons + '}';
    }
}
