package unit11_dsa_queue_stack.exercise.queue;

public class QueueMain {
    public static void main(String[] args) {
        Solution queue = new Solution();
        queue.enQueue(0);
        System.out.println(queue.displayQueue());
        queue.enQueue(1);
        System.out.println(queue.displayQueue());
        queue.enQueue(2);
        System.out.println(queue.displayQueue());
        queue.enQueue(3);
        System.out.println(queue.displayQueue());
        queue.deQueue();
        System.out.println(queue.displayQueue());
    }
}
