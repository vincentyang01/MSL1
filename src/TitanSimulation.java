import java.util.*;
import java.io.*;

public class TitanSimulation {
	
	public class astromonStats{
		private String type;
		private String name;
		private int hp;
		private int atk;
		private int def;
		private int rec;
		private float cd;
		private float cr;
		private float res;
	}
	public class debuffs {
		private String atkdown;
		private String defdown;
		private String stun;
		private String silence;
		private String seal;
		private String sap;
		private String taunt;
		private String blind;
	}
	public class buffs {
		private String atkup;
		private String defup;
		private String flatShield;
		private String varShield;
		private String blessing;
		private String zeal;
	}
	public class variant {
		private float hpVar;
		private float atkVar;
		private float defVar;
		private float recVar;
		private float cdVar;
		private float crVar;
		private float resVar;
	}
	public class titanStats {
		private int titanLevel;
		private int titanHp;
		private int titanAtk;
		private int titanDef;
		private int titanCD;
		private int titanCR;
		private int titanRes;
	}
	
	
	public static void main(String[] args) throws IOException {
		File input = new File("C:\\Users\\1401987\\Desktop");
		BufferedReader parse = new BufferedReader(new FileReader(input));
		String line;
		while((line = parse.readLine()) != null) {
			System.out.println(line);
		}
	}
	
}