package y23.m12.d05;

public class Stack<ContentType> {

    private class StackNode {

        private ContentType content = null;
        private StackNode nextNode = null;
        
        public StackNode(ContentType pContent) {
            content = pContent;
            nextNode = null;
        }

        public StackNode getNext() {
            return nextNode;
        }

        public void setNext(StackNode nextNode) {
            this.nextNode = nextNode;
        }

        public ContentType getContent() {
            return content;
        }
    }
    
    private StackNode head = null;
    
    public Stack() {
        head = null;    
    }
    
    public boolean isEmpty() {
        return (head == null);
    }
    
    //auf den Stapel legen
    public void push(ContentType pContent) {
        if (pContent != null) {
            StackNode node = new StackNode(pContent);
            node.setNext(head);
            head = node;
        }
    }
    
    //vom Stapel nehmen
    public void pop() {
        if (!isEmpty()) {
            head = head.getNext();
        }
    }
    
    //oberstes Element vom Stapel
    public ContentType top() {
        if (!this.isEmpty()) {
            return head.getContent();
        }
        return null;
    }
}
