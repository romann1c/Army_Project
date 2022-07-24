package army_project;

public class ArmyData {
    private String name;
    private int score;
    private int personnel;
    private int tank;
    private int plane;
    private int missile;

    public void setName(String name) {
        this.name = name;
    }

    public void addTank(int input) {
        tank += 1 * input;
        score += 50 * input;
    }

    public void addPersonnel(int input) {
        personnel += 1 * input;
        score += 1 * input;
    }

    public void addPlane(int input) {
        plane += 1 * input;
        score += 100 * input;
    }

    public void addMissile(int input) {
        missile += 1 * input;
        score += 50 * input;
    }
}
