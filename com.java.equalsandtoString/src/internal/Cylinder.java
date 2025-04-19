package internal;

import java.util.Objects;

public class Cylinder {
    private String material;
    private String color;
    private int height;
    private int radius;

    public void setMaterial(String material){
        this.material = material;
    }
    public void setColor(String color){
        this.color = color;
    }
    public void setHeight(int height){
        this.height = height;
    }
    public void setRadius(int radius){
        this.radius = radius;
    }
    @Override
    public String toString(){
        return "{ Cylinder" + "material=" + material + "color=" + color+ "height=" + height+ "radius=" + radius+ '}';
    }
    @Override
    public boolean equals(Object obj){
        if (obj != null && obj instanceof Cylinder){
            Cylinder cylinder = (Cylinder) obj;
            if(Objects.equals(this.material,cylinder.material) &&
                    Objects.equals(this.color,cylinder.color) &&
                    Objects.equals(this.height,cylinder.height) &&
            Objects.equals(this.radius,cylinder.radius)){
                System.out.println("Cylinders are matching");
                return true;
            }
            System.out.println("Cylinders are not matching");
            return false;
        }
        System.out.println("Invalid object");
        return false;
    }
}
