import java.util.Date;
public class primeiro {  
 public static void main(String[] args) {
      /*Date relogio = new Date ();
      System.out.println("A hora do sistema é:");
      System.out.println(relogio.toString());*/
      //resolução da tela
      Display display = getWindowManager().getDefaultDisplay();
        Point size = new Point();
        display.getSize(size);
        int width = size.x;
        int height = size.y;
  }     
}
