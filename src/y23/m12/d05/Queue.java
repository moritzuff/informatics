package y23.m12.d05;

public class Queue<ContentType> {

    private class QueueNode {
        
        //Diese zwei Variablen und dann einfach Set- und Get-Methoden für nextNode und eine Get-Methiode für content
        //Konstruktor nicht vergessen
        private ContentType content = null;
        private QueueNode nextNode = null;

        public QueueNode(ContentType pContent) {
            content = pContent;
            nextNode = null;
        }

        public void setNext(QueueNode pNext) {
            nextNode = pNext;
        }

        public QueueNode getNext() {
            return nextNode;
        }

        public ContentType getContent() {
            return content;
        }
    }

    private QueueNode head;
    private QueueNode tail;

    public Queue() {
        head = null;
        tail = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void enqueue(ContentType pContent) {
        if (pContent != null) {
            QueueNode newNode = new QueueNode(pContent);
            if (this.isEmpty()) {
                head = newNode;
                tail = newNode;
            } else {
                tail.setNext(newNode);
                tail = newNode;
            }
        }
    }

    public void dequeue() {
        if (!this.isEmpty()) {
            head = head.getNext();
            if (this.isEmpty()) {
                head = null;
                tail = null;
            }
        }
    }

    public ContentType front() {
        if (this.isEmpty()) {
            return null;
        } else {
            return head.getContent();
        }
    }

}
