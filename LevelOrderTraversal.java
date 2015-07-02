   /* 
    class Node 
       int data;
       Node left;
       Node right;
   */
   void LevelOrder(Node root)
    {
       if (root == null) return;
       Queue q = new LinkedList();
       Node temp = root;
       System.out.print(temp.data + " ");
       while (temp != null) {
           if (temp.left != null)
               q.add(temp.left);
           if (temp.right != null)
               q.add(temp.right);
           temp = (Node)q.remove();
           System.out.print(temp.data + " ");
       }
       
    }
