package com.sosoeo.myTIJ.holding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by sky on 17-7-14.
 * Arrays.asList() make its best guess about type.
 */
class Snow{}
class Powder extends Snow{}
class Light extends Powder{}
class Heavy extends Powder{}
class Crusty extends Snow{}
class Slush extends Snow{}

public class AsListInference {
    public static void main(String[] args) {
        List<Snow> snow1 = Arrays.asList(new Powder(),new Crusty(),new Slush());

        List<Snow> snow2 = Arrays.asList(new Light(),new Heavy());

        List<Snow> snow3 = new ArrayList<Snow>();
        Collections.addAll(snow3,new Light(),new Heavy());

        System.out.println(snow1);
        System.out.println(snow2);
        System.out.println(snow3);

        List<Snow> snow4 = Arrays.asList(new Light(),new Heavy());
        System.out.println(snow4);
    }
}
