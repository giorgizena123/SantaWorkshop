public class Reindeer extends WorkshopMember {
    private int flyingSpeed;
    private String noseColor;

    public Reindeer(String name, String nickName, int age, int flyingSpeed, String noseColor) {
        super(name, nickName, age);
        this.flyingSpeed = flyingSpeed;
        this.noseColor = noseColor;
    }

    public void fly() {
        System.out.println(getName() + " is flying with a speed of " + flyingSpeed + " km/h!");
    }

    public void trainForChristmas() {
        System.out.println(getName() + " is training for Christmas!");
    }

    public String checkFitnessLevel() {
        int score = flyingSpeed / getAge();
        char grade = 'F';
        if (score >= 80) {
            grade = 'A';
        } else if (score >= 60) {
            grade = 'B';
        } else if (score >= 40) {
            grade = 'C';
        } else if (score >= 20) {
            grade = 'D';
        }
        return "Fitness level for " + getName() + " is: " + grade;
    }


    public int getFlyingSpeed() {
        return flyingSpeed;
    }

    public void setFlyingSpeed(int flyingSpeed) {
        this.flyingSpeed = flyingSpeed;
    }

    public String getNoseColor() {
        return noseColor;
    }

    public void setNoseColor(String noseColor) {
        this.noseColor = noseColor;
    }
}
