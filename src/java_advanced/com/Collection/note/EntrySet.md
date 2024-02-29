Map存放数据，Key-value。一对 K-V 是放在一个 HashMap$Node中的

```java
static class Node<K,V> implements Map.Entry<K,V>{
    final int hash;
        final K key;
        V value;
        Node<K,V> next;

    //链表
        Node(int hash, K key, V value, Node<K,V> next) {
            this.hash = hash;
            this.key = key;
            this.value = value;
            this.next = next;
        }
}
```

k-v为了方便遍历，会创建一个 EntrySet集合，该集合存放元素的类型是Entry。一个Entry 对象就有 k-v 

```java
Set<Map.Entry<K,V>> entrySet()
```

相当于是为了方便管理，Node里的数据先存放到一个 entry 里，entry 存放到 Set里，Set指向 Node

```java
HashMap hashMap = new HashMap();
        hashMap.put("no1", "zelda");
        hashMap.put("no2", "link");
        Set set = hashMap.entrySet();
        System.out.println(set.getClass()); 
        for (Object obj : set) {
            System.out.println(obj.getClass());
        }
```

![debug-1](E:\05-wanghanzhang\java\javaStudy\src\java_advanced\com\Collection\note\image-20240229141352513.png)

可以看到，真正的两个节点是table表里的两个数据。Entry是个集合，集合里放了两个东西，No2+No1，本质是把上面table里的两个节点放进来。也就是Entry集合里的No2和No1，其实是指向table表里的Node的

![debug-2](E:\05-wanghanzhang\java\javaStudy\src\java_advanced\com\Collection\note\image-20240229144517158.png)