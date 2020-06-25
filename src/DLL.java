
import java.util.InputMismatchException;
import java.util.Scanner;


public class DLL {
  
    public Node head,tail;
    public DLL(){head=tail=null;}
    
    
    public void addlast(Patient d){
    Node n=new Node(d);
    if(head==null)
            head=tail=n;
         else
        {
            tail.setNext(n);
            n.setPrev(tail);
            tail=n; 
        }

    }
    public void addfirst(Patient d){
    Node n=new Node(d);
        if(head==null)
            head=tail=n;
         else
        {
        n.setNext(head);
        head.setPrev(n);
        head=n;
        }
    
    }

    public Patient getPatientFromLS(){
        Patient e = new Patient();
        Node temp = head;
        while(temp.next!=null){
            temp=temp.next;
            return head.getData();
        }
        return temp.getData();
    }    
    
    
    void printinreverse(){
    Node cur=tail;
    while(cur!=null)
    {    System.out.print(cur.getData()+"\t");
    cur=cur.getPrev();
    }
        System.out.println();
    
    }
   public Patient search_by_id(){
       System.out.println("enter ID:");
        int id=input.nextInt();
        Node p=head;
        while(p!=null){
            if(p.getData().getId()==id){
                return p.getData();
            }
        p=p.next;    
   }
        return null;}
   
    public void printlist()
    {
    Node  cur=head;
   while(cur!=null)
   { System.out.print(cur.getData()+"\t");   
      
      cur=cur.getNext();
      System.out.println();
    }
   System.out.println();
    }
    
    public void deletenode(int id){
    Node cur=head;
    while(cur!=null)
        if(cur.getData().getId()==id)
            break;
          else
            cur=cur.getNext();
    
    if(cur==null)
            System.out.println("NOT FOUND");
    else if(cur==head){
    head=head.getNext();
    head.setPrev(null);
    cur=null;
    
    }else if(cur==tail){
    tail=tail.getPrev();
    tail.setNext(null);
    cur=null;
    
    }else{
    
    cur.getNext().setPrev(cur.getPrev());
    cur.getPrev().setNext(cur.getNext());
    
    }
    }
    public int getsize(){
        Node p=head;
        int count=0;
        while(p!=null){
            count++;
            p=p.next;
        }
        return count;
    }
    public void printbyid(int id){
        if(head==null)return;
        Node p=head;
        while(p!=null){
            if(p.data.getId()==id)
            {System.out.println(p.data.toString());
            return;
            }
            p=p.next;
        }
        System.out.println("Not Found ......");
    }
    public Scanner input=new Scanner(System.in);
    public Scanner input2=new Scanner(System.in);
    
    public Patient ubdate_patient(){
        System.out.println("enter ID TO UPDATE IT'S INFORMATION: ");
        int id=input.nextInt();
        Node p=head;
        while(p!=null){
            if(p.getData().getId()==id){
                System.out.println(p.getData()+"\n"+"enter new data:\n");
                p.setData(insertdata());
                return p.getData();
            }
            p=p.next;
        }
        
        return null;
    }

     public Patient update_Doctor(){
      System.out.println("enter ID to update it's doctor:");
        int id=input.nextInt();
        Node p=head;
        while(p!=null){
            if(p.getData().getId()==id){
                System.out.println("the doctor name now"+p.getData().getDoctor()+"enter new doctor:");
                String doc =input.next();
                p.getData().setDoctor(doc);///////////  update doctor name
                return p.getData();
            }   
        p=p.getNext();
    }
         return null;
    }
    public Patient update_payment(){
      System.out.println("enter ID:");
        int id=input.nextInt();
        Node p=head;
        while(p!=null){
            if(p.getData().getId()==id){
                System.out.println("enter new payment:");
                double payment=input.nextDouble();
                p.getData().setPayment(payment+p.getData().getPayment());
                return p.getData();
            }
            p=p.getNext();
           
    }
         return null;
    }
    public  Patient insertdata(){
        Patient p=new Patient();
        try{
         System.out.print("enter Patient data: \n-ID: ");
         p.setId(input.nextInt());
         System.out.print("-NAME: ");
         String n=input2.nextLine();
         p.setName(n);
         System.out.print("-Birthdate: ");
         String birth=input2.nextLine();
         p.setBirthdate(birth);
         System.out.print("-Doctor: ");
         String doc=input2.nextLine();
         p.setDoctor(doc);
         System.out.print("-Prescription: ");
         String prec=input2.nextLine();
         p.setPrescription(prec);
         System.out.print("-Reciept: ");
         p.setReciept(input.nextInt());
         System.out.print("-Payment: ");
         p.setPayment(input.nextDouble());}
        catch(InputMismatchException E){
            System.out.println("Invalid input !");
        }
         
         return p;
     }
}