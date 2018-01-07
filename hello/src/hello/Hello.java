/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hello;
import java.util.Scanner;
/**
 *
 * @author HOME
 */
public class Hello {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here:a simple test
    
        Scanner sc1=new Scanner(System.in);
   
        System.out.print("give a message here : ");
        String message=sc1.nextLine();
        message m1=new message(message);
        
        m1.printMessege();
        
    }
    
}
