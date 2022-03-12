package epic2.phuongtrinh.model;

public class Factor {
	private double heSoCuaXBinh;
	private double heSoCuaX;
	private double hangSo;
	public Factor(double heSoCuaXBinh, double heSoCuaX, double hangSo) {
		this.heSoCuaXBinh = heSoCuaXBinh;
		this.heSoCuaX = heSoCuaX;
		this.hangSo = hangSo;
	}
	public Factor() {
	}
	public double getHeSoCuaXBinh() {
		return heSoCuaXBinh;
	}
	public void setHeSoCuaXBinh(double heSoCuaXBinh) {
		this.heSoCuaXBinh = heSoCuaXBinh;
	}
	public double getHeSoCuaX() {
		return heSoCuaX;
	}
	public void setHeSoCuaX(double heSoCuaX) {
		this.heSoCuaX = heSoCuaX;
	}
	public double getHangSo() {
		return hangSo;
	}
	public void setHangSo(double hangSo) {
		this.hangSo = hangSo;
	}
	
}
