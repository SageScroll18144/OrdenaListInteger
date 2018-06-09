import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class OrdenacaoBolha {

	public static void main(String[] args) throws IOException {

		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		String list = s.nextLine();
		
		String con[] = list.split(",");
		ArrayList<Integer> c = new ArrayList<>();
		ArrayList<Integer> a = new ArrayList<>();

		for(String i : con) {
			c.add(Integer.parseInt(i));
		}
		
		for(int f : c) {
			if(a.size() == 0) {
				a.add(f);
				
			}else {
				for (int i = 0; i < a.size(); i++) {
					if(a.get(i)>=f) {
						a.add(i,f);
						break;
					}else if(c.size()-a.size()==1){
						a.add(f);
						break;
					}
				}
			}
		}
		System.out.println(a.toString());
		
	}

}