// class Simple{  
// public static void main(String[] args){  
// byte a=60;  
// byte b=120;  
// //byte c=a+b;//Compile Time Error: because a+b=20 will be int  
// byte c=(byte)(a+b);  
// System.out.println(c);  
// }
// }

// public class Area{  
// public static void main(String args[]){  
// short a=10;  
// short b=10;  
// //a+=b;//a=a+b internally so fine  
// a=(short)(a+b);//Compile time error because 10+10=20 now int  
// System.out.println(a);  
// }}  

public class Area {    
public static void main(String[] args) {    
String address = "a,b,dan,ga,y, India";    
    
if(address.endsWith("India")) {    
if(address.contains("Meerut")) {    
System.out.println("Your city is Meerut");    
}else if(address.contains("Noida")) {    
System.out.println("Your city is Noida");    
}else {    
System.out.println(address.split(",")[2]);    
}    
}else {    
System.out.println("You are not living in India");    
}      
}    
} 