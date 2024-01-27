# JAVA实战项目一
**项目名：零钱通**

## 需求
>
>完成收益入账、消费、查看明细、退出系统等功能

## 步骤
1.先完成显示菜单，并可以选择
>
>选择 1 ，输出零钱通明细
>
>选择 2 ，输出收益入账
>
>选择 3 ，输出消费
>
>选择 4 ，输出退出
>
>提示语：“请选择（1-4）：”

```$java
        int i;
        //定义循环：是否还要循环显示，默认不输入4就一直循环
        boolean loop = true;
        System.out.println("----------------零钱通菜单----------------");
        System.out.println("                1 零钱通明细              ");
        System.out.println("                2 收益入账                ");
        System.out.println("                3 消费                   ");
        System.out.println("                4 退     出              ");
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.print("请选择（1-4）：");
            i=scanner.nextInt();
            switch (i){
                case 1:
                    System.out.println("----------------零钱通明细----------------");
                    break;
                case 2:
                    System.out.println("-----------------收益入账-----------------");
                    break;
                case 3:
                    System.out.println("-------------------消费------------------");
                    break;
                case 4:
                    System.out.println("-----------------退     出---------------");
                    return;
                //不要忘记可以写个default!!
                default:
                    System.out.println("选择有误，请重新选择！");
            }
        }while (loop);
```
2.完成零钱通明细
> 示例：
>
> 收益入账 +100.0 2024-01-27 19：43 余额：100.0
>
> 消费    -20.0  2024-01-27 19：43 余额：80.0
>
>可以使用三种方式
>
>（1）数组，但是需要动态创建
>
>（2）字符串拼接
>
```$java
System.out.println("收益入账\t+" + money + "\t" + sdf.format(date) + "\t\t" + "余额\t" + balance);
```

>（3）对象
>
>
3.完成收益入账
> 定义变量
>
>（1）充值金额 money，用Double接收
>
>（2）余额 balance，每次充值后 balance + = money
>
>（3）日期，引入 java.util.Date,并格式化
>
4.完成消费
> 定义变量
>
>（1）消费原因 scanner接收
>
>（2）付款金额 money，用Double接收
>
>（3）余额 balance，每次付款后 balance - = money
>
>（4）日期，引入 java.util.Date,并格式化
>
4.退出确认
>(1)用户输入 4 退出时，给出提示判断是否真的要退出？，必须正确输入y/n，否则一直循环
>
```$java
            case 4:
                    int index=0;
                    do{
                        System.out.println("确定要退出零钱通吗？（y/n）");
                        choice=scanner.next().charAt(0);
                        //输入必须是y/n，否则无限循环
                        if(choice=='y'){
                            System.out.println("您已经成功退出零钱通项目");
                            return;
                        }else if(choice=='n'){
                            index=-1;
                        }else {
                            System.out.println("请正确输入（y/n）！");
                        }
                    }while (index!=-1);
                    break;
```

>（2）收益和入账时，判断金额是否合理，并给出提示
>
>（3）将以上面向过程代码改成面向对象