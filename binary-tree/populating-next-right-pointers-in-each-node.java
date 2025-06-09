/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        if (root == null) return null;
        Node ans = root;
        Queue<Node> queue = new LinkedList<>();
        if (root.left != null) queue.offer(root.left);
        if (root.right != null) queue.offer(root.right);
        while (!queue.isEmpty()) {
            int len = queue.size();
            Node prev = null;
            for (int i = 0; i < len; i+=2) {
                Node cur = queue.poll();
                if (prev != null) prev.next = cur;
                cur.next = queue.poll();
                prev = cur.next;
                if (cur.left != null) queue.offer(cur.left);
                if (cur.right != null) queue.offer(cur.right);
                if (prev.left != null) queue.offer(prev.left);
                if (prev.left != null) queue.offer(prev.right);
            }
        }
        return ans;
    }
}