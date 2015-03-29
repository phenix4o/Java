interface Stack<T> {
    public Stack<T> push(T ele);
    public T pop();
    public int getLength();
    public void clear();
    public boolean isEmpty();
    boolean isNotDuplicate(T ele);
}