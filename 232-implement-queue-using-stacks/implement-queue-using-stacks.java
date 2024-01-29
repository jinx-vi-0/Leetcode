class MyQueue {

    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();
    int x;

    public MyQueue() {
        x = 0;
    }
    
    public void push(int x) {
        s2.push(x);
    }
    
    public int pop() {
        if (!s2.isEmpty())
            while (!s2.isEmpty()) {
                s1.push(s2.pop());
            }
        if (!s1.isEmpty())
            x = s1.pop();
        while (!s1.isEmpty()) {
            s2.push(s1.pop());
        }
        return x;
    }
    
    public int peek() {
        if (!s2.isEmpty())
            while (!s2.isEmpty()) {
                s1.push(s2.pop());
            }
        if (!s1.isEmpty())
            x = s1.peek();
        while (!s1.isEmpty()) {
            s2.push(s1.pop());
        }
        return x;
    }
    
    public boolean empty() {
        if(s2.isEmpty())
            return true;
        return false;
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */