package internal;

import java.util.Objects;

public class Lock {
    private String brand;
    private String material;
    private String type;
    private int keyCount;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setKeyCount(int keyCount) {
        this.keyCount = keyCount;
    }

    @Override
    public String toString() {
        return "Lock{" + "brand='" + brand + ", material='" + material + ", type='" + type +", keyCount=" + keyCount + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Lock) {
            Lock lock = (Lock) obj;
            if (Objects.equals(this.brand, lock.brand) &&
                    Objects.equals(this.material, lock.material) &&
                    Objects.equals(this.type, lock.type) &&
                    Objects.equals(this.keyCount,lock.keyCount)) {
                System.out.println("Lock is Matching");
                return true;
            }
            System.out.println("Lock is Not Matching");
            return false;
        }
        System.err.println("Invalid object passed for comparison");
        return false;
    }
}
