package maqv;

public class EnergyExample{


	public static void main(String[] args) {
		EnergyCheckUtils.init();
		int socketNum = EnergyCheckUtils.getSocketNum();

		double[] before = EnergyCheckUtils.getEnergyStats();
				try{			
			Thread.sleep(10000);
		} catch(Exception e) {
		}
		double[] after = EnergyCheckUtils.getEnergyStats();

		for(int i = 0; i < socketNum; i++) {
			System.out.println("dram: " + (after[(0+(3*i))] - before[(0+(3*i))]) + " cpu: " + (after[(1+(3*i))] - before[(1+(3*i))]) + " package: " + (after[(2+(3*i))] - before[(2+(3*i))]));
		}

		EnergyCheckUtils.profileDealloc();
	}

}
