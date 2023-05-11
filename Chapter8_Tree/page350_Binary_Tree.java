package Chapter8_Tree;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

class Node {

    int data;
    Node left;
    Node right;

    Node (int data){
        this.data = data;
    }
}

public class page350_Binary_Tree {
    
    public Node root;

    public void createNode(int data, int leftdata, int rightdata){
        if (root == null){

            root = new Node(data);

            // leftdate 비어있으면 -1으로 생성
            if (leftdata != -1){
                root.left = new Node(leftdata);
            }

            // rightdata도 동일
            if (rightdata != -1){
                root.right = new Node(rightdata);
            }
        }
        else{
            searchNode(root, data, leftdata, rightdata);

        }
    }

    // 트리 구조 중 어떤 노드에 새 노드 배치할지 검색
    // 배치할 노드가 없을 수도 있음
    public void searchNode(Node node,int data, int leftdata, int rightdata){

        if (node == null){

            return;

        }
        else if (node.data == data){
            
            if (leftdata != -1){
                node.left = new Node(leftdata);
            }
            if (rightdata != -1){
                node.right = new Node(rightdata);
            }
        }
        else{

            searchNode(node.left, data, leftdata, rightdata);
            searchNode(node.right, data, leftdata, rightdata);

            }
    }

    public void preOrder(Node node){

        if (node != null){
         
            System.out.println(node.data);
            if (node.left != null){
                preOrder(node.left);
            }
            if (node.right !=null){
                preOrder(node.right);
            }
        }
    }

    public void inOrder(Node node){
     
        if (node != null){

            if (node.left != null){
                inOrder(node.left);
            }
            System.out.println(node.data);
            if (node.right != null){
                inOrder(node.right);
            }
        }
    }

    public void postOrder(Node node){
        if (node != null){
            
            if (node.left != null){
                postOrder(node.left);
            }
            if (node.right != null){
                postOrder(node.right);
            }
            System.out.println(node.data);

        }
    }

    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        
        page350_Binary_Tree tree = new page350_Binary_Tree();

        for (int i=0; i<N; i++){

            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            tree.createNode(a, b, c);

        }

        System.out.println("전위 순회");
        tree.preOrder(tree.root);

        System.out.println("중위 순회");
        tree.inOrder(tree.root);

        System.out.println("후위 순회");
        tree.postOrder(tree.root);

    }

}


