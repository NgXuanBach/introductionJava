package epic2;

public class BaiTap {
	public static void main(String[] args) {
		Object xuanBach = new Object();
		xuanBach.a = 5f;
		xuanBach.b = 3f;
		xuanBach.c = 1f;
		xuanBach.delta = (xuanBach.b * xuanBach.b) - 4 * xuanBach.a * xuanBach.c;
		xuanBach.pTBac21(xuanBach.a, xuanBach.b, xuanBach.c);
		xuanBach.pTBac22(xuanBach.a, xuanBach.b, xuanBach.c);
	}
}
