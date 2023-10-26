package data.structure;

import java.util.LinkedList;

/*
* 链表
* */
public class MyLinkedList {
    private final MyNode head;
    private int size;
    private MyNode last;


    public SignalLinkedList.LinkedNode merge2List(SignalLinkedList.LinkedNode node1, SignalLinkedList.LinkedNode node2){
        if(node1 == null){
            return node2;
        }
        if(node2 == null){
            return node1;
        }

        if(node1.getVal() < node2.getVal()){
            node1.setNext(merge2List(node2.getNext(), node2));
            return node1;
        }else{
            node2.setNext(merge2List(node2.getNext(), node1));
            return node2;
        }
    }
    public int size(){
        return this.size;
    }
    int listNodeCount;

    public MyLinkedList(){
        head = new MyNode();
        last = head;
    }

    private MyNode select(int index){
        MyNode node = head.getNext();
        for(int i=0; i<index; i++){
            node = node.getNext();
        }
        return node;
    }

    public Integer getData(int index){
        if (index <0 || index >size){
            return null;
        }
        MyNode node = select(index);
        return node.getData();
    }

    public void add(int data){
        MyNode node = new MyNode(data);
        last.setNext(node);
        last = node;
        size ++;
    }

    public MyNode getHead(){
        return head;
    }

    public MyNode getLast(){
        return last;
    }

    public MyNode getFirst(){
        return head.getNext();
    }

    public Integer delete(int index){
        if(index <0 || index >size){
            return null;
        }
        if(index ==0){
            MyNode node = head.getNext();
            head.setNext(node.getNext());
            size--;
            return node.getData();
        }

        MyNode preNode = select(index-1);
        MyNode deletedNode = preNode.getNext();
        preNode.setNext(deletedNode.getNext());
        deletedNode.setNext(null);
        size--;
        return deletedNode.getData();
    }

    public void sort(){
        MyNode[] nodes = new MyNode[size];
        MyNode node = head.getNext();
        for (int i=0; i<this.size; i++){
            nodes[i] = node;
            node = node.getNext();
        }

        // 冒泡排序
        for(int i=0;i<size;i++){
            for (int j=0; j<size-1-i; j++){
                if(nodes[j].getData() > nodes[j+1].getData()){
                    MyNode tmp = nodes[j];
                    nodes[j] = nodes[j+1];
                    nodes[j+1] = tmp;
                }
            }
        }
        //变更指针
        head.setNext(nodes[0]);
        for (int i=1; i<size; i++){
            nodes[i-1].setNext(nodes[i]);
        }

    }

    /*
    * 冒泡排序
    * */
    public MyNode bubbleSortLinkedList(MyNode head){
        if(head == null || head.next==null) return null;
        MyNode cur , tail = null;
        cur = head;
        while (cur.next != tail ){
            while (cur.next != tail){
                if(cur.getData() > cur.next.getData()){
                    int temp = cur.getData();
                    cur.data = cur.next.data;
                    cur.next.data = temp;
                }
                cur = cur.next;
            }
            tail = cur;
            cur = head;
        }
        return head;
    }

    /*
    * 归并排序
    * */
    public MyNode mergeSortLinkedList(MyNode head){
        if(head == null || head.next==null){
            return null;
        }

        // 查找中间节点
        MyNode midNode = midNode(head);

        MyNode rightNode = midNode.next;
        midNode.next = null;

        // 合并
        return  null;

    }

    private MyNode mergeSort(MyNode head1, MyNode head2){
        return null;
    }

    private MyNode midNode(MyNode head){
        if(head == null || head.next == null) return  null;
        MyNode slow = head, quick = head;
        while (quick.next != null && quick.next.next != null){
            slow = slow.next;
            quick = quick.next.next;
        }
        return slow;
    }

    /*
    * 链表逆序
    * */
    public MyNode reverseLinkedList(MyNode head){
        if(head == null || head.next == null) {
            return head;
        }
        MyNode pre = null;
        MyNode curr = head;
        while (curr != null){
            MyNode next = curr.next;
            curr.next = pre;
            pre = curr;
            curr = next;
        }
        return pre;
    }

    public static class MyNode{
        private int data;
        private MyNode next;

        public MyNode(){
        }

        public MyNode(int data){
            this.data = data;
        }

        public MyNode getNext(){
            return this.next;
        }

        public void setNext(MyNode next){
            this.next = next;
        }

        public int getData(){
            return this.data;
        }

        public void setData(int data){
            this.data = data;
        }
    }
}
