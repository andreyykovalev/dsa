class MyStack {
    Queue<Integer> queue;
    Queue<Integer> queue2;

    public MyStack() {
        queue = new LinkedList<>();
        queue2 = new LinkedList<>();
    }
    //
    public void push(int x) {
        queue.add(x);
    }

    public int pop() {
        while(queue.size() > 1) {
            queue2.add(queue.poll());
        }
        int top = queue.poll();

        while (!queue2.isEmpty()) {
            queue.add(queue2.poll());
        }
        return top;
    }

    public int top() {
        while(queue.size() > 1) {
            queue2.add(queue.poll());
        }
        int top = queue.peek();

        queue2.add(queue.poll());

        while (!queue2.isEmpty()) {
            queue.add(queue2.poll());
        }
        return top;
    }

    public boolean empty() {
        return queue.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */