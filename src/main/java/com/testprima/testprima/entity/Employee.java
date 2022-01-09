package com.testprima.testprima.entity;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@Entity
@Table(name = "m_employee")
public class Employee {
    @Id
    @Column(name="m_employee_id")
    private Integer employeeId;
    @Column(name = "nama_karyawan")
    private String namaKaryawan;
    @Column(name = "tanggal_lahir")
    private Date tanggalLahir;
    @Column(name = "alamat")
    private String alamat;
    @Column(name = "email")
    private String email;
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "employee", cascade = CascadeType.ALL)
    @JsonIgnoreProperties("employee")
    private List<Family> keluarga = new ArrayList<>();
    public List<Family> getkeluarga() {
        return keluarga;
    }
    public String getnama() {
        return namaKaryawan;
    }
    public Date gettanggal_lahir() {
        return tanggalLahir;
    }
    public String getalamat() {
        return namaKaryawan;
    }
    public String getemail() {
        return namaKaryawan;
    }
    public void setkeluarga(List<Family> keluarga) {
        this.keluarga = keluarga;
    }
}