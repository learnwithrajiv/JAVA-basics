 /* Node is defined as :
 class Node 
    int data;
    Node left;
    Node right;
    
    */

static Node Insert(Node root,int value)
    {
        if (root == null) {
            root = new Node();
            root.data = value;
            root.left = null;
            root.right = null;
        }
        else {
            if ( root.data == value ) return root;
            Node temp = new Node();
            temp.data = value;
            temp.left = null;
            temp.right = null;
            if (root.data < value) {
                if (root.right != null)
                    root.right = Insert (root.right,value);
                else {
                    root.right = temp;
                }
            } 
            if (root.data > value) {
                if (root.left != null)
                    root.left = Insert (root.left,value);
                else {
                    root.left = temp;
                }
            } 
        }
        return root;
    }


