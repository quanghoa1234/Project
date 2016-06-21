package mytour.user.entity;
// Generated Jun 21, 2016 11:07:44 PM by Hibernate Tools 4.3.1.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * DanhMucTour generated by hbm2java
 */
@Entity
@Table(name = "danh_muc_tour", catalog = "mydb")
public class DanhMucTour implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer idDanhMuc;
	private String tenDanhMuc;

	public DanhMucTour() {
	}

	public DanhMucTour(String tenDanhMuc) {
		this.tenDanhMuc = tenDanhMuc;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "ID_danh_muc", unique = true, nullable = false)
	public Integer getIdDanhMuc() {
		return this.idDanhMuc;
	}

	public void setIdDanhMuc(Integer idDanhMuc) {
		this.idDanhMuc = idDanhMuc;
	}

	@Column(name = "ten_danh_muc", nullable = false, length = 100)
	public String getTenDanhMuc() {
		return this.tenDanhMuc;
	}

	public void setTenDanhMuc(String tenDanhMuc) {
		this.tenDanhMuc = tenDanhMuc;
	}

}