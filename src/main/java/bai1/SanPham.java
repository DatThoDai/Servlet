package bai1;

public class SanPham {
	private String tenSanPham;
	private int soLuong;
	private long giaBan;

	public SanPham() {
	}

	public SanPham(String tenSanPham, int soLuong, long giaBan) {
		this.tenSanPham = tenSanPham;
		this.soLuong = soLuong;
		this.giaBan = giaBan;
	}

	public String getTenSanPham() {
		return tenSanPham;
	}

	public void setTenSanPham(String tenSanPham) {
		this.tenSanPham = tenSanPham;
	}

	public int getSoLuong() {
		return soLuong;
	}

	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}

	public long getGiaBan() {
		return giaBan;
	}

	public void setGiaBan(long giaBan) {
		this.giaBan = giaBan;
	}
}
