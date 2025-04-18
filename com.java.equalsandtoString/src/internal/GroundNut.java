package internal;

import java.util.Objects;

public class GroundNut {
    private String type;
    private String origin;
    private int weight;
    private int cost;

    public GroundNut(String type, String origin, int weight, int cost)
    {
        this.type=type;
        this.origin=origin;
        this.weight=weight;
        this.cost=cost;
    }
    @Override
    public String toString(){
        return "{ GroundNut" + "type=" + type + "origin=" + origin + "weight=" + weight + "cost="+ cost+ '}';
    }
    @Override
    public boolean equals(Object obj) {
        if(obj != null && obj instanceof GroundNut) {
            GroundNut groundNut = (GroundNut) obj;
            if (Objects.equals(this.type, groundNut.type) &&
                    Objects.equals(this.origin, groundNut.origin) &&
                    Objects.equals(this.weight, groundNut.weight) &&
                    Objects.equals(this.cost, groundNut.cost)) {
                System.out.println("GroundNut is Matching");
                return true;
            }
        }
            System.out.println("GroundNut is NotMatching");
            return false;
        }
    }
