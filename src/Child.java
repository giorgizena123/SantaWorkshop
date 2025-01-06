import java.util.ArrayList;
import java.util.List;

public class Child {
    private String name;
    private int behaviorScore;
    private List<String> wishList;

    public Child(String name, int behaviorScore) {
        this.name = name;
        this.behaviorScore = behaviorScore;
        this.wishList = new ArrayList<>();
    }

    public void addWish(String wish) {
        wishList.add(wish);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBehaviorScore() {
        return behaviorScore;
    }

    public void setBehaviorScore(int behaviorScore) {
        this.behaviorScore = behaviorScore;
    }

    public List<String> getWishList() {
        return wishList;
    }

    public void setWishList(List<String> wishList) {
        this.wishList = wishList;
    }
}
