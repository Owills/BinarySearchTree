public class Tree{
    Node root; 
    Tree()  {  
         root = null;  
    } 
    public void print() { 
        print(root); 
    }
    public void print(Node root){
        if (root != null) {
            print(root.left);
            System.out.print(root.data + " ");
            print(root.right);
        }
    }
    
    public boolean search(int key){
        if (search(root, key) == null)
            return false;
        return true;
    }    
    public Node search(Node root, int key) { 
    if (root==null || root.data==key) 
        return root; 
    if (root.data < key) 
       return search(root.right, key); 
    return search(root.left, key); 
    } 
    
    public void insert(int key){  
         root = insert(root, key);  
    } 
    public Node insert(Node root, int key) { 
        if (root == null) {
            root = new Node(key);
            return root;
        }
        if (key < root.data)
            root.left = insert(root.left, key);
        else if (key > root.data)
            root.right = insert(root.right, key);
 
        /* return the (unchanged) node pointer */
        return root;
    } 
    
    
    void delete(int key) { 
        root = delete(root, key); 
    } 
    Node delete(Node root, int key){
        if (root == null)
            return root;
        if (key < root.data)
            root.left = delete(root.left, key);
        else if (key > root.data)
            root.right = delete(root.right, key);
        else {
            // node with only one child or no child
            if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;
            root.data = minValue(root.right);
            root.right = delete(root.right, root.data);
        }
 
        return root;
    }    
    int minValue(Node root){
        int minv = root.data;
        while (root.left != null) 
        {
            minv = root.left.data;
            root = root.left;
        }
        return minv;
    }
}
