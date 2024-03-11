/**
 * @author: 一只羊驼
 * @date: 2024/3/11
 */

package java_project.TanksWar;

/**
 *  父类Tank,底下细分各种不同速度的坦克
 */
public class Tank {
    private int x; //坦克横坐标
    private int y; //坦克纵坐标

    public Tank(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
