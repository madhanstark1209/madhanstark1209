import java.util.*;
import java.io.*;
class stacklinked
{
 private node head;
 public stacklinked()
 {
  head=null;
 }
 public void pop()
 {
  if (head==null)
  {
   System.out.println("no element is available in stack to pop\n");
  }
   else
  {
   int value=head.data;
   head=head.next;
   System.out.println("\n top value removed from stack is:"+value);
   }
  }
  public void push(int value)
  {
   node oldhead=head;
   head=new node();
   head.data=value;
   head.next=oldhead;
   } 
    public static void main(String args[])throws IOException
   {
    stacklinked obj=new stacklinked();
    while(true)
   {
     System.out.println("\n 1.PUSH\n 2.POP\n 3.Display\n 4.Exit\n");
     //Scanner s=new Scanner(System.in);
   BufferedReader s = new BufferedReader(new InputStreamReader(System.in));
     System.out.print("choice:");
     int a=Integer.parseInt(s.readLine());
    switch(a)
    {
   case 1:
         System.out.print("Enter the valuie:");
         int val=Integer.parseInt(s.readLine());
         obj.push(val);
         break;
   case 2:
        obj.pop();
        break;
   case 3:
        display(obj.head);
        break;
   case 4:
        System.exit(0);
    }
   }
  }
   public static void display(node head)
  {
   node n=head;
   while(n!=null)
  {
   System.out.println(n.data);
   n=n.next;
   }
  }
   private class node
  {
   int data;
   node next;
  }
     }
