

 public class Hash {
    private Patient patient[];
    int size;
    public Hash(DLL dl){
        patient=new Patient[dl.getsize()];
        size=dl.getsize();
       Node p=dl.head;
       
       while(p!=null){
           int i=hashfunction(p.getData().getId(),size);
           patient[i]=p.getData();
                  p=p.getNext();
       }
               
    }
    
//    public void search(int id){
//        int i=hashfunction(id,size);
//        if(patient[i]!=null){
//        if(patient[i].getId()==id)
//            System.out.println(patient[i].toString());
//        else
//            System.out.println("Not found.....");
//        }
//        else{
//            System.out.println("Not found.....");
//        }
//    }
        public void search(int id){
        int i=hashfunction(id,size);
        if(patient[i]!=null){
        if(patient[i].getId()==id)
            System.out.println(patient[i].toString());
        else
            System.out.println("Not found.....");
        }
        else{
            System.out.println("Not found.....");
        }
    }
    
    public int hashfunction(int id,int s){
        return id%s;
    }
}
