package com.testprima.testprima.entity;
import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name = "family")
public class Family {
    @Id
    @Column(name="keluarga_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer familyId;
    @Column(name = "nama_anggota_keluarga")
    private String namaAnggotaKeluarga;
    @Column(name = "hubungan_keluarga")
    private String hubunganKeluarga;
    @Column(name = "tanggal_lahir_anggota_keluarga")
    private Date tanggalLahir;
    @Column(name = "employee_id", nullable=false)
    private Long employeeId;
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER, optional=false)
    @JoinColumn(name = "employee_id", referencedColumnName = "m_employee_id", insertable=false, updatable=false)
    private Employee employee;
    public String getnama() {
        return namaAnggotaKeluarga;
    }
    public String gethubungan() {
        return hubunganKeluarga;
    }
    public Date gettanggal_lahir() {
        return tanggalLahir;
    }
}