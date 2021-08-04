package task33;

public class PushAndPopStack {
    public static void push ( FixedSizeStack<String> stack){
        for (String s : "A B C D E F G H I J".split(" ")){
            stack.push(s);
        }
    }

    public static void pop(FixedSizeStack<String> stack){
        for (int i = 0; i < stack.getSize(); i++){
            System.out.print(stack.pop() + " ");
        }
    }
}
