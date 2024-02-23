/**
 * @author: 一只羊驼
 * @date: 2024/2/23
 */

package java_advanced.com.Collection;

public class LinkedList01 {
    public static void main(String args[]) {
        //模拟一个简单的双向链表
        Node jack = new Node("jack");
        Node tom = new Node("Tom");
        Node mary = new Node("Mary");

        //链接三个节点，形成双向链表
        jack.next = tom;
        tom.next = mary;
        mary.pre = tom;
        tom.pre = jack;

        Node first = jack;//让 first 引用指向jack，就是双向链表的头节点
        Node last = mary;//让 last 引用指向mary，就是双向链表的尾节点

//        jack.next = mary;
//        mary.pre = jack;

        //在Tom和Mary之间插入林克
        Node link = new Node("link");
        tom.next=link;
        link.next=mary;
        mary.pre=link;
        link.pre=tom;

        //删除jack
        first=tom;
        tom.pre=null;

        //从头到尾遍历
        System.out.println("从头到尾遍历：");
        while (true) {
            if (first == null) {
                break;
            }
            System.out.println(first);
            first = first.next;
        }

        System.out.println("从尾到头遍历：");
        //从尾到头遍历
        while (true) {
            if (last == null) {
                break;
            }
            System.out.println(last);
            last = last.pre;
        }
    }
}

//定义一个Node类，表示双向链表的节点
class Node {
    public Object item;//真正存放数据
    public Node next;//指向下一个节点
    public Node pre;//指向前一个节点

    public Node(Object name) {
        this.item = name;
    }

    @Override
    public String toString() {
        return "Node name=" + item;
    }
}
