package mytour.user.entity;
// Generated Jun 21, 2016 11:07:44 PM by Hibernate Tools 4.3.1.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * ChiTietHoaDon generated by hbm2java
 */
@Entity
@Table(name = "chi_tiet_hoa_don", catalog = "mydb")
public class ChiTietHoaDon implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer idChiTietHoaDon;
	private int idUser;
	private int tourId;
	private int hotelId;
	private String ngayKhoiHanh;
	private String ngayKetThuc;
	private int soNguoi;

	public ChiTietHoaDon() {
	}

	public ChiTietHoaDon(int idUser, int tourId, int hotelId, String ngayKhoiHanh, String ngayKetThuc, int soNguoi) {
		this.idUser = idUser;
		this.tourId = tourId;
		this.hotelId = hotelId;
		this.ngayKhoiHanh = ngayKhoiHanh;
		this.ngayKetThuc = ngayKetThuc;
		this.soNguoi = soNguoi;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "id_chi_tiet_hoa_don", unique = true, nullable = false)
	public Integer getIdChiTietHoaDon() {
		return this.idChiTietHoaDon;
	}

	public void setIdChiTietHoaDon(Integer idChiTietHoaDon) {
		this.idChiTietHoaDon = idChiTietHoaDon;
	}

	@Column(name = "id_user", nullable = false)
	public int getIdUser() {
		return this.idUser;
	}

	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}

	@Column(name = "tour_id", nullable = false)
	public int getTourId() {
		return this.tourId;
	}

	public void setTourId(int tourId) {
		this.tourId = tourId;
	}

	@Column(name = "hotel_id", nullable = false)
	public int getHotelId() {
		return this.hotelId;
	}

	public void setHotelId(int hotelId) {
		this.hotelId = hotelId;
	}

	@Column(name = "ngay_khoi_hanh", nullable = false, length = 50)
	public String getNgayKhoiHanh() {
		return this.ngayKhoiHanh;
	}

	public void setNgayKhoiHanh(String ngayKhoiHanh) {
		this.ngayKhoiHanh = ngayKhoiHanh;
	}

	@Column(name = "ngay_ket_thuc", nullable = false, length = 50)
	public String getNgayKetThuc() {
		return this.ngayKetThuc;
	}

	public void setNgayKetThuc(String ngayKetThuc) {
		this.ngayKetThuc = ngayKetThuc;
	}

	@Column(name = "so_nguoi", nullable = false)
	public int getSoNguoi() {
		return this.soNguoi;
	}

	public void setSoNguoi(int soNguoi) {
		this.soNguoi = soNguoi;
	}

}
