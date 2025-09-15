import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

class Solution {
    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(32);
        queue.add(49);
        queue.add(68);
        queue.add(75);
        System.out.println(queue);
        reverse(queue);
        System.out.println(queue);

    }
    public static void reverse(Queue<Integer> queue) {
        Stack<Integer> stack = new Stack<>();
        while (!queue.isEmpty()) {
            stack.push(queue.remove());
        }
        while(!stack.empty()) {queue.add(stack.pop());}
    }
}