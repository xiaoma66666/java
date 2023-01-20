package com.bjsxt;

import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Date;

import static com.bjsxt.GameUtil.*;

public class MyGameFrame extends Frame {
    Image bgImg=GameUtil.getImage("image/bg.jpg");
    Image planeImg=GameUtil.getImage("image/plane.png");
    Plane plane=new Plane(planeImg,200,200,7);
    Shell[] shells=new Shell[50];
    Explode explode;//声明炮弹
    Date startTime=new Date();
    Date endTime;
    int period;//玩了多少秒
    int x=200,y=200;
   //初始化窗口
    public void  launchFrame(){
        this.setTitle("飞机大战");
        this.setVisible(true);
        this.setSize(500,500);
        this.setLocation(300,300);
        //增加关闭窗口动作
        this.addWindowListener(new WindowAdapter() {

            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        //启动窗口绘制线程
        new PaintThread().start();
        //启动键盘监听
        this.addKeyListener(new KeyMonitor());
        //初始化50发炮弹
        for(int i=0;i<shells.length;i++)
        {
            shells[i]=new Shell();
        }
    }

    @Override
    public void paint(Graphics g) {
       g.drawImage(bgImg,0,0,FRAME_WIDTH,FRAME_HIGHT,null);
       plane.draMySelf(g);
      for(int i=0;i<shells.length;i++){
          shells[i].draMySelf(g);
          boolean peng=shells[i].getRec().intersects(plane.getRec());
          if (peng){
              plane.live=false;
              endTime=new Date();
              period=(int)((endTime.getTime()-startTime.getTime())/1000);

              if(!plane.live){
              printInfo(g,"游戏时间:"+period+"秒",30,200,200,Color.WHITE);
              }
          }
      }

      if(!plane.live){
          if(explode==null){
              explode=new Explode(plane.x,plane.y);
          }
          explode.draw(g);
      }
    }

public void printInfo(Graphics g,String str,int size,int x,int y,Color color){
        Font oldFont=g.getFont();
        Color oldColor=g.getColor();
        Font f=new Font("宋体",Font.BOLD,size);
        g.setFont(f);
        g.setColor(color);
        g.drawString(str,x,y);

        g.setFont(oldFont);
        g.setColor(oldColor);
    }
    //键盘监听内部类
    class KeyMonitor extends KeyAdapter {
        @Override
        public void keyPressed(KeyEvent e) {
           plane.addDirection(e);
        }

        @Override
        public void keyReleased(KeyEvent e) {
          plane.minusDirection(e);
        }
    }
    //重画线程
class PaintThread extends Thread{
    @Override
    public void run() {
        while (true)
        {
            repaint();
            try {
                Thread.sleep(40);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
    public static void main(String[] args) {
        MyGameFrame frame=new MyGameFrame();
        frame.launchFrame();
    }
    private Image offScreenImage=null;
    public void update(Graphics g){
        if(offScreenImage==null)
            offScreenImage=this.createImage(FRAME_WIDTH,FRAME_HIGHT);
        Graphics g0ff=offScreenImage.getGraphics();
        paint(g0ff);
        g.drawImage(offScreenImage,0,0,null);
    }
}
