package cn.kgc.computer;

public class Computer {
	private Cpu cpu;
	private HardDisk harddisk;
	private Ems ems;
	public Computer() {
		super();
		
	}
	public Computer(Cpu cpu, HardDisk harddisk, Ems ems) {
		super();
		this.cpu = cpu;
		this.harddisk = harddisk;
		this.ems = ems;
	}
	public Cpu getCpu() {
		return cpu;
	}
	public HardDisk getHarddisk() {
		return harddisk;
	}
	public Ems getEms() {
		return ems;
	}
	
}
