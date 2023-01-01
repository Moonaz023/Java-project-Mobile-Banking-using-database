/*
 * Marchandise Number:1211
 * id pass in database
 * Credit:Md Moonaz Rahman
 *        Department of cse
 *        University of Barisal,Bangladesh
 */
import java.sql.*;
import moonaz.*;
import java.util.Scanner;
public  class App{
    private static Scanner x;
    static Connection con=null;
    static ResultSet rs=null;
    static Statement stmt=null;
    public static void main(String[] args)  {
        try {
            Scanner scn =new Scanner(System.in);
        System.out.println("Welcome to PocketBank   ");
        System.out.println("_________________________________");
        System.out.println("1.Login");
        System.out.println("2.Creat a new account");
        System.out.println("enter command number");
        int what=scn.nextInt();
        scn.nextLine();
        String id=null;
        String pasward=null;
        int y1=0;
        //____________>creat new account
        if(what==2){
            System.out.println("enter  number");
            id=scn.nextLine();
            System.out.println("enter Passward");
            pasward=scn.nextLine();

            newac ac=new newac();
            ac.newacc(id,pasward); 
            access acc;
            acc=new Login(id,pasward);
             y1=acc.loogin();      
        }
         //--------------------->login
         if(what==1){

        System.out.println("enter account number");
        id=scn.nextLine();
        System.out.println("enter Passward");
        pasward=scn.nextLine();   
        access acc;
        acc=new Login(id,pasward);
         y1=acc.loogin(); 
        }
        //System.out.println(y1);
        if(y1!=0){ 
            System.out.println("1.send money");
            System.out.println("2.cashout");
            System.out.println("3.Balance");
            System.out.println("4.Reset passward");
            System.out.println("5.Transaction History");
            System.out.println("6.Logout");
            while(true){
            System.out.println("enter command number");
            int command=scn.nextInt();
            c_outpanel C_O=new c_outpanel();
            if(command==2){
            C_O.withdraw(id); }
            if(command==1){
            C_O.send(id);}
            if(command==3){
                balancecheck ac_bal=new balancecheck();
                ac_bal.balance(y1);
            }
            if(command==4){
              reset rsp=new reset();
              rsp.resetpass (id);
            }
            if(command==6){
                break;
              }
              if(command==5){
                historycheck hc=new historycheck();
                hc.history(id);
            }
        }}
        
        
        /*______________________- */
   
    } catch (Exception e) {
        System.out.println(e);
    }
   
       
    }
}
