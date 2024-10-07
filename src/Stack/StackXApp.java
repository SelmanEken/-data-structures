package Stack;

public class StackXApp {
    public static void main(String[] args){
        StackX theStack = new StackX(10);
        theStack.push('s');
        theStack.push('a');
        theStack.push('d');
        theStack.push('a');

        while (!theStack.isEmpty()) {
            long value = theStack.pop();
            //Karakter basmak için
            //char peekvalue=theStack.peek();
            //char value = theStack.pop();

            System.out.print(value + " ");
            //ascii kodu
            // 97=a; 100=d; s=115;

        }

        System.out.println("");

    }
}
