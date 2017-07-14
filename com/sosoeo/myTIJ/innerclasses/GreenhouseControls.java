package com.sosoeo.myTIJ.innerclasses;

/**
 * Created by sky on 17-7-13.
 */
public class GreenhouseControls extends Controller{
    private boolean light = false;
    public class LightOn extends Event{
        public LightOn(long delayTime){super(delayTime);}
        @Override
        public void action() {
            light = true;
        }

        @Override
        public String toString() {
            return ("light is on");
        }
    }

    public class Bell extends Event{
        public Bell(long delayTime){
            super(delayTime);
        }
        public void action(){
            addEvent(new Bell(delayTime));
        }
    }

    public class LightOff extends Event{
        public LightOff(long delayTime){super(delayTime);}
        @Override
        public void action() {
            light = false;
        }

        @Override
        public String toString() {
            return ("light is off");
        }
    }

    private boolean water = false;
    public class WaterOn extends Event{
        public WaterOn(long delayTime){super(delayTime);}

        @Override
        public void action() {
            water = true;
        }

        @Override
        public String toString() {
            return ("Water is on");
        }
    }

    public class WaterOff extends Event{
        public WaterOff(long delayTime){super(delayTime);}

        @Override
        public void action() {
            water = false;
        }

        @Override
        public String toString() {
            return ("Water is off");
        }
    }
    private String thermostate = "Day";
    public class thermostateDay extends Event{
        public thermostateDay(long delayTime){super(delayTime);}

        @Override
        public void action() {
            thermostate = "Day";
        }

        @Override
        public String toString() {
            return ("thermostate on day");
        }
    }

    public class thermostateNight extends Event{
        public thermostateNight(long delayTime){
            super(delayTime);
        }

        @Override
        public void action() {
            thermostate = "Night";
        }

        @Override
        public String toString() {
            return ("thermostate on night");
        }
    }
    public class Restart extends Event{
        private Event[] eventList;
        public Restart(long delayTime,Event[] eventList){
            super(delayTime);
            this.eventList = eventList;
            for(Event e: eventList){
                addEvent(e);
            }
        }

        @Override
        public void action() {
            for(Event e:eventList){
                e.start();//restart each event
                addEvent(e);
            }
            start();
            addEvent(this);
        }
    }

    @Override
    public String toString() {
        return "restarting system";
    }

    public static class Terminate extends Event{
        public Terminate(long delayTime) {super(delayTime);}

        @Override
        public void action() {
            System.exit(0);
        }

        @Override
        public String toString() {
            return "Terminating";
        }
    }
}

