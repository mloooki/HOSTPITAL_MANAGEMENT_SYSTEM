 
public class Patient{
    private int id;
    private String name;
    private String birthdate;
    private String doctor;
    private int reciept;
    private double payment;
    private String prescription;
    
    public Patient(){
        
    }

    public Patient (int i , String na ,String br,
         int re, String d ,double pa,String pr){
        id=i;
        name = na;
        birthdate = br;
        reciept = re;
        doctor = d;
        payment = pa;
        prescription = pr;
       
    }
        
         public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getBirthdate() {
        return birthdate;
    }

 
    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

   
    public String getDoctor() {
        return doctor;
    }

  
    public void setDoctor(String doctor) {
        this.doctor = doctor;
    }

  
    public int getReciept() {
        return reciept;
    }

   
    public void setReciept(int reciept) {
        this.reciept = reciept;
    }


    public double getPayment() {
        return payment;
    }


    public void setPayment(double payment) {
        this.payment = payment;
    }

 
    public String getPrescription() {
        return prescription;
    }

 
    public void setPrescription(String prescription) {
        this.prescription = prescription;
    }

    @Override
    public String toString() {
        return "Patient{" + "id=" + id + ", name=" + name + ", birthdate=" 
                + birthdate + ", doctor=" + doctor + ", reciept=" + reciept +
                ", payment=" + payment + ", prescription=" + prescription + '}';
    }
    
        
}