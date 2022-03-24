package com.mypackage;

public class Helloworld {
   private String message;

   public void setMessage(String message){
      this.message  = message;
   }
   public void getMessage(){
      System.out.println("My Love: " + message);
   }
}