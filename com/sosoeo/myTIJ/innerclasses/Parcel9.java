import com.sosoeo.myTIJ.innerclasses.Destination;

/**
 * Created by sky on 17-7-9.
 * 1. 匿名内部类是如何隐形继承接口的（没有implement）
 * 2. 匿名内部类是如何实现“构造器”的（使用函数的final参数）
 */
public class Parcel9 {
    public Destination destination(final String dest){
        return new Destination() {
            private String label = dest;
            @Override
            public String readLabel() {
                return label;
            }

        };
    }

    public static void main(String[] args) {
        Parcel9 p = new Parcel9();
        Destination d = p.destination("testyou");
    }


}
