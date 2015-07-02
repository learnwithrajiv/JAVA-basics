/*
   class Node 
       int data;
       Node left;
       Node right;
*/
void top_view(Node root)
{
    if (root == null)
        return;
    
    Stack st = new Stack();
    int size =  0;
    int arr[] = new int[100];
    
    Node Left = root.left;
    Node Right = root.right;
    
    while (Right != null) {
        arr[size++] = Right.data;
        Right = Right.right;
        
        if (Right == null) {
            for (int i=size-1; i>=0; i--)
                st.push(arr[i]);
        }
    }
    
    st.push(root.data);
    while (Left != null) {
        st.push(Left.data);
        Left = Left.left;
    }
    
    while (st.isEmpty() != true)
        System.out.print(st.pop() + " ");
    
}
