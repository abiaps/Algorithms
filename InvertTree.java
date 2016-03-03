/* Inverting the tree is just swapping the children */

public class InvertTree {
	            public static TreeNode invertTree(TreeNode root) 
	            {
	                if(root==null)
                  return null;
		              if(root!=null)
		              invert(root);
		              return root;
		          }
			        public static TreeNode invert(TreeNode dup_root)
			        {
			            if(dup_root.left==null&&dup_root.right!=null) // when one of the children is null
			            {
			            	TreeNode temp=dup_root.left;                //swapping occurs
				            dup_root.left=dup_root.right;
				            dup_root.right=temp;
				            if(dup_root.left!=null)
				            invert(dup_root.left);                      //recursive calls on going down the tree
				            if(dup_root.right!=null)
				            invert(dup_root.right);
				           
			            }
			            else if(dup_root.right==null&&dup_root.left!=null)
			            {
			              TreeNode temp=dup_root.left;
				            dup_root.left=dup_root.right;
				            dup_root.right=temp;
				            if(dup_root.right!=null)
				            invert(dup_root.right);
				            if(dup_root.left!=null)
				            invert(dup_root.left);
				           
			            }
			           if(dup_root.left!=null&&dup_root.right!=null)  // when both the children are not null
			           {
			            TreeNode temp=dup_root.left;
			            dup_root.left=dup_root.right;
			            dup_root.right=temp;
			            invertTree(dup_root.left);
			            invertTree(dup_root.right);
			           }  
			           return dup_root;
			        }
	    
	public static void main(String[] args) {
	
      TreeNode root=new TreeNode(4);
      TreeNode l1=new TreeNode(2);
      root.left=l1;
      TreeNode r1=new TreeNode(7);
      root.right=r1;
      TreeNode l2=new TreeNode(1);
      l1.left=l2;
      TreeNode r2=new TreeNode(3);
      l1.right=r2;
      TreeNode l3=new TreeNode(6);
      r1.left=l3;
      TreeNode r3=new TreeNode(9);
      r1.right=r3;
      invertTree(root);
}

}
