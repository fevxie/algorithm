public class SignalLinkedList {
    private int size;
    private LinkedNode head;
    private  LinkedNode last;

    public SignalLinkedList() {
        this.size =0;
        this.head = new LinkedNode();
        this.last = head;
    }

    public void add(LinkedNode node){
        this.last.next = node;
        this.last = node;
        this.size ++;
    }

    public int size(){
        return  this.size;
    }

    /*
    * find linkedNode by index
    * */
    public LinkedNode selectNode(int index){
        LinkedNode node = head.next;
        for(int i=0;i<index;i++){
            node = node.next;
        }
        return node;
    }

    public static class LinkedNode{
        private int val;

        public int getVal() {
            return val;
        }

        public void setVal(int val) {
            this.val = val;
        }

        private LinkedNode next;

        public LinkedNode getNext() {
            return next;
        }

        public void setNext(LinkedNode next) {
            this.next = next;
        }

        public LinkedNode() {
        }

        public LinkedNode(int val) {
            this.val = val;
        }
    }
}
