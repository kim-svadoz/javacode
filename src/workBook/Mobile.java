package workBook;

public class Mobile {
	private String mobileName;
	private int batterySize;
	private String osType;
	public String getMobileName() {
		return mobileName;
	}
	public void setMobileName(String mobileName) {
		this.mobileName = mobileName;
	}
	public int getBatterySize() {
		return batterySize;
	}
	public void setBatterySize(int batterySize) {
		this.batterySize = batterySize;
	}
	public String getOsType() {
		return osType;
	}
	public void setOsType(String osType) {
		this.osType = osType;
	}
	public Mobile() {
		
	}
	public Mobile(String mobileName, int batterySize, String osType) {
		super();
		this.mobileName = mobileName;
		this.batterySize = batterySize;
		this.osType = osType;
	}
	public int operate(int time) {
		setBatterySize(getBatterySize()-10*time); 
		return getBatterySize()-10*time; 
	}
	public int charge(int time) {
		setBatterySize(getBatterySize()+10*time);
		return getBatterySize()+10*time;
	}
}
