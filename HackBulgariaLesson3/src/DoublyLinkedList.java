
public interface DoublyLinkedList {
	public void addNodes(int data);
	public void deleteNode(int nodeNumber);
	public void insertNode(int data,int after);
	public int getRoot();
	public int getNode(int nodeIndex);
	public int getLast();
	public int getSize();
}
