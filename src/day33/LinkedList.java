package day33;

public class LinkedList {
    private Node head;
    private Node last;

    public LinkedList() {
        head = new Node();
        last = head;
    }

    public boolean add(Object object){
        Node newNode=new Node();
        newNode.setData(object);
        last.setNext(newNode);
        last=newNode;
        return  true;
    }

    public Object remove(int index){
        if (index == 0) {
            head=head.getNext();
            return null;
        }

        Node before=head;
        for (int i = 0; i <index; i++) {
            before=before.getNext();
        }
        Node cur=before.getNext();
        before.setNext(cur.getNext());
        cur.setNext(null);
        return cur.getData();
    }

    @Override
    public String toString() {
        StringBuffer sb=new StringBuffer();
        sb.append("[");
        Node cur=head;
        while (true) {
            if (cur.getNext() != null) {
                cur=cur.getNext();
                sb.append(cur.getData()+",");
            }
            break;
        }
        sb.append("]");
        return sb.toString();
    }
}
