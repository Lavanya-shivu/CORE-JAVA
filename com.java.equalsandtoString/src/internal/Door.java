package internal;

import java.util.Objects;

public class Door {

        private String material;
        private String color;
        private String type;
        private int height;

        public void setMaterial(String material) {
            this.material = material;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public void setType(String type) {
            this.type = type;
        }

        public void setHeight(int height) {
            this.height = height;
        }

        @Override
        public String toString() {
            return "Door{" + "material='" + material + ", color='" + color +", type='" + type + ", height=" + height + '}';
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof Door) {
                Door door = (Door) obj;
                if (Objects.equals(this.material, door.material) &&
                        Objects.equals(this.color, door.color) &&
                        Objects.equals(this.type, door.type) &&
                        Objects.equals(this.height,door.height)) {
                    System.out.println("Door is Matching");
                    return true;
                }
                System.out.println("Door is Not Matching");
                return false;
            }
            System.err.println("Invalid object passed for comparison");
            return false;
        }
}
