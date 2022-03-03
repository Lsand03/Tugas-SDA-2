package TugasSDA2;
import java.util.LinkedList;

public class soal1 {
    public static void main(String[] args) {
        LinkedList<String> nama = new LinkedList<String>(); 
        nama.add("M."); 
        nama.add("");
        nama.add("A");
        nama.add("F");
        nama.add("I");
        nama.add("F");
        nama.add("");
        nama.add("E");
        nama.add("L");
        nama.add("S");
        nama.add("A");
        nama.add("N");
        nama.add("D");
        nama.add("A");
        
        System.out.println("Nama =" +nama);
        System.out.println("Size = "+nama.size());
      
        //Add LinkedList
        nama.addFirst("Prof.");
        nama.addFirst("H.");
        nama.addLast("S.");
        nama.add("Kom");
        nama.add("MT");
        
        System.out.println("\nFungsi Add = "+nama);
        System.out.println("Size = "+nama.size());
      
        //set linkedlist 
        nama.set(1,"S" );
        nama.set(5,"T" );
        nama.set(6,"A" );
        nama.set(11,"R" );
        nama.set(13,"Z" );
        System.out.println("Fungsi Set = "+nama);
        System.out.println("Size = "+nama.size());
      
        //remove linkedlist
        nama.removeFirst();
        nama.removeLast();
        System.out.println("Fungsi Remove First & Last = "+nama);
        System.out.println("Size = "+nama.size());
      
        nama.remove(9);
        nama.remove(3);
        nama.remove(0);
    
        System.out.println("Fungsi Remove = "+nama);
        System.out.println("Size = "+nama.size());
      
        //pop and push
        nama.pop();
        System.out.println("Fungsi POP = "+nama);
        System.out.println("Size = "+nama.size());
      
        nama.push("E");
        System.out.println("Fungsi PUSH = "+nama);
        System.out.println("Size = "+nama.size());
        
       
    }
}
