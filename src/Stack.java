public class Stack {
    private Node top;
    public Stack(){top=null;}
    
    public void push(Patient d){
    Node n=new Node(d);
    n.setNext(top);
    top=n;
    
    }
    public boolean isEmpty(){
        if(top==null)
            return true;
        return false;
    }
    public Patient pop(){
    if(isEmpty())
        return null;
    
    
    Patient x=top.getData();
    top=top.getNext();
    return x;
    }
    
    public int Size(){
        int c=0;
        Stack s=new Stack();
        while(!isEmpty()){
            c++;
        s.push(pop());
        }
          while(!s.isEmpty()){
          push(s.pop());
        }
    return c;
    }
    
    public void reverse(){
    
    Stack s1=new Stack();
        Stack s2=new Stack();
        
        while(!isEmpty())
            s1.push(pop());
        
         while(!s1.isEmpty())
            s2.push(s1.pop());
         
          while(!s2.isEmpty())
            push(s2.pop());
        
    }
    
    public void print(){
    Patient x; 
    Stack s=new  Stack();
    
    while(!isEmpty()){
        x=pop();
        System.out.print(x.toString()+" , ");
        s.push(x);
    }
    
    while(!s.isEmpty())
        push(s.pop());
    
    }
    
    
    public void takelinkedlist(DLL dl){
        Node p=dl.head;
        while(p!=null)
        {
            push(p.getData());
            p=p.getNext();
        }
       
    }
   
        }