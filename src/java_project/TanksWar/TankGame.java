/**
 * @author: 一只羊驼
 * @date: 2024/3/12
 */

package java_project.TanksWar;

import javax.swing.*;

public class TankGame extends JFrame {
    //定义MyPanel
    MyPanel mp = null;//初始化一个空面板

    public static void main(String args[]) {
        new TankGame();
    }

    public TankGame() {
        mp =new MyPanel();//新建一个面板
        this.add(mp);//把画布加到面板
        this.setSize(1000,750);//配置面板大小
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//配置退出按钮
        this.setVisible(true);
    }
}
