import java.util.Arrays;

public class DianMing {
    public  String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public  String job;
    public void say(String a){
        System.out.println(job+":"+a);
    }


    public static void main(String[] args){
        try{
            DianMing dianMing=new DianMing();
            dianMing.setJob("老师");
            dianMing.say("同学们上课,现在我们开始点名...");
            DianMing dianMing1=new DianMing();
            dianMing1.setJob("班长和同学们");
            dianMing1.say("老师好");
            dianMing.say("张三");
            DianMing dianMing2=new DianMing();
            dianMing2.setJob("张三");
            dianMing2.say("到");
            dianMing.say("李四");
            DianMing dianMing3=new DianMing();
            dianMing3.setJob("李四");
            dianMing3.say("到!");
            dianMing.say("王五");
            DianMing dianMing4=new DianMing();
            dianMing4.setJob("王五");
            dianMing4.say(".........");
            throw new Exception("老师在点名册上记下了王五旷课");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("老师：今天点名到此结束。现在开始上课！");
        }
    }
}
