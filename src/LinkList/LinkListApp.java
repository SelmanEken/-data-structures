package LinkList;

public class LinkListApp {
    public static void main(String[] args) {
        LinkList theList = new LinkList();

        theList.insertToHead(22);
        theList.insertToHead(44);
        theList.insertToHead(66);

        theList.insertLAst(11);
        theList.insertLAst(33);
        theList.insertLAst(55);

        theList.displayList();

        theList.deleteFromHead();
        theList.deleteFromHead();


        theList.displayList();

    }

}
