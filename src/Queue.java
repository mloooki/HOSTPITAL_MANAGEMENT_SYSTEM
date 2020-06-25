
import java.util.Scanner;

public class Queue {
     public Scanner input=new Scanner(System.in);
     public Scanner input2=new Scanner(System.in);
     private Node front,rear;

    
    public Queue(){
        front=rear=null;
    }
    
    public boolean isEmpty(){
        return rear==null;
    }
    
    public Patient peek(){
        return front.getData();
    }
    public void enqueu(DLL t){
        Node te = t.tail;
        
        while(te!=null){
            Node add = new Node(te.data);
        if (front==null)
            front=rear=add;
        else{
            rear.setNext(add);
            rear=add;
        }
        te=te.prev;
            }
    }
    
    public void enqueu(Patient x){
        
        Node n=new Node(x);
        if(front==null)
            front=rear=n;
        else{
            rear.setNext(n);
            rear=n;
        }
    }
    
    public Patient dequeu(){
        if(front==null)
            return null;
        
        Patient x=front.getData();
        front=front.getNext();
        if(front==null)
            rear=null;
        
        return x;
        
    }

    public void print(){
        Patient x;
        Queue q=new Queue();
        while(!isEmpty())
        {x=dequeu();
            System.out.println(x.toString());
            q.enqueu(x);
        }
        
        while(!q.isEmpty())
            enqueu(q.dequeu());
    }
    public void reverse(){
        Stack s=new Stack();
        while(!isEmpty())
            s.push(dequeu());
        while(!s.isEmpty())
            enqueu(s.pop());
    }
    
    
        public void ubdate_patient(int x){
        System.out.println("enter ID:");
        Node p=front;
        int id=input.nextInt();
        while(p!=null){
            if(p.getData().getId()==id){
                System.out.println(p.getData()+"\n"+"enter new data:\n");
         Patient P=new Patient();
         System.out.print("enter Patient data: \n-ID: ");
         P.setId(input.nextInt());
         System.out.print("-NAME: ");
         String n=input2.nextLine();
         P.setName(n);
         System.out.print("-Birthdate: ");
         String birth=input2.nextLine();
         P.setBirthdate(birth);
         System.out.print("-Doctor: ");
         String doc=input2.nextLine();
         P.setDoctor(doc);
         System.out.print("-Prescription: ");
         String prec=input2.nextLine();
         P.setPrescription(prec);
         System.out.print("-Reciept: ");
         P.setReciept(input.nextInt());
         System.out.print("-Payment: ");
         P.setPayment(input.nextDouble());
               //p.setData();
            }
            p=p.next;
        }
        
    }
}
