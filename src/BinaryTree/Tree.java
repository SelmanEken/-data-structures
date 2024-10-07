package BinaryTree;

import java.util.Stack;

public class Tree {
    private Node root;

    public Tree() {
        root=null;
    }

    public void insert(long data){
        Node newNode = new Node();  //yeni düğüm
        newNode.data = data;        //veriyi ekle

        if(root==null)
            root=newNode;
        else {                      //root doluysa
            Node current = root;    //root başla
            Node parent;
            while(true){
                parent = current;                  //parent = şu an dikkate alınan konum
                if (data < current.data){          //sola?
                    current = current.leftChild;
                    if (current == null){          //son düğüme gelinmişse
                        parent.leftChild = newNode; //sola ekle
                        return;
                    }
                }  //end if sola?
                else {                             //ya da sağa?
                    current = current.rightChild;
                    if (current == null){          //son düğümne gelinmişse
                        parent.rightChild = newNode;  //sağa ekle
                        return;
                    }
                }  //end else sağa?
            }  //end while
        }  //end else root doluysa
    }  //end insert

    public Node find(long data){                   //ağaç yapısının boş olmadığını farzedelim
        Node current = root;                       //root ile başla
        while(current.data != data){               //anahtar değerle eşleşme yoksa
            if (data < current.data)               //sola mı gitmeliyiz?
                current = current.leftChild;
            else current = current.rightChild;     //ya da sağa mı gitmeliyiz?
            if (current == null)                   //çocuk düğümler yok
                return null;                       //sayı bulunamadı
        }
        return current;
    }

    public void traverse(int traverseType){
        switch (traverseType) {
            case 1 -> {
                System.out.print("\n Preorder:");
                preOrder(root);
            }
            case 2 -> {
                System.out.print("\n InOrder:");
                inOrder(root);
            }
            case 3 -> {
                System.out.print("\n PostOrder:");
                postOrder(root);
            }
        }
        System.out.println("");
    }
    public void preOrder(Node localRoot){
        if (localRoot != null){
            System.out.print(localRoot.data + " ");
            preOrder(localRoot.leftChild);
            preOrder(localRoot.rightChild);
        }
    }

    public void inOrder(Node localRoot){
        if (localRoot != null){
            inOrder(localRoot.leftChild);
            System.out.print(localRoot.data + " ");
            inOrder(localRoot.rightChild);
        }
    }

    public void postOrder(Node localRoot){
        if (localRoot != null){
            postOrder(localRoot.leftChild);
            postOrder(localRoot.rightChild);
            System.out.print(localRoot.data + " ");
        }
    }

    public Node minimum(){
        Node current = root;
        Node last = null;
        while(current != null){
            last = current;
            current = current.leftChild;
        }
        return last;
    }

    public boolean delete(long key) {
        Node current = root;
        Node parent = root;
        boolean isLeftChild = true;

        while (current.data != key) {
            parent = current;
            if (key < current.data) {
                isLeftChild = true;
                current = current.leftChild;
            } else {
                isLeftChild = false;
                current = current.rightChild;
            }
            if (current == null) //sol ya da sağ çocuk düğüm boş mu dolu mu
                return false;  //boşsa döngüden çık
        }
        //silinecek düğüm bulundu

        //-------durum1: Child Yoksa sadece sil--------------
        if (current.leftChild == null && current.rightChild == null) {
            //silinecek düğümün sağ ve sol child düğümleri boşsa
            if (current == root) //düğüm kökse
                root = null;
            else if (isLeftChild)  //silinecek sol çocuksa
                parent.leftChild = null;  //parentın sol çocuğu silindiği için null
            else
                parent.rightChild = null;  //parentın sağ çocuğu silindiği için null
        }

        //-------durum 2: Sağ Child yok ------------------
        //***sağ child yoksa sol alt ağaçla yer değişir***
        //silinecek düğümün sağ child düğümü boşsa
        else if (current.rightChild == null)
            if (current == root)  //düğüm kökse
                root = current.leftChild;
            else if (isLeftChild)
                parent.leftChild = current.leftChild;
            else
                parent.rightChild = current.leftChild;
            //--------durum 2: Sol Child yok -----------------
        else if (current.leftChild == null)
            if (current == root) //düğüm kökse
                root = current.rightChild;  //root=sağ çocuk
            else if (isLeftChild)  //silinecek parentın sol
                parent.leftChild = current.rightChild;
            else
                parent.rightChild = current.rightChild;
            //------------durum 3 -----------------------------
        //***Silinecek düğümün hem sol hem sağ çocuğu varsa***
        else {
            Node successor = getSuccessor(current);
            if (current == root)
                root = successor;
            else if (isLeftChild)
                parent.leftChild = successor;
            else parent.rightChild = successor;
            successor.leftChild = current.leftChild;
        }
        return true;
    }

    private Node getSuccessor(Node delNode){
        Node successorParent = delNode;
        Node successor = delNode;
        Node current = delNode.rightChild;

        while (current != null){
            successorParent = successor;
            successor = current;
            current = current.leftChild;
        }

        if (successor != delNode.rightChild) {
            successorParent.leftChild = successor.rightChild;
            successor.rightChild = delNode.rightChild;
        }
        return successor;
    }

    public void displayTree() {
        Stack<Node> globalStack = new Stack<Node>(); // Stack Nesne Tipi Node
        globalStack.push(root);
        int nBlanks = 32;
        boolean isRowEmpty = false;
        System.out.println("......................................................");
        while (!isRowEmpty) {
            Stack<Node> localStack = new Stack<Node>();
            isRowEmpty = true;

            for (int j = 0; j < nBlanks; j++)
                System.out.print(' ');

            while (!globalStack.isEmpty()) {
                Node temp = (Node) globalStack.pop(); //Node Tipinde getir
                if (temp != null) {
                    System.out.print(temp.data);
                    localStack.push(temp.leftChild);
                    localStack.push(temp.rightChild);

                    if (temp.leftChild != null || temp.rightChild != null)
                        isRowEmpty = false;
                }
                else {
                    System.out.print("--");
                    localStack.push(null);
                    localStack.push(null);
                }
                for (int j = 0; j < nBlanks * 2 - 2; j++)
                    System.out.print(' ');
            } // end while globalStack boş değil
            System.out.println();
            nBlanks /= 2;
            while (!localStack.isEmpty())
                globalStack.push(localStack.pop());
        } // end while isRowEmpty false
        System.out.println("......................................................");
    }
}
