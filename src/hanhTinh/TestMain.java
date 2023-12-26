package hanhTinh;

public class TestMain {
    public static void main(String[] args) {
        
        HanhTinh earth = new HanhTinh("Trai Dat","Earth",(510.067420 * Math.pow(10,6)) , (5973.6 *Math.pow(10,21)), 365.25696);
		HanhTinh saturn = new HanhTinh("Sao Tho","Saturn",(42.7 * Math.pow(10,9)) , (568.46 *Math.pow(10,24)), 10757.7365);
		HanhTinh venus = new HanhTinh("Sao Kim","Venus",(460 * Math.pow(10,6)) , (4868.5 *Math.pow(10,21)), 224.70096);
		HanhTinh mars = new HanhTinh("Sao Hoa","Mars",(144.8 * Math.pow(10,6)) , (641.85 *Math.pow(10,21)), 686.9601);
		HanhTinh jupiter = new HanhTinh("Sao Moc","Jupiter",(61.4 * Math.pow(10,9)) , (1.899 *Math.pow(10,27)), 4435.3545);
		HanhTinh mercury = new HanhTinh("Sao Thuy","Mercury",(75 * Math.pow(10,6)) , (330 *Math.pow(10,21)), 87.96935);
		
		HanhTinh[] arr = {earth,saturn,venus,mars,jupiter,mercury};
		
		ListIterHanhTinh ht = new ListIterHanhTinh(arr);
		
		System.out.println(ht.isContainingEngLishName("earth"));
		System.out.println(ht.isContainingEngLishName("mars"));
		System.out.println(ht.isContainingEngLishName("sun"));
		
		System.out.println(ht.getInfoByEnglishName("saturn"));
		System.out.println(ht.getInfoByEnglishName("earth"));
		System.out.println(ht.getInfoByEnglishName("sun"));
		//System.out.println(ht.getRandomPlanet());
		//System.out.println(ht.getPlanet_MaxChuky());
    }
    
}
