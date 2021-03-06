package mytour.user.entity;
// Generated Jun 21, 2016 11:07:44 PM by Hibernate Tools 4.3.1.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Hotel generated by hbm2java
 */
@Entity
@Table(name = "hotel", catalog = "mydb")
public class Hotel implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer idHotel;
	private int idPlace;
	private String tenHotel;
	private String address;
	private Integer soSao;
	private String moTa;
	private String imgLink;
	private int giaPhongDon;
	private int giaPhongDoi;
	private Integer soPhong;

	public Hotel() {
	}

	public Hotel(int idPlace, String tenHotel, String address, String imgLink, int giaPhongDon, int giaPhongDoi) {
		this.idPlace = idPlace;
		this.tenHotel = tenHotel;
		this.address = address;
		this.imgLink = imgLink;
		this.giaPhongDon = giaPhongDon;
		this.giaPhongDoi = giaPhongDoi;
	}

	public Hotel(int idPlace, String tenHotel, String address, Integer soSao, String moTa, String imgLink,
			int giaPhongDon, int giaPhongDoi, Integer soPhong) {
		this.idPlace = idPlace;
		this.tenHotel = tenHotel;
		this.address = address;
		this.soSao = soSao;
		this.moTa = moTa;
		this.imgLink = imgLink;
		this.giaPhongDon = giaPhongDon;
		this.giaPhongDoi = giaPhongDoi;
		this.soPhong = soPhong;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "ID_hotel", unique = true, nullable = false)
	public Integer getIdHotel() {
		return this.idHotel;
	}

	public void setIdHotel(Integer idHotel) {
		this.idHotel = idHotel;
	}

	@Column(name = "ID_place", nullable = false)
	public int getIdPlace() {
		return this.idPlace;
	}

	public void setIdPlace(int idPlace) {
		this.idPlace = idPlace;
	}

	@Column(name = "ten_hotel", nullable = false, length = 300)
	public String getTenHotel() {
		return this.tenHotel;
	}

	public void setTenHotel(String tenHotel) {
		this.tenHotel = tenHotel;
	}

	@Column(name = "address", nullable = false, length = 300)
	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Column(name = "so_sao")
	public Integer getSoSao() {
		return this.soSao;
	}

	public void setSoSao(Integer soSao) {
		this.soSao = soSao;
	}

	@Column(name = "mo_ta", length = 16383)
	public String getMoTa() {
		return this.moTa;
	}

	public void setMoTa(String moTa) {
		this.moTa = moTa;
	}

	@Column(name = "img_link", nullable = false, length = 300)
	public String getImgLink() {
		return this.imgLink;
	}

	public void setImgLink(String imgLink) {
		this.imgLink = imgLink;
	}

	@Column(name = "gia_phong_don", nullable = false)
	public int getGiaPhongDon() {
		return this.giaPhongDon;
	}

	public void setGiaPhongDon(int giaPhongDon) {
		this.giaPhongDon = giaPhongDon;
	}

	@Column(name = "gia_phong_doi", nullable = false)
	public int getGiaPhongDoi() {
		return this.giaPhongDoi;
	}

	public void setGiaPhongDoi(int giaPhongDoi) {
		this.giaPhongDoi = giaPhongDoi;
	}

	@Column(name = "so_phong")
	public Integer getSoPhong() {
		return this.soPhong;
	}

	public void setSoPhong(Integer soPhong) {
		this.soPhong = soPhong;
	}

}
