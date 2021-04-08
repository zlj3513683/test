package zlj.study.java.list;

import java.util.Iterator;

/**
 * @author zoulinjun
 * @title: LinkListTest
 * @projectName java_jichu
 * @description: TODO
 * @date 2021/2/18 14:03
 */
public class LinkListTest {

    static class Node{
        public Node(Node next, String value) {
            this.next = next;
            this.value = value;
        }

        Node next;
        String value;
    }

    public static Node merge(Node node1,Node node2){
        Node node = node1;
        while (node.next != null){
            node = node.next;
        }
        node.next = node2;
        return node1;
    }

    public static void main(String[] args) {
        Node node1 = new Node(null,"111");
        Node node2 = new Node(node1,"222");
        Node node3 = new Node(node2,"333");

        Node node11 = new Node(null,"node11");
        Node node22 = new Node(node11,"node22");
        Node node33 = new Node(node22,"node33");


        Node node = merge(node3,node33);

        Node temp = node;
        while (temp != null){
            System.out.print(temp.value + " ");
            temp = temp.next;
        }
    }

}
