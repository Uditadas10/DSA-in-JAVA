import java.util.*;
public class binaryTree {
    static class Node{
        int data;
        Node left;
        Node right;
    
        Node(int data){
            this.data=data;
        }
    }
    static class BinaryTree{
        static int idx=-1;
        public static Node buildTree(int nodes[]){
            idx++;
            if(idx >= nodes.length || nodes[idx]==-1){
                return null;
            }
            Node newNode=new Node(nodes[idx]);
            newNode.left=buildTree(nodes);
            newNode.right=buildTree(nodes);

            return newNode;
        }
    }
        public static void main(String args[]){
           int nodes[] = {
                1, 2, 4, -1, -1, 5, -1, -1,
                3, 6, -1, -1, 7
            };
            BinaryTree bt=new BinaryTree();
            Node root=bt.buildTree(nodes);
            System.out.println("Root = " + root.data);
        }
}
