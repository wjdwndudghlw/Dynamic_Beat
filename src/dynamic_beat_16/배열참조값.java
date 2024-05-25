package dynamic_beat_16;

public class 배열참조값 {
 public static void main(String[] args) {

    
        Integer asv = 123;
        Integer bvff = 456;
        Integer [] cadf = {asv,bvff};
        
 
        cadf[0]= 999;
        System.out.println(cadf[0] == asv); 
        System.out.println("asv:"+asv);
        System.out.println("------------");

    String a = "123";
    String b = "456";
    String [] c = {a,b};
    
    System.out.println(b);
    System.out.println(c[1] == b); 
    c[1]= "999";
    System.out.println(c[1]);
    System.out.println(c[1] == b); 
    System.out.println("b:"+b); 

    Object aa = new Object();
Object bb = aa;  // b는 a와 같은 객체를 참조
Object cc = new Object(); // c는 새로운 객체를 참조

System.out.println(aa == bb); // true, a와 b는 같은 객체를 참조
System.out.println(aa == cc); // false, a와 c는 다른 객체를 참조

Object [] dd ={aa,bb};
dd[0] = new Object();
System.out.println(dd[0] == bb); // true, a와 b는 같은 객체를 참조



 }   
}
