package Runner;

import internal.CareerDream;
import internal.Dream;
import internal.TravelDream;

public class DreamRunner {
    public static void main(String[] args) {
        Dream dream = new CareerDream();
        dream.imagine();
        dream.pursue();
        dream.struggle();
        dream.succeed();
        dream.reflect();

        System.out.println("------------");

        Dream dream1 = new TravelDream();
         dream1.imagine();
         dream1.pursue();
         dream1.struggle();
         dream1.succeed();
         dream1.reflect();

        }
    }
