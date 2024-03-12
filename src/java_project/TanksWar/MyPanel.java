/**
 * @author: 一只羊驼
 * @date: 2024/3/11
 */

package java_project.TanksWar;

import javax.swing.*;
import java.awt.*;

/**
 * 坦克大战的绘图区域
 */
public class MyPanel extends JPanel {
    //定义我的坦克
    Hero hero = null;

    public MyPanel() {
        hero = new Hero(100, 100);//初始化自己坦克
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillRect(0, 0, 1000, 750);
        //画出坦克
        drawTank(hero.getX(),hero.getY(),g,0,0);
    }

    /**
     *
     * @param x：坦克的左上角x坐标
     * @param y：坦克的左上角y坐标
     * @param g：画笔
     * @param direct：坦克方向（上下左右）
     * @param type：坦克类型，颜色速度等
     */
    public void drawTank(int x, int y, Graphics g, int direct, int type) {

        //根据不同类型的坦克，设置不同颜色
        switch (type){
            case 0://我们的坦克
                g.setColor(Color.cyan);
                break;
            case 1://敌人的坦克
                g.setColor(Color.yellow);
                break;
        }

        //根据坦克方向，绘制坦克
        switch (direct){
            case 0://0 标识向上
                g.fill3DRect(x,y,10,60,false); //画出坦克左边的轮子
                g.fill3DRect(x+30,y,10,60,false); //画出坦克右边的轮子
                g.fill3DRect(x+10,y+10,20,40,false); //画出坦克中间的矩形
                g.fillOval(x+10,y+20,20,20); //画出坦克中间的圈
                g.drawLine(x+20,y+30,x+20,y); //画出坦克炮筒
                break;
            default:
                System.out.println("暂时不处理");
        }

    }
}
