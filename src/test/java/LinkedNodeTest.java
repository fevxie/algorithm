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
}
