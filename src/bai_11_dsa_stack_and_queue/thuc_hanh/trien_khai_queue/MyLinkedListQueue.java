package bai_11_dsa_stack_and_queue.thuc_hanh.trien_khai_queue;

public class MyLinkedListQueue {

    private Note head;
    private Note tail;

    public class Note {
        public int key;
        public Note next;
        public Note(int key){
            this.key = key;
            this.next = null;
        }
    }

    public Note dequeue() {
        if (this.head == null)
            return null;
        Note temp = this.head;
        this.head = this.head.next;
        if (this.head == null)
            this.tail = null;
        return temp;
    }

    public MyLinkedListQueue() {
        this.head = null;
        this.tail = null;
    }

    public void enqueue(int key) {
        Note temp = new Note(key);
        if (this.tail == null) {
            this.head = this.tail = temp;
            return;
        }
        this.tail.next = temp;
        this.tail = temp;
    }
}
