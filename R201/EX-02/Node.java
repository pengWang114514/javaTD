public class Node {

	Hub nodes;
	private String name;
	private Node nextNode;

	/**
	 * 
	 * @param p
	 */
	public void accept(Packet p) {
		// TODO - implement Node.accept
		throw new UnsupportedOperationException();
	}

	public Node getNextNode() {
		return this.nextNode;
	}

	/**
	 * 
	 * @param n
	 */
	public void setNextNode(Node n) {
		this.nextNode = n;
	}

}