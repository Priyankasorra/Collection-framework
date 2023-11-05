package pack2;
import java.util.HashMap;
import java.util.TreeMap;
public class ClassCollectionFramework2 {

	public static void main(String[] args) {
	HashMap<String,String>hm=new HashMap<String,String>();
	hm.put("Anand","ID102"); hm.put("Ramesh", "ID101");hm.put("Kiran","ID100" );
	
	System.out.println(hm);
	TreeMap<String,String>tm=new TreeMap<String,String>(hm);
	System.out.println(tm);

	}

}

/*
 {Kiran=ID100, Ramesh=ID101, Anand=ID102}
{Anand=ID102, Kiran=ID100, Ramesh=ID101}
 */




