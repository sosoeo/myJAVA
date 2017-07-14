package com.sosoeo.myTIJ.innerclasses;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sky on 17-7-13.
 */
public class Controller {
    private List<Event> eventList = new ArrayList<Event>();
    public void addEvent(Event c){eventList.add(c);}
    public void run(){
        while (eventList.size() > 0){
            //Make a copy so your're not modifying the list
            //while your're selecting the element in it
            for(Event e:new ArrayList<Event>(eventList)){
                if(e.ready()){
                    System.out.println(e);
                    e.action();
                    eventList.remove(e);
                }
            }
        }
    }
}
