# == 和 euals 的对比

**==不是方法，是比较运算符!!**

1. ==：既可以判断基本类型，又可以判断引用类型；

2. ==：如基本类型给，判断的是值是否相等

   ```java
   int i = 10;
   double d = 10.0;
   ```

3. ==:如引用类型，判断的是地址是否相等，也就是判断是不是同一个对象

   ```java
   A obj1 = new A();
   A obj2 = new A();
   A obj3 = obj1;//引用赋值，其实是将obj1的地址给到obj3
   ```
**euqals是obj类的方法，只能判断引用类型！！**

equals JDK 源码

```
public boolean equals(Object anObject) {
        if (this == anObject) {
            return true;
            //判断是否是同一个对象
        }
        if (anObject instanceof String) { //判断类型是不是String
            String anotherString = (String)anObject;//向下转型
            int n = value.length; //如果字符串长度相等
            if (n == anotherString.value.length) { //依次比较字符
                char v1[] = value;
                char v2[] = anotherString.value;
                int i = 0;
                while (n-- != 0) {
                    if (v1[i] != v2[i])
                        return false;
                    i++;
                }
                return true;
            }
        }
        return false;
    }
   