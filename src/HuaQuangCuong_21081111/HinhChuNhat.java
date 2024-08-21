package HuaQuangCuong_21081111;

public class HinhChuNhat {
//Khoi tao
 private double chieuDai; 
 private double chieuRong;
 //dong goi
public double getChieuDai() {
	return chieuDai;
}
//rang buoc
public void setChieuDai(double d) {
	if(d>0) {
	this.chieuDai = d;
	}else {
	System.out.println("Lỗi chiều dài");
	}
}
public double getChieuRong() {
	return chieuRong;
}
public void setChieuRong(double r) {
	if(r>0) {
	this.chieuRong = r;
	}else {
		System.out.println("Lỗi chiều rộng");
		}
}
//contructor
public HinhChuNhat(){}
public HinhChuNhat(double d, double r) {
	if(d>0 && r>0) {
		this.chieuDai = d;
		this.chieuRong = r;
	}else if(r<=0) {
		System.out.println("Lỗi chiều rộng");
	}else {
		System.out.println("Lỗi chiều dài");
	}
}
//phuong thuc
public double getCV() {
	return ((getChieuDai() + getChieuRong())*2);
}
public double getDT() {
	return ((getChieuDai()*getChieuRong()));
}
@Override
	public String toString() {
		String s = ""; 
		return s=s+s.format("|%10s|%10s|%10s|%10s|", getChieuDai(),getChieuRong(),getCV(),getDT());
	}
}
