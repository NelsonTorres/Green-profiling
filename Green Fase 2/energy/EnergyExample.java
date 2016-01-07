
public class EnergyExample{

	public static void main(String[] args) {
		EnergyCheckUtils.init();
		int socketNum = EnergyCheckUtils.getSocketNum();

		double[] energia = EnergyCheckUtils.getEnergyStats();

		for(int i = 0; i < socketNum; i++) {
			System.out.println("dram: " + energia[(0+(3*i))] + " cpu: " + (energia[(1+(3*i))] ) + " package: " + (energia[(2+(3*i))]));
		}

		EnergyCheckUtils.profileDealloc();

	}

}