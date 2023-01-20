

public class TestOverride {
    public static void main(String[] args) {
        Horse h = new Horse();
        Plane p = new Plane();
        h.run();
        h.getVehicle();
        p.run();
    }
}

    class Vehicle{     //交通工具类
        public void run(){
            System.out.println("跑");
        }
        public Vehicle getVehicle(){
            System.out.println("给你一个交通工具");
            return null;
        }

    }
    class   Horse extends Vehicle{//马也是交通工具


        @Override
        public void run() {
            System.out.println("得得得....");
        }

    @Override
    public Horse getVehicle(){
        return new Horse();
    }
    }
   class Plane extends Vehicle{
        @Override
        public void run() {
            System.out.println("天上飞");
        }
    }

