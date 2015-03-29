
public class DoublyLinkedListImp implements DoublyLinkedList {
	static DNode root;
	static DNode temp;
	static DNode current;
	
	@Override
	public void addNodes(int data) {
		// TODO Auto-generated method stub
		DNode dNode = new DNode(data);
		if(root==null){
			root = dNode;
			root.previousNode = null;
			root.nextNode = null;
		}else{
			current = root;
			while(current.nextNode!=null){
				current=current.nextNode;
			}
			current.nextNode = dNode;
			dNode.previousNode = current;
			dNode.nextNode = null;
		}
	}

	@Override
	public void deleteNode(int nodeNumber) {
		// TODO Auto-generated method stub
		int ithNode = nodeNumber;
		current = root;
		if(nodeNumber ==1){
			root =current.nextNode;
			current.previousNode = null;
			current.nextNode = null;
		}
		else{
			while(ithNode!=nodeNumber){
				current = current.nextNode;
				ithNode++;
			}
			if(current.nextNode == null){
				current.previousNode.nextNode = null;
				current.previousNode = null;
			}
			else{
				current.previousNode.nextNode = current.nextNode;
				current.nextNode.previousNode = current.previousNode;
				
			}
		}
	}

	@Override
	public void insertNode(int data, int after) {
		// TODO Auto-generated method stub
		DNode dNode = new DNode(data);
		int ithNote = 1;
		current = root;
		while(ithNote != after){
			current.nextNode = root;
			ithNote++;
			
			
		}
		temp = current.nextNode;
		current.nextNode = dNode;
		dNode.nextNode = temp;
		temp.previousNode = dNode;
		dNode.previousNode = current;
	}

	@Override
	public int getRoot() {
		// TODO Auto-generated method stub
		return root.data;
	}

	@Override
	public int getNode(int nodeIndex) {
		// TODO Auto-generated method stub
		current = root;
		int ithNode = 1;
		while(ithNode!=nodeIndex){
			current = current.nextNode;
			ithNode++;
		}
		return current.data;
	}

	@Override
	public int getLast() {
		// TODO Auto-generated method stub
		return getNode(getSize());
	}

	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return root.noOfLinkedList;
	}

}
