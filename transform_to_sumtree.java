public class transform_to_sumtree {
    public static class Node {
        int data;
        Node left , right ;
        Node (int data) {
            this.data = data;
    
        }
        public static int transform(Node root) {
            if (root == null) {
                return 0;
            }
            int leftSum = transform(root.left);    // total original sum of left subtree
            int rightSum = transform(root.right);  // total original sum of right subtree

            int oldVal = root.data;                // store original node value
            root.data = leftSum + rightSum;        // new node value = sum of left & right original subtrees

            return root.data + oldVal;             // return total original sum of subtree rooted at this node
        }
        public static void preorder(Node root) {
            if (root == null) {
                return ;
            }
            System.out.print(root.data + " ");
            preorder(root.left);
            preorder(root.right);
        }
        public static void main(String[] args) {
            Node root = new Node(1);
            root.left = new Node(2);
            root.right = new Node(3);
            root.left.left = new Node(4);
            root.left.right = new Node(5);
            root.right.left = new Node(6);
            root.right.right = new Node(7);
           transform(root);
           preorder(root);
        }
    }
}
