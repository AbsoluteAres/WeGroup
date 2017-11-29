package server;

import java.util.ArrayList;
import java.util.List;

public class Message_server 
{
    String user_id;
    
    List<String > messages;
    
    
   void CheckPrivate
   {
       privateMessageServer.checkStorage(userid)
   }
   
   
   void CheckStorage
   {//Checks if empty
       if(messages != empty)
       {
           //Goes through and sends the messages back to the TCP for delivery
           for(i =0;i<messages.size;i++)
           {
               Tcp.sendMessageback?
           }
       }
   }
   
   
   //void SendMessage I beleive this should be done in the Server because messages cant communicate
   
   void StoreMessage(string message)
   {
       messages.Add(message);
   }
    
    
    
}
