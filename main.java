import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class main {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(5);
        myLinkedList.add(8);
        myLinkedList.add(3);

//        System.out.println("Before Sort:");
//        for (int i = 0; i < myLinkedList.size(); i++) {
//            System.out.println(myLinkedList.getData(i));
//        }
//
//        System.out.println("After Sort:");
//        myLinkedList.sort();
        MyLinkedListSort(myLinkedList.getHead());
//        for (int i = 0; i < myLinkedList.size(); i++) {
//            System.out.println(myLinkedList.getData(i));
//        }
//        System.out.println("First Node Data:" + myLinkedList.getFirst().getData());
//        System.out.println("Last Node Data:" + myLinkedList.getLast().getData());
    }

    public static void MyLinkedListSort(MyLinkedList.MyNode head){
        ArrayList<MyLinkedList.MyNode> nodes = new ArrayList<>();
        MyLinkedList.MyNode node = head.getNext();
        while (node != null){
            nodes.add(node);
            node = node.getNext();
        }

        MyLinkedList.MyNode[] arrayNodes = new MyLinkedList.MyNode[nodes.size()];
        arrayNodes = nodes.toArray(arrayNodes);

        for(MyLinkedList.MyNode myNode : arrayNodes){
            System.out.println("Before Sort:"+myNode.getData());
        }

        //冒泡排序

        for (int i=0; i<arrayNodes.length-1; i++){
            for (int j=0; j<arrayNodes.length-1-i; j++){
                if(arrayNodes[j].getData() > arrayNodes[j+1].getData()){
                    MyLinkedList.MyNode tmp = arrayNodes[j];
                    arrayNodes[j] = arrayNodes[j+1];
                    arrayNodes[j+1] = tmp;
                }
            }
        }

        for (MyLinkedList.MyNode myNode: arrayNodes) {
            System.out.println("After Sort:"+myNode.getData());
        }
        for(int i=0;i<arrayNodes.length-1;i++){
            arrayNodes[i].setNext(arrayNodes[i+1]);
        }

        for(MyLinkedList.MyNode myNode: arrayNodes){
            System.out.println("New Sorted LinkedList:"+ myNode.getNext().getData());
        }
    }




    public static int stageCount(int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }else if(n>1){
            return stageCount(n-1) + stageCount(n-2);
        }
        return  0;
    }

    public static int count2(int n){
        if(n<=2){
            return n;
        }
        int sum=0;
        int f1=1;
        int f2=2;
        for(int i=3; i<=n; i++){
            sum = f1+f2;
            f1=f2;
            f2=sum;
        }
        return sum;
    }


    public static int removeElement(int[] nums, int val) {
        int n = nums.length;
        int left =0;
        for(int right=0; right<n; right++){
            if(nums[right] != val){
                nums[left] = nums[right];
                left += 1;
            }
        }
        return left;
    }
}
