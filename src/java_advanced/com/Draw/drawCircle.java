/**
 * @author: 一只羊驼
 * @date: 2024/3/11
 */

package java_advanced.com.Draw;

import javax.swing.*;
import java.awt.*;

public class drawCircle extends JFrame { //对应一个窗口
    private MyPanel mp = null;

    public static void main(String args[]) {
        new drawCircle();

    }

    public drawCircle() { //构造器
        //初始化面板
        mp = new MyPanel();
        //把面板放入到窗口（画框）
        this.add(mp);
        //设置窗口的大小
        this.setSize(400, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}

//先定义一个 MyPanel，继承Jpanel
class MyPanel extends JPanel {
    @Override
    //窗口最大化、最小化会被调用
    //窗口的大小发生变化会被调用
    //repaint函数被调用时会被调用
    public void paint(Graphics g) {
        super.paint(g);//调用父类的方法，完成初始化
        g.drawOval(10, 10, 100, 100);
    }
}
