/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermexam_versiona_extensioncode;
import java.util.Scanner;

/**
 *
 * @author taranpreetsingh
 */
public class TestUserprofile {
    
     private String name;
    private String actor;
    String message="userprofile created";
    String info[];
    
    Scanner sc=new Scanner(System.in);
    public void setName(String name)
    {
        this.name=name;
    }
    
    public String getName(String name)
    {
        return this.name=name;
    }
    
     public void setActor(String actor)
    {
        this.name=name;
    }
    
    public String getActor(String actor)
    {
        return this.actor=actor;
    }
    
    
    
    
    public String profile(String name, String actors)
    {
        System.out.println("Enter the name");
          System.out.println("Enter the actor");
    }
   
    
    public String newmessage(String message)
    {
        
     System.out.print(message);
    }
 //code doing       
}
