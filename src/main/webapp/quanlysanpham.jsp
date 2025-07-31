<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<!DOCTYPE html>
<html lang="vi">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Quản Lý Sản Phẩm</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="bg-light">
    <div class="container mt-5 border p-4">
        <h2 class="mb-4">QUẢN LÝ SẢN PHẨM</h2>
        
        <form action="quanlysanpham" method="post">
            <div class="mb-3 row">
                <label for="tenSanPham" class="form-label">Tên Sản Phẩm:</label>
                <div class="col-6">
                	<input type="text" class="form-control" id="tenSanPham" name="tenSanPham" required>
                </div>
            </div>
            
            <div class="mb-3 row">
                <label for="soLuong" class="form-label">Số lượng:</label>
                <div class="col-6">
                	<input type="number" class="form-control" id="soLuong" name="soLuong" required>
                </div>
            </div>
            
            <div class="mb-3 row">
                <label for="giaBan" class="form-label">Giá bán:</label>
                <div class="col-6">
                	<input type="number" class="form-control" id="giaBan" name="giaBan" required>
                </div>
            </div>
            
            <button type="submit" class="btn btn-primary mb-4">Lưu lại</button>
        </form>

        <table class="table table-bordered">
            <thead>
                <tr>
                    <th>STT</th>
                    <th>Tên Sản Phẩm</th>
                    <th>Số Lượng</th>
                    <th>Giá Bán</th>
                </tr>
            </thead>
            <tbody>
                <c:if test="${not empty danhSachSanPham}">
                    <c:forEach var="sanPham" items="${danhSachSanPham}" varStatus="status">
                        <tr>
                            <td>${status.index + 1}</td>
                            <td>${sanPham.tenSanPham}</td>
                            <td>${sanPham.soLuong}</td>
                            <td>${sanPham.giaBan}</td>
                        </tr>
                    </c:forEach>
                </c:if>
            </tbody>
        </table>
    </div>
</body>
</html>