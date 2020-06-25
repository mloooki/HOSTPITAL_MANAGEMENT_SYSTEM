
import java.util.Scanner;


class TreePatient {
  private TreeNode root;

    public TreePatient() {
        root=null;
    }
    private TreeNode insert(Patient x,TreeNode  t){
        
        if(t==null)
            t=new TreeNode(x);
        else if(x.getId()<=t.data.getId())
           t.left= insert(x, t.left);
        else
           t.right=insert(x,t.right);
        
        return t;
    }
    
    public void insert(Patient x){
       root= insert(x, root);
    }
    public void insert(DLL dl){
        Node p=dl.head;
        while(p!=null){
            insert(p.getData());
            p=p.getNext();
        }
    }
     public Patient getmax(TreeNode t)
    {
    if(t.right==null)
        return t.data;
    return getmax(t.right);
    }
    private TreeNode delete(int x,TreeNode t)
    {
    
    if(t==null)
        return null;
    else if(x<t.data.getId())
       t.left= delete(x, t.left);
    else if(x>t.data.getId())
       t.right= delete(x, t.right);
    else if(t.left==null){
   
    t=t.right;
    
    }else if(t.right==null)
    {
  
    t=t.left;
    }else{
        t.data=getmax(t.left);
      t.left=  delete(t.data.getId(), t.left);
    }
    
    return t;
    }
   
    public void delete(int x)
    {
        root=delete(x, root);
    }
    
    public TreeNode Search(int x){
        root = Search(x,root);
        return root;
    }
    
    public TreeNode Search(int x ,TreeNode t ){
        		 if(t == null)
			 return null;
		
		  if(t.data.getId()== x)
			 return t;
		 
		  else if (x < t.data.getId())
			 return Search(x,t.left);
		   
		       else return Search(x,t.right);}
    
    public void inorder(TreeNode t)
    {
        if(t==null)
            return;
        
            
            inorder(t.left);
            System.out.print(t.data.toString()+" \n");
            inorder(t.right);
        
    }
     public void postorder(TreeNode t)
    {
        if(t==null)
            return;
        else{
            
            postorder(t.left);
            postorder(t.right);
            System.out.print(t.data.toString()+"\n ");
           
        }
    }
     
      public void preorder(TreeNode t)
    {
        if(t==null)
            return;
        else{
            
           
            System.out.print(t.data.toString()+"\n ");
            preorder(t.left);
            preorder(t.right);
        }
    }
     public void inorder()
     {  inorder(root);}
     
     public void postorder(){
         postorder(root);
     }
     public void preorder(){
         preorder(root);
     }    
     Scanner input=new Scanner(System.in);
     
     
     public void search(){
         
         System.out.println("enter ID: ");
         int id=input.nextInt();
         search(id,root);
     }
     ////////////////////// search by id
     public void search(int id,TreeNode t){
         if(t==null)
             return;
         if(t.data.getId()==id){
             System.out.println(t.data.toString());
             return;
         }
         if(t.data.getId()<id)
         {System.out.println("id passes: "+t.data.getId());
             search(id, t.right);
         }else{System.out.println("id passes: "+t.data.getId());
             search(id, t.left);
             
         }
     }
     
     public boolean Search1(int id){
         boolean f = Search1(id,root);
         return f;
     }
     
     public boolean Search1(int id,TreeNode t){
                  if(t==null)
             return false;
         if(t.data.getId()==id)
             //System.out.println(t.data.toString());
             return true;
         if(t.data.getId()<id)
         //{System.out.println("id passes: "+t.data.getId());
             return Search1(id, t.right);
        // }
            else//{
             //System.out.println("id passes: "+t.data.getId());
           return  Search1(id, t.left);
             
        // }
     }
}
