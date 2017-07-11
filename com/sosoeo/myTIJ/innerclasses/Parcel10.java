import com.sosoeo.myTIJ.innerclasses.Destination;

/**
 * Created by sky on 17-7-9.
 * 1. 实例初始化的实际效果就是构造器。
 */
public class Parcel10 {
    public Destination destination(final String dest,final float price){
        return new Destination() {
            private int cost;
            // instance initialization for each object:
            {
                cost = Math.round(price);
                if(cost > 100)
                    System.out.println("Over budget!");
            }
            private String label = dest;
            @Override
            public String readLabel() {
                return label;
            }
        };
    }

    public static void main(String[] args) {
        Parcel10 p = new Parcel10();
        Destination d = p.destination("testme",101.395F);

    }
}
