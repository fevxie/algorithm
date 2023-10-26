import data.structure.MyLinkedList;
import data.structure.SignalLinkedList;
import org.junit.Test;

public class LinkedNodeTest {
    @Test
    public void linkedNodeSize(){
        SignalLinkedList.LinkedNode node1 = new SignalLinkedList.LinkedNode(1);
        SignalLinkedList.LinkedNode node2 = new SignalLinkedList.LinkedNode(2);
        SignalLinkedList.LinkedNode node3 = new SignalLinkedList.LinkedNode(3);
        SignalLinkedList.LinkedNode node4 = new SignalLinkedList.LinkedNode(4);

        SignalLinkedList linkedList = new SignalLinkedList();

        linkedList.add(node1);
        linkedList.add(node2);
        linkedList.add(node3);
        linkedList.add(node4);
        System.out.println(linkedList.size());

        int linkedNodeSize = linkedList.size();

        System.out.println("倒数第{}个节点:" + linkedList.selectNode(linkedNodeSize-3).getVal());
    }

    @Test
    public void reverseLinkedListTest(){
        MyLinkedList.MyNode head = new MyLinkedList.MyNode(0);
        MyLinkedList.MyNode node1 = new MyLinkedList.MyNode(1);
        MyLinkedList.MyNode node2 = new MyLinkedList.MyNode(2);
        MyLinkedList.MyNode node3 = new MyLinkedList.MyNode(3);
        head.setNext(node1);
        node1.setNext(node2);
        node2.setNext(node3);

        MyLinkedList myLinkedList = new MyLinkedList();
        MyLinkedList.MyNode newHead = myLinkedList.reverseLinkedList(head);
        System.out.println(newHead.getData());
        MyLinkedList.MyNode node = newHead.getNext();
        while (node != null){
            System.out.println(node.getData());
            node = node.getNext();
        }
    }

    @Test
    public void bubbleSort(){
        MyLinkedList.MyNode head = new MyLinkedList.MyNode(0);
        MyLinkedList.MyNode node1 = new MyLinkedList.MyNode(1);
        MyLinkedList.MyNode node2 = new MyLinkedList.MyNode(2);
        MyLinkedList.MyNode node3 = new MyLinkedList.MyNode(3);
        head.setNext(node1);
        node1.setNext(node2);
        node2.setNext(node3);

        MyLinkedList linkedList = new MyLinkedList();
        linkedList.bubbleSortLinkedList(head);
    }
}
