import java.util.*;
public class root_tpo_leaf {
    static class Node {
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
        }
    
          public static Node insert(Node root , int values) {
        if (root == null) {
            root = new Node(values);
            return root;
        }
        if (root.data > values) {
            // left subtree
            root.left = insert(root.left, values);
        } else {
            // right subtree
            root.right = insert(root.right, values);
        }
        return root;
    }
    public static void inorder(Node root) {
        if (root == null) {
            return ;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }
    
        public static void printPath(ArrayList<Integer> path){
            for ( int i =0; i<path.size(); i++){
                System.out.print(path.get(i)+ "->");
            }
            System.out.println("null");
        }

    public static void printroot2Leaf(Node root, ArrayList<Integer>path){
        if (root == null){
            return;
        } 
        path.add(root.data);
        if(root.left == null && root.right == null){
            printPath(path);
        }
        printroot2Leaf(root.left, path);
        printroot2Leaf(root.right, path);
        path.remove(path.size()-1);

    }
    public static void main(String[] args) {
    
        int values[] = {8,5,3,1,4,6,10,11,14};
        Node root = null;
        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }
     inorder(root);
     System.out.println();
     
    printroot2Leaf(root, new ArrayList<>());
    }
}
}
