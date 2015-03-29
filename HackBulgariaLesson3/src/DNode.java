
public class DNode {
	static int noOfLinkedList=0;
	int data ;
	DNode  previousNode;
	DNode nextNode;
	DNode(int data){
		this.data = data;
		noOfLinkedList++;
	}
}
