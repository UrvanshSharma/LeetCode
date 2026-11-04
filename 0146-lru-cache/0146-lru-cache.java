class LRUCache {

    class Node {
        int val;
        int key;
        Node prev;
        Node next;

        Node(int key, int val) {
            this.key = key;
            this.val = val;
        }
    }

    HashMap<Integer, Node> map;
    Node head;
    Node tail;
    int capacity;

    public LRUCache(int capacity) {
        this.capacity = capacity;

        head = new Node(-1, -1);
        tail = new Node(-1, -1);

        head.next = tail;
        tail.prev = head;

        map = new HashMap<>();
    }

    public void removeNode(Node node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    public void insertAtFront(Node node) {
        node.next = head.next;
        head.next = node;

        node.next.prev = node;
        node.prev = head;
    }

    public void moveToFront(Node node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;

        node.next = head.next;
        head.next = node;

        node.next.prev = node;
        node.prev = head;
    }

    public int get(int key) {
        if (!map.containsKey(key)) {
            return -1;
        }

        Node node = map.get(key);
        moveToFront(node);

        return node.val;
    }

    public void put(int key, int value) {

        if (map.containsKey(key)) {
            Node node = map.get(key);

            moveToFront(node);
            node.val = value;

            return;
        }

        Node node = new Node(key, value);

        insertAtFront(node);
        map.put(key, node);

        if (map.size() > capacity) {
            Node lru = tail.prev;

            removeNode(lru);
            map.remove(lru.key);
        }
    }
}