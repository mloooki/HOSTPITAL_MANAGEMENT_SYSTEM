/*

STUDENT : 
ABDULMALIK ALAQL
SAUD Bin dalilah 
Section : 176


*/
import java.util.*;
import java.util.Scanner;

public class Node {
    public Patient data;
    public Node next;
    public Node prev;

    public Node(Patient data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }

    @Override
    public String toString() {
        return getData().toString();
    }

 
    public Patient getData() {
        return data;
    }

  
    public void setData(Patient data) {
        this.data = data;
    }

 
    public Node getNext() {
        return next;
    }

 
    public void setNext(Node next) {
        this.next = next;
    }

 
    public Node getPrev() {
        return prev;
    }

 
    public void setPrev(Node prev) {
        this.prev = prev;
    }
    
}



