package unit11_dsa_queue_stack.practive;

public class MyStackClient {
    public static void main(String[] args) throws Exception {
        MyStack stack=new MyStack(5);
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);
        System.out.println("1. Size of stack after push operations: "+stack.size());
        System.out.println("2. Pop elements from stack : ");
        while (!stack.isEmtry()){
            System.out.println("%d" + stack.pop());
        }
        System.out.println("3. Size of stack after pop operations:"+stack.size());
    }
}
