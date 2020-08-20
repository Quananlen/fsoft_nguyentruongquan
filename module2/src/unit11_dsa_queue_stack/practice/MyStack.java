package unit11_dsa_queue_stack.practice;

public class MyStack {
    private int arr[];
    private int size;
    private int index=0;
    public MyStack(int size){
        this.size=size;
        arr=new int[size] ;
    }
    public boolean isFull(){
        boolean status=false;
        if(index==size){
            status=true;
        }
        return status;
    }
    public void push(int element){
        if(isFull()){
            throw new StackOverflowError("stack is full");
        }
        arr[index]=element;
        index++;
    }
    public boolean isEmtry(){
        boolean status=false;
        if(index==0){
            status=true;
        }
        return status;
    }
    public int pop() throws Exception{
        if(isEmtry()){
            throw  new Exception("Stack is null");
        }
        return arr[--index];
    }
    public int size(){
        return index;
    }
}
