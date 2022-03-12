package epic2.phuongtrinh;

import epic2.phuongtrinh.model.Delta;
import epic2.phuongtrinh.model.Factor;
import epic2.phuongtrinh.model.Result;

public class Main {
	public static void main(String[] args) {
		Factor heSo = new Factor();
		// Set factor for equation
		heSo.setHeSoCuaXBinh(2);
		heSo.setHeSoCuaX(-3);
		heSo.setHangSo(1);
		// Calculate and show the result on console
		showResult(calPhuongTrinhBac2(heSo));
		
	}
	/**
	 * Show result of equation
	 * @param Result
	 */
	public static void showResult(Result nghiem) {
		if(nghiem == null) {
			System.out.println("Phuong trinh vo nghiem");
		} else {
			if(nghiem.getX2() == null) {
				System.out.println("Phuong trinh co 1 nghiem: x1 ="+nghiem.getX1());
			} else {
				System.out.println("Phuong trinh co 2 nghiem: \nx1 ="+nghiem.getX1() +"\nx2="+nghiem.getX2());
			}
			
		}
	}
	/**
	 * Calculate equation
	 * @param Factor
	 * @return Result
	 */
	public static Result calPhuongTrinhBac2(Factor heSo) {
		
		Result nghiem = null;
		if (heSo.getHeSoCuaXBinh() == 0) {
			if (heSo.getHeSoCuaX() != 0) {
				nghiem = new Result();
				// Co 1 nghiem
				nghiem.setX1(-heSo.getHangSo()/heSo.getHeSoCuaX());
				return nghiem;
			} else {
				// Vo nghiem
				return nghiem;
			}
		}
		Delta delta = new Delta();
		delta.calDelta(heSo);
		if (delta.getDelta() > 0) {
			nghiem = new Result();
			nghiem.setX1((-heSo.getHeSoCuaX() + Math.sqrt(delta.getDelta())) / (2 * heSo.getHeSoCuaXBinh()));
			nghiem.setX2((-heSo.getHeSoCuaX() - Math.sqrt(delta.getDelta())) / (2 * heSo.getHeSoCuaXBinh()));
			// Phuong trinh co 2 nghiem
			return nghiem;
		}
		else {
			if(delta.getDelta() ==0) {
				nghiem.setX1(-heSo.getHeSoCuaX() / (2 * heSo.getHeSoCuaXBinh()));
				nghiem.setX2(-heSo.getHeSoCuaX() / (2 * heSo.getHeSoCuaXBinh()));
				// Phuong trinh co 2 nghiem bang nhau
				return nghiem;
			}
			else {
				// Vo nghiem
				return nghiem;
			}
		}
	}
}
