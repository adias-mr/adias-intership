package mr.adias.internship;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class AdiasInternshipJanuary {
	  private static final Logger LOGGER = Logger.getLogger(AdiasInternshipJanuary.class.getName());

	private static List<String> trames =new ArrayList<>();
        public static String gettrampe(String trame){
            return trame;
        }
                
	public static void main(String[] args) {
		
		trames.add("0T0001|0137.2|38.2|36.2|35.4|30.9|37.2");
		trames.add("0T0002*0205.2*06.6*07.4*03.2*04.6*07.2");
		trames.add("0T0003:0307.2:08.5:09.5:09.2:07.9:07.1");
		trames.add("0T0015$2314.2$11.2$15.4$10.6$17.2$11.2");
		trames.add("0T0020#1432.2#30.5#29.3#32.7#32.7#25.2");
		trames.add("0T0007E0533.2E33.2E33.2E35.2E30.2E34.7");
		trames.add("0T0009|0773.2|70.2|60.4|50.6|43.4|73.2");
		trames.add("0T0012|018.2|8.2|7.3|9.4|4.2|7.9");
		
		
			
	

	}

}
