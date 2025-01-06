import java.util.List;
import java.util.ArrayList;

public class Snowman {
    private double height;
    private String hatColor;
    private boolean isMagical;
    private List<String> accessories;

    public Snowman(double height, String hatColor, boolean isMagical) {
        this.height = height;
        this.hatColor = hatColor;
        this.isMagical = isMagical;
        this.accessories = new ArrayList<>();
    }

    public void decorate(String accessory) {
        accessories.add(accessory);
        System.out.println("Decorated snowman with: " + accessory);
    }

    public void melt() {
        if (height > 0) {
            height /= 2;
            if (height < 1) height = 0;
        }
    }

    public void makeMagical() {
        isMagical = true;
    }


    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getHatColor() {
        return hatColor;
    }

    public void setHatColor(String hatColor) {
        this.hatColor = hatColor;
    }

    public boolean isMagical() {
        return isMagical;
    }

    public void setMagical(boolean magical) {
        isMagical = magical;
    }

    public List<String> getAccessories() {
        return accessories;
    }

    public void setAccessories(List<String> accessories) {
        this.accessories = accessories;
    }
}
