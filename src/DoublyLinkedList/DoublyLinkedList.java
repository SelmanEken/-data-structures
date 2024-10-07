package DoublyLinkedList;

public class DoublyLinkedList {
    private Link head;
    private Link tail;

    public DoublyLinkedList() {
        head = null;
        tail = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void insertFirst(long d) {
        Link newLink = new Link(d);

        if (isEmpty())
            tail = newLink; //ilk kayıt eklerken
        else
            head.previous = newLink;
        newLink.next = head;
        head = newLink;
        //başa ekleme
    }

    public void insertToTail(long d) {
        Link newLink = new Link(d);

        if (isEmpty())
            head = newLink; //ilk kayıt eklerken
        else {
            tail.next = newLink;
            newLink.previous = tail;
        }
        tail = newLink;
    }

    public Link deleteFirts() {
        Link temp = head;

        if (head.next == null)
            tail = null;
        else
            head.next.previous = null; //başta olacağı için yeni head previous zaten null olmalı
        head = head.next;
        return temp;
    }

    public Link deleteFromTail() {
        Link temp = tail;

        if (head.next == null)
            head = null;
        else
            tail.previous.next = null; //sonda olacağı için yeni tail
        tail = tail.previous;
        return temp;
    }

    public Link deleteKey(long key) {
        Link current = head;

        while (current.data != key) {
            current = current.next;
            if (current == null)
                return null;
        }
        if (current == head) //baştaysa
            head = current.next;
        else current.previous.next = current.next;

        if (current == tail) //sondaysa
            tail = current.previous;
        else
            current.next.previous = current.previous; //aradaysa
        return current;
    }

    public Link find(long key) {
        Link current = head;

        while (current.data != key) {
            current = current.next;
            if (current == null)
                return null;
        }
        return current;
    }

    public void delete(long d) {
        Link current = find(d);
        if (current != null)
            head = current.next;
        else if (current == tail) {
            tail = current.previous;
            tail.next = null;
        }
        else {
            current.previous.next = current.next;
            current.next.previous = current.previous;
        }
    }

    public void displayForward(){
        System.out.print("Liste: (head-->tail): ");
        Link current=head;

        while (current!=null){
            current.displayLink();
            current=current.next;
        }
        System.out.println("");
    }

    public void displayBacward(){
        System.out.print("Liste: (tail-->head): ");
        Link current=tail;

        while (current!=null){
            current.displayLink();
            current=current.previous;
        }
        System.out.println("");
    }
}
