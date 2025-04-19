package Runner;

import internal.Cable;

public class CableRunner {
    public static void main(String[] args) {
        Cable cable = new Cable();
            cable.setType("HDMI");
            cable.setColor("Black");
            cable.setLength(2);
            cable.setFlexible(true);

            Cable cable1 = new Cable();
            cable1.setType("USB-C");
            cable1.setColor("White");
            cable1.setLength(3);
            cable1.setFlexible(false);

            Cable cable2 = new Cable();
            cable2.setType("HDMI");
            cable2.setColor("Black");
            cable2.setLength(2);
            cable2.setFlexible(true);

      System.out.println(cable);
      System.out.println(cable1);
      System.out.println(cable2);

      boolean match = cable.equals(cable2);
      boolean nomatch = cable2.equals(cable1);

      System.out.println("Match result:" +match);
      System.out.println("No match result;" +nomatch);

    }
    }

