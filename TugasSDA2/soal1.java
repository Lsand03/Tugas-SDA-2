package TugasSDA2;
import java.util.LinkedList;

public class soal1 {
    public static void main(String[] args) {
        LinkedList<String> saya = new LinkedList<String>(); 
        saya.add("M."); 
        saya.add("");
        saya.add("A");
        saya.add("F");
        saya.add("I");
        saya.add("F");
        saya.add("");
        saya.add("E");
        saya.add("L");
        saya.add("S");
        saya.add("A");
        saya.add("N");
        saya.add("D");
        saya.add("A");
        
        System.out.println("saya =" +saya);
        System.out.println("Size = "+saya.size());
      
        //Add LinkedList
        saya.addFirst("Prof.");
        saya.addFirst("H.");
        saya.addLast("S.");
        saya.add("Kom");
        saya.add("MT");
        
        System.out.println("\nFungsi Add = "+saya);
        System.out.println("Size = "+saya.size());
      
        //set linkedlist 
        saya.set(1,"S" );
        saya.set(5,"T" );
        saya.set(6,"A" );
        saya.set(11,"R" );
        saya.set(13,"Z" );
        System.out.println("Fungsi Set = "+saya);
        System.out.println("Size = "+saya.size());
      
        //remove linkedlist
        saya.removeFirst();
        saya.removeLast();
        System.out.println("Fungsi Remove First & Last = "+saya);
        System.out.println("Size = "+saya.size());
      
        saya.remove(9);
        saya.remove(3);
        saya.remove(0);
    
        System.out.println("Fungsi Remove = "+saya);
        System.out.println("Size = "+saya.size());
      
        //pop and push
        saya.pop();
        System.out.println("Fungsi POP = "+saya);
        System.out.println("Size = "+saya.size());
      
        saya.push("E");
        System.out.println("Fungsi PUSH = "+saya);
        System.out.println("Size = "+saya.size());
        
       
    }
}
