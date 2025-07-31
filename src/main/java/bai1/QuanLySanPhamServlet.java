package bai1;

import java.io.IOException;
import java.util.ArrayList;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name = "QuanLySanPhamServlet", urlPatterns = { "/quanlysanpham" })
public class QuanLySanPhamServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static ArrayList<SanPham> danhSachSanPham = new ArrayList<>();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setAttribute("danhSachSanPham", danhSachSanPham);
		req.getRequestDispatcher("/quanlysanpham.jsp").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {	
		String tenSanPham = req.getParameter("tenSanPham");
		String soLuongStr = req.getParameter("soLuong");
		String giaBanStr = req.getParameter("giaBan");
		
		if (tenSanPham != null && !tenSanPham.isEmpty() && soLuongStr != null && !soLuongStr.isEmpty() && giaBanStr != null && !giaBanStr.isEmpty()) {
			try {
				int soLuong = Integer.parseInt(soLuongStr);
				long giaBan = Long.parseLong(giaBanStr);
				if (soLuong > 0 && giaBan > 0) {
					SanPham sanPham = new SanPham(tenSanPham, soLuong, giaBan);
					danhSachSanPham.add(sanPham);
				}
			} catch (NumberFormatException e) {
				System.out.println("Lỗi định dạng số: " + e.getMessage());
			}
		}
		resp.sendRedirect(req.getContextPath() + "/quanlysanpham");
	}
}
