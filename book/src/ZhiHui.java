public class ZhiHui {
        public static void ZhiHui(JoaoTong light){
            if (light instanceof Red){
                System.out.println("红灯亮45秒");
            }
            if (light instanceof Yellow){
                System.out.println("黄灯亮5秒");
            }
            if (light instanceof green){
                System.out.println("绿灯亮30秒");
            }
        }

    public static void main(String[] args) {
        JoaoTong red=new Red();
        ZhiHui(red);
        JoaoTong yellow=new Yellow();
        ZhiHui(yellow);;
        JoaoTong green=new green();
        ZhiHui(green);
    }
}
