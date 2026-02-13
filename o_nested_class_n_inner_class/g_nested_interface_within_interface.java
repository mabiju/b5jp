package o_nested_class_n_inner_class;

interface Hello {
    void show();
  
    interface Message {
      void display();
    }
  }
  
  public class g_nested_interface_within_interface implements Hello.Message {
    public void display() {
      System.out.println("Hello Sanothimi");
    }
  
    public static void main(String args[]) {
      Hello.Message message = new g_nested_interface_within_interface();// upcasting here
      message.display();
    }
  }