/**
 * @author: 一只羊驼
 * @date: 2024/2/6
 */

package java_advanced.com.work;

public class work08 {
    public static void main(String args[]) {
        Color[] colors = Color.values();
        for (Color color : colors) {
            switch (color) {
                case RED:
                    System.out.println("匹配到红色");
                    System.out.print(color.name() + " ");
                    color.show();
                    break;
                case GREEN:
                    System.out.println("匹配到绿色");
                    System.out.print(color.name() + " ");
                    color.show();
                    break;
                case BLUE:
                    System.out.println("匹配到蓝色");
                    System.out.print(color.name() + " ");
                    color.show();
                    break;
                case BLACK:
                    System.out.println("匹配到黑色");
                    System.out.print(color.name() + " ");
                    color.show();
                    break;
                case YELLOW:
                    System.out.println("匹配到黄色");
                    System.out.print(color.name() + " ");
                    color.show();
                    break;
                default:
                    System.out.println("没有匹配到任何值！");
                    return;
            }
        }
        //枚举值在switch中使用，switch() case写枚举的name


    }
}

enum Color implements T {
    RED(255, 0, 0), BLUE(0, 0, 255),
    BLACK(0, 0, 0), YELLOW(255, 255, 0),
    GREEN(0, 255, 0);

    private int RedValue;
    private int GreenValue;
    private int BlueValue;

    private Color(int redValue, int greenValue, int blueValue) {
        RedValue = redValue;
        GreenValue = greenValue;
        BlueValue = blueValue;
    }

    @Override
    public void show() {
        System.out.println("(" + RedValue + "," + GreenValue + "," + BlueValue + ")");
    }

    @Override
    public String toString() {
        return "Color(" +
                "RedValue=" + RedValue +
                ", GreenValue=" + GreenValue +
                ", BlueValue=" + BlueValue +
                ')';
    }

}

interface T {
    public void show();
}