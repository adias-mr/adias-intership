package mr.adias.internship;

import java.util.ArrayList;

public class TempTrame {
	
	private String id;
	static  final String separateur ="|";
	private String num;
	ArrayList<TempTrame> tab ;
	
	public TempTrame(String id, String num ){
		this.id=id;
		this.num=num;
		
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}
		
	public TempTrame trame(String t){
		String tab1[] = t.split(separateur);
		
        for (int i = 0; i < tab1.length; i++) {
        	t.id=tab1[0];
        	t.num=tab1[0];
           
        }
        
      
        
        return t;
	}

}
