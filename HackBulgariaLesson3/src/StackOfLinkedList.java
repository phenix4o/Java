public class StackOfLinkedList<DoublyLinkedListImp> implements Stack<DoublyLinkedListImp> {
	private DoublyLinkedListImp[] arr;

	private int total;

	public StackOfLinkedList() {
		arr = (DoublyLinkedListImp[]) new Object[2];
	}

	@Override
	public Stack<DoublyLinkedListImp> push(DoublyLinkedListImp ele) {
		// TODO Auto-generated method stub
		if ((isNotDuplicate(ele))) {
			if (arr.length == total)
				resize(arr.length * 2);
			arr[total++] = ele;
		}
		else{
			print();
		}
		return this;
	}

	private void resize(int capacity) {
		DoublyLinkedListImp[] tmp = (DoublyLinkedListImp[]) new Object[capacity];
		System.arraycopy(arr, 0, tmp, 0, total);
		arr = tmp;
	}

	@Override
	public DoublyLinkedListImp pop() {
		if (total == 0)
			throw new java.util.NoSuchElementException();
		DoublyLinkedListImp ele = arr[--total];
		arr[total] = null;
		if (total > 0 && total == arr.length / 4)
			resize(arr.length / 2);
		return ele;
	}

	@Override
	public int getLength() {
		return total;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		arr = (DoublyLinkedListImp[]) new Object[2];
		total = 0;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return total==0;
	}

	@Override
	public boolean isNotDuplicate(DoublyLinkedListImp ele) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == ele) {
				return false;
			}
		}
		return true;
	}

	public void print() {
		System.out.println("There is already an element with the same value in the Stack");
		
	}

}
