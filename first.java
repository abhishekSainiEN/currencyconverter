package currency converter;

import java.util.*;

// Compiler version JDK 11.0.2

class Dcoder
{
   public static void main(String args[])
   {
   System.out.println("Hello, Dcoder!");
   
            Scanner sc=new Scanner(System.in);
                 
                
   System.out.println("welcome to ACurrencyConverter");
     
      System.out.println("write  start");
     String a=sc.nextLine();
     
     
      System.out.println("Here curreny list of convert in rupees");
      System.out.println("list of currency given below");
   
         System.out.println("press 1 for dollar");
        System.out.println("press 2 for dinar");
         System.out.println("press 3 for yen");
           System.out.println("press 4 for euro");
          System.out.println("press 5 for pound");
         System.out.println("press 6 for kuwait currency");
         System.out.println("press 7 for yuan");
     
     
    System.out.println("Welcome in a converter");
        System.out.println("give input");
       
        int userInput=sc.nextInt();  
           
           
            if(userInput==0){
              System.out.println("Convert Dollar into Ruppes");
              long dollar=sc.nextLong();
           System.out.println(dollar+": dollar value in ruppes is :"+dollar*75.6);
            
         
           }else if(userInput==1){
              System.out.println("convert ruppes into dinar");
                long dinar=sc.nextLong();
                System.out.println(dinar+":dinar value in rupees is :"+dinar*286.68);
              
               }
               else if(userInput==2){
                  System.out.println("convert ruppes into dinar");
                long dinar=sc.nextLong();
                System.out.println(dinar+":dinar value in rupees is :"+dinar*286.68);
              
              }
              else if(userInput==3){
              System.out.println("convert ruppes into yen");
                long yen=sc.nextLong();
                System.out.println(yen+":yen value in rupees is :"+yen*0.65);
               }
               else if(userInput==4){
               System.out.println("convert ruppes into euro");
                long euro=sc.nextLong();
                System.out.println(euro+":euro value in rupees is :"+euro*85.55);
               }
               else if(userInput==5){
               System.out.println("convert ruppes into pound");
                long pound=sc.nextLong();
                System.out.println(pound+":pound value in rupees is :"+pound*101.41);
                }
                  else if(userInput==6){
               System.out.println("convert ruppes into KuwatiDinar");
                long  kuwatiDinar=sc.nextLong();
                System.out.println( kuwatiDinar+":KuwatiDinar value in rupees is :"+kuwatiDinar*286.68);
                  }
                  else if(userInput==7){
               System.out.println("convert ruppes into yuan");
                long yuan=sc.nextLong();
                System.out.println(yuan+":yuan value in rupees is :"+yuan*11.08);

                 }else{
                   System.out.println("Invalid input");            
}
}
}
