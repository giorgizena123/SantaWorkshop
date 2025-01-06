import java.util.List;
import java.util.ArrayList;

public class Santa extends WorkshopMember implements ChristmasSpirit {

    private List<Child> childrenList;


    public Santa(String name, String nickName, int age, List<Child> childrenList) {
        super(name, nickName, age);
        this.childrenList = childrenList;
    }



    @Override
    public void spreadJoy() {
        System.out.println("Spreading holiday cheer everywhere!");
    }

    @Override
    public void singCarols() {
        System.out.println("Singing Christmas carols to everyone!");
    }

    @Override
    public void decorateTree() {
        System.out.println("Decorating the Christmas tree with beautiful ornaments!");
    }


    public List<Child> checkNaughtyOrNiceList() {
        List<Child> niceChildren = new ArrayList<>();

        for (Child child : childrenList) {
            if (child.getBehaviorScore() > 5) {
                niceChildren.add(child);
            }
        }

        return niceChildren;
    }


    public void deliverGifts() {
        List<Child> niceChildren = checkNaughtyOrNiceList();
        System.out.println("Delivering gifts to the following nice children:");
        for (Child child : niceChildren) {
            System.out.println(child.getName() + " with a behavior score of " + child.getBehaviorScore());
        }
    }


    public List<Child> getChildrenList() {
        return childrenList;
    }

    public void setChildrenList(List<Child> childrenList) {
        this.childrenList = childrenList;
    }



    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Santa santa = (Santa) obj;
        return childrenList.equals(santa.childrenList);
    }

    @Override
    public int hashCode() {
        return childrenList.hashCode();
    }

    @Override
    public String toString() {
        return "Santa{" +
                "name='" + getName() + '\'' +
                ", nickName='" + getNickName() + '\'' +
                ", age=" + getAge() +
                ", childrenList=" + childrenList +
                '}';
    }
}
