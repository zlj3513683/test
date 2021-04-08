package zlj.study.java.list;

/**
 * @author zoulinjun
 * @title: LinkListTest2
 * @projectName java_jichu
 * @description: TODO
 * @date 2021/2/18 14:26
 */
public class LinkListTest2 {

    static class Node{
        Node prev;
        Node next;
        String value;

        public Node(Node prev, Node next, String value) {
            this.prev = prev;
            this.next = next;
            this.value = value;
        }

        public Node(Node next, String value) {
            this.next = next;
            this.value = value;
        }

        public Node getPrev() {
            return prev;
        }

        public void setPrev(Node prev) {
            this.prev = prev;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }
    }

    public static Node trans(Node node1,Node node2){
        Node node = node1;
        while (node.next != null){
            node = node.next;
        }
        node.next = node2;
        node2.prev = node;
        return node1;
    }


    public static void main(String[] args) {
        Node node1 = new Node(null,"1");
        Node node2= new Node(node1,"2");
        node1.prev = node2;
        Node node3 = new Node(node2,"3");
        node2.prev = node3;

        Node node11 = new Node(null,"11");
        Node node22= new Node(node11,"22");
        node11.prev = node22;
        Node node33 = new Node(node22,"33");
        node22.prev = node33;

        Node node = trans(node3,node33);

        Node en = node;
        while(en != null) {
            System.out.print(en.value + " ");
            en = en.next;
        }
    }
}
