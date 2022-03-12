package epic2.phuongtrinh.model;

public class Delta {
	private double delta;
	
	public Delta() {}

	public Delta(double delta) {
		this.delta = delta;
	}

	public double getDelta() {
		return delta;
	}

	public void setDelta(double delta) {
		this.delta = delta;
	}
	
	public void calDelta(Factor heSo) {
		this.delta = heSo.getHeSoCuaX()*heSo.getHeSoCuaX() - 4*heSo.getHeSoCuaXBinh()*heSo.getHangSo();
	}
}
