package internal;

import java.util.Objects;

public class Comb {
    private String material;
    private String color;
    private int teethcount;
    private boolean isFoldable;

    public void setMaterial(String material){
        this.material = material;
    }
    public void setColor(String color){
        this.color = color;
    }
    public void setTeethcount(int teethcount){
        this.teethcount = teethcount;
    }
    public void setFoldable(boolean isFoldable){
        this.isFoldable = isFoldable;
    }
    @Override
    public String toString() {
        return "Comb{" + "material='" + material +", color='" + color + ", teethCount=" + teethcount + ", isFoldable=" + isFoldable + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Comb) {
            Comb comb = (Comb) obj;
            if (Objects.equals(this.material, comb.material) &&
                    Objects.equals(this.color, comb.color) &&
                    Objects.equals(this.teethcount,comb.teethcount) &&
            Objects.equals(this.isFoldable,comb.isFoldable)) {
                System.out.println("Combs are matching");
                return true;
            }
            System.out.println("Combs are not matching");
            return false;
        }
        System.err.println("Invalid object passed for comparison");
        return false;
    }

}
