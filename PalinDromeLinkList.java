class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}

public class PalinDromeLinkList {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(10);
        head.next.next.next = new Node(40);

        System.out.print(isPalin(head));
    }

    public static boolean isPalin(Node head) {
        if (head == null || head.next == null) {
            return true;
        }
        Node fast = head;
        Node slow = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node nn = reve(slow.next);
        Node fir = head;
        Node sec = nn;
        while (sec != null) {
            if (fir.data != sec.data) {
                reve(nn);
                return false;
            }
            fir = fir.next;
            sec = sec.next;

        }
        reve(nn);
        return true;

    }

    public static Node reve(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node nh = reve(head.next);
        Node t = head.next;
        t.next = head;
        head.next = null;
        return nh;
    }

}