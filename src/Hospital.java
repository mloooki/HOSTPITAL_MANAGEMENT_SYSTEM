
import java.util.InputMismatchException;
import java.util.Scanner;


 
 public class Hospital {

     public static Scanner input=new Scanner(System.in);
     public static Scanner input2 = new Scanner(System.in);
             public  static DLL BUBBLE_SORT(DLL dl) {
          System.out.println("bubble sort");
          if(dl.head==null)return null;
         boolean t=true;
        while(t) {
            t=false;
            Node p=dl.head;
         while(p.next!=null){
               Node k = p.next;
                if (p.data.getId() > k.data.getId()) {
                   Patient temp = p.data;
                    p.data = k.data;
                    k.data = temp;
                    t=true;
                    
                 }
           p=p.next; }
        }dl.printlist();
        return dl;
    }
     
     

     
     public static void binarysearch(DLL dl,int id){
         dl=BUBBLE_SORT(dl);
         int s=dl.getsize();
         Patient p[]=new Patient[s];
         Node n=dl.head;
         int i=0;
         while(n!=null){
             p[i]=n.data;
             n=n.next;
             i++;
                        }         
         binarysearch(p,id);
     }
     public static void binarysearch(Patient x[],int k){
         int f=0,l=x.length-1;
         int med,count=0;
         while(f<=l){
         med=(f+l)/2;
         if(x[med].getId()==k) {System.out.println("x["+med+"]"+x[med]);
           return;}

    if(x[med].getId()>k)
        l=med-1;
           else
             f=med+1;

}
   }
    public static void main(String[] args) {

         DLL L=new DLL();
         TreePatient T=new TreePatient();

        int x = 1;
        try{
         do{
     
     System.out.print("ADD patient informatin (Enter -1 To Exit) : ");
     x=input.nextInt();
     if(x!=-1){
     L.addfirst(insertdata());
     T.insert(L.getPatientFromLS());}
        
          }while(x!=-1);
    System.out.print("To print all patient Information Enter 1 OR any number to print one patient: ");
     {
     x = input.nextInt();
     if(x==1)
         L.printlist();
     else{
         System.out.print ("Enter ID for patient to print it's Information: ");
         x=input.nextInt();
         if(T.Search1(x))
         L.printbyid(x);
         else
             System.out.println("THRE IS NO PATIENT WIEH THIS ID !!!");
     }
 }
 
   System.out.print("To update patient Information Enter 1 OR any number to not update: ");
 
     try{
     x=input.nextInt();
     if(x==1){
      System.out.print("ID for patient to update it's infromation: ");
      x=input.nextInt();
      if(T.Search1(x)==false)
     System.out.println("EROORE THERE IS NO PATIENT WITH THIS ID TO UPDATE IT'S INFORMATION");
     else{
       T.delete(x);
       T.insert(L.ubdate_patient());
         }
         }
         }catch(NullPointerException e){
         System.out.println("EROORE THERE IS NO PATIENT WITH THIS ID TO UPDATE IT'S INFORMATION");
                                        }
 
         System.out.print("To DELETE patient from the list Enter 1 OR any number to not delete: ");
      x=input.nextInt();
      if(x==1){
     System.out.print("Enter patient ID to DELETE IT: ");
     x=input.nextInt();
     if(T.Search1(x)){
         T.delete(x);
         L.deletenode(x);
     }
     else
         System.out.println("EROORE THERE IS NO PATIENT WITH THIS ID TO DELETE it !!!");
               }
// System.out.println("The print inorder ");
// T.inorder();
// 
// System.out.println("The print preorder ");
// T.preorder();
// 
//  System.out.println("The print postorder ");
// T.postorder();
// 
// System.out.println("The List Before Sort ");
// L.printlist();
 
   Queue waiting_list = new Queue();
 
     waiting_list.enqueu(L);
    System.out.println("The waititng list for patint (first coome first served)");
    waiting_list.print();
     x=1;
    while(!waiting_list.isEmpty()){
    System.out.println("The list after served patint"+"["+x+"]");
    waiting_list.dequeu();
    waiting_list.print();
    x++;
      }

//   System.out.println("SORT RECORD");
//
//    BUBBLE_SORT(L);
    }catch(InputMismatchException e){
            System.out.println("Invalid input !");
            return;}
        
        System.out.print("Enter ID to search using binary search: ");
        x=input.nextInt();
        binarysearch(L,x);
        

    System.out.println("THE HASH SEARCH");
    Hash L1=new Hash(L);
    System.out.print("Enter ID to search using hash: ");
    x=input.nextInt();
    L1.search(x);
    }
}