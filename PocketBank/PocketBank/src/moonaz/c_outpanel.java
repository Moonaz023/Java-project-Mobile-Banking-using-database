package moonaz;
import java.util.*;
public class c_outpanel //implements operation
 {
    public   void withdraw (String id){
        Scanner scn =new Scanner(System.in);
         String logac=id;
        String filepath="select * from login";
        String filepath2="select * from m_acc";
        System.out.println("enter Marchandise Number");
        String m_toac=scn.nextLine();
        check recever=new check();
    int y2=recever.find(filepath2,m_toac);
    if(y2==0)
        System.out.println("Invalid recever number");
        
        if(y2!=0){

        System.out.println("enter  ammount for Cash out");
        
        int bal=scn.nextInt();
        cashout cout=new cashout();
        operation oprsn;
        oprsn=cout;
        int success=oprsn.withdrawmoney(filepath,logac,bal,1,2,m_toac);
        if(success==1){
       oprsn.withdrawmoney(filepath2,m_toac,bal,2,2,m_toac);
        System.out.println(bal +" Tk Successfully send to "+m_toac);
        }}
    }
    //----------------------------------->send method

    public   void send (String id){
        Scanner scn =new Scanner(System.in);
         String logac=id;
        String filepath="select * from login";
       // String filepath2="m_info.txt";
        System.out.println("enter Recever Number");
        String toac=scn.nextLine();
        if(id .equals(toac)){
            System.out.println("you can't send ypur self");
        }else{
        check recever=new check();
    int y2=recever.find(filepath,toac);
    if(y2==0)
        System.out.println("Invalid recever number");

        if(y2!=0){

        System.out.println("enter  ammount for send money");
        
        int bal=scn.nextInt();
        cashout cout=new cashout();
        operation oprsn;
        oprsn=cout;
        int success=oprsn.withdrawmoney(filepath,logac,bal,1,1,toac);
        if(success==1){
       oprsn.withdrawmoney(filepath,toac,bal,3,1,toac);
        System.out.println(bal +" Tk Successfully send to "+toac);
        }}
    }
    }

}
