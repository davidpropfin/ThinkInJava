package DavidLe.ThinkInJava;

public class string {
	
	public static void main(String[] args) {
		String name1 = "Alan Turing"; 
	    String name2 = "Ada Lovelace"; 
	    if (name1.equals (name2)) { 
	      System.out.println("hai tên này là một."); 
	    } 
	    int flag = name1.compareTo (name2); 
	    if (flag == 0) { 
	      System.out.println("Hai tên gọi này là một."); 
	    } else if (flag < 0) { 
	      System.out.println("tên 1 xếp trước tên 2."); 
	    } else if (flag > 0) { 
	      System.out.println("tên 2 xếp trước tên 1."); 
	    }
	}

}
