public class List {
    private Node head;
    private int size;

    public List(){
        head = new Node();
        head.prev = head;
        head.next = head;
        size = 0;
    }

    public void pushHead(char c){
        Node nextHead = head.next;//кто идёт после головы
        Node newNext = new Node();//новый узел после головы
        newNext.c = c;//назн символ
        newNext.next = nextHead;//

        newNext.prev = head;//

        nextHead.prev = newNext;//

        head.next = newNext;//след за головой,новый вставл.

        size++;//увел разм списка
    }

    public void pushTail(char c){
        Node prevHead = head.prev;
        Node newPrev = new Node();
        newPrev.c = c;
        newPrev.next = head;
        newPrev.prev = prevHead;
        head.prev = newPrev;

        size++;
    }

    public char pullHead(){
        if(head.next == head){
            return(char)-1;
        }else{
            Node headNext = head.next;
            char c = headNext.c;

            head.next = headNext.next;

            head.next.next.prev = head;

            size--;
            return c;
        }
    }

    public char pullTail() {
        if (head.prev == head) {
            return (char) -1;
        } else {
            Node headPrev = head.prev;
            char c = headPrev.c;

            head.prev = headPrev.prev;

            headPrev.prev.next = head;

            size--;
            return c;
        }
    }

    public int getSize(){
        return size;
        }


    private class Node{
        char c;
        Node next;
        Node prev;
    }
}