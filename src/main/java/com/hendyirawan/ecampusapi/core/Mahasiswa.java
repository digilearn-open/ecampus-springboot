package com.hendyirawan.ecampusapi.core;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;

@Entity
@Table(name = "mahasiswa", schema = "public", catalog = "iainbukittinggi")
public class Mahasiswa {
    private long id;
    private String alamat;
    private Integer beratBadan;
    private String email;
    private String golonganDarah;
    private Boolean isEncripted;
    private String kelamin;
    private String keterangan;
    private String keteranganTambahanPengambilanKrs1;
    private String keteranganTambahanPengambilanKrs10;
    private String keteranganTambahanPengambilanKrs11;
    private String keteranganTambahanPengambilanKrs12;
    private String keteranganTambahanPengambilanKrs13;
    private String keteranganTambahanPengambilanKrs14;
    private String keteranganTambahanPengambilanKrs15;
    private String keteranganTambahanPengambilanKrs16;
    private String keteranganTambahanPengambilanKrs17;
    private String keteranganTambahanPengambilanKrs18;
    private String keteranganTambahanPengambilanKrs19;
    private String keteranganTambahanPengambilanKrs2;
    private String keteranganTambahanPengambilanKrs20;
    private String keteranganTambahanPengambilanKrs21;
    private String keteranganTambahanPengambilanKrs22;
    private String keteranganTambahanPengambilanKrs23;
    private String keteranganTambahanPengambilanKrs24;
    private String keteranganTambahanPengambilanKrs25;
    private String keteranganTambahanPengambilanKrs3;
    private String keteranganTambahanPengambilanKrs4;
    private String keteranganTambahanPengambilanKrs5;
    private String keteranganTambahanPengambilanKrs6;
    private String keteranganTambahanPengambilanKrs7;
    private String keteranganTambahanPengambilanKrs8;
    private String keteranganTambahanPengambilanKrs9;
    private String nama;
    private String nim;
    private String oleh;
    private String pass;
    private String program;
    private String semesterMulai;
    private Integer statusKonversi;
    private Integer tahunangkatan;
    private Date tanggalLulus;
    private Timestamp tanggalDirubah;
    private Date tanggallahir;
    private String telp;
    private String tempatlahir;
    private Integer tinggiBadan;
    private String waktuKuliah;
    private String warganegara;
    private String judulSkripsi;
    private String noAkta1;
    private String noAkta2;
    private String noIjazah1;
    private String noIjazah2;
    private Integer tahunWisuda;
    private Date tanggalYudisium;
    private String passOrtu;
    private String userOrtu;
    private String warganegaraAsli;
    private String batasStudi;
    private Integer jumlahSksPenyetaraan;
    private String pindahanNim;
    private String pindahanPerguruanTinggi;
    private String statusKrs;
    private Timestamp tanggalMasuk;
    private String ktp;
    private Integer semesterlulus;
    private Integer tahunlulus;
    private Long pin;
    private String keteranganTambahanPengambilanKrs1000;
    private String formatedtanggallahir;
    private Integer currentsemester;
    private String currenttahunakademik;
    private String imageurl;
    private String keteranganTambahanPengambilanKrs0;
    private String keteranganpindah;
    private String keteranganpindahprodi;
    private Boolean merupakanalihprodi;
    private Boolean merupakanpindahan;
    private String nimlamasebelumpindah;
    private Integer pindahdarikampuslamadisemester;
    private Integer pindahkekampusinimasuksemester;
    private Integer pindahkeprodiinimasuksemester;
    private String pindahandarikampus;
    private Date tanggalpindah;
    private Timestamp tanggalpindahprodi;
    private Long biodataCalonMahasiswaLong;
    private String keteranganbeasiswa;
    private Date blnakhirbimbingan;
    private Date blnawalbimbingan;
    private String feeder;
    private String idregpd;
    private Boolean aktif;
    private String nimbarupindah;
    private String kodeperguruantinggipindah;
    private String kodeprodipindah;
    private Integer sksyangdiakui;
    private Integer sksyangdiakuipindahprodi;
    private String namaprodipindah;
    private String nimkey;
    private Long anggotaperpustakaanid;
    private String facebookid;
    private String googleid;
    private String twitterid;
    private String linkedinid;
    private String socialMediaProfile;
    private String olehid;

    @Id
    @Column(name = "id")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "alamat")
    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    @Basic
    @Column(name = "berat_badan")
    public Integer getBeratBadan() {
        return beratBadan;
    }

    public void setBeratBadan(Integer beratBadan) {
        this.beratBadan = beratBadan;
    }

    @Basic
    @Column(name = "email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "golongan_darah")
    public String getGolonganDarah() {
        return golonganDarah;
    }

    public void setGolonganDarah(String golonganDarah) {
        this.golonganDarah = golonganDarah;
    }

    @Basic
    @Column(name = "is_encripted")
    public Boolean getEncripted() {
        return isEncripted;
    }

    public void setEncripted(Boolean encripted) {
        isEncripted = encripted;
    }

    @Basic
    @Column(name = "kelamin")
    public String getKelamin() {
        return kelamin;
    }

    public void setKelamin(String kelamin) {
        this.kelamin = kelamin;
    }

    @Basic
    @Column(name = "keterangan")
    public String getKeterangan() {
        return keterangan;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }

    @Basic
    @Column(name = "keterangan_tambahan_pengambilan_krs1")
    public String getKeteranganTambahanPengambilanKrs1() {
        return keteranganTambahanPengambilanKrs1;
    }

    public void setKeteranganTambahanPengambilanKrs1(String keteranganTambahanPengambilanKrs1) {
        this.keteranganTambahanPengambilanKrs1 = keteranganTambahanPengambilanKrs1;
    }

    @Basic
    @Column(name = "keterangan_tambahan_pengambilan_krs10")
    public String getKeteranganTambahanPengambilanKrs10() {
        return keteranganTambahanPengambilanKrs10;
    }

    public void setKeteranganTambahanPengambilanKrs10(String keteranganTambahanPengambilanKrs10) {
        this.keteranganTambahanPengambilanKrs10 = keteranganTambahanPengambilanKrs10;
    }

    @Basic
    @Column(name = "keterangan_tambahan_pengambilan_krs11")
    public String getKeteranganTambahanPengambilanKrs11() {
        return keteranganTambahanPengambilanKrs11;
    }

    public void setKeteranganTambahanPengambilanKrs11(String keteranganTambahanPengambilanKrs11) {
        this.keteranganTambahanPengambilanKrs11 = keteranganTambahanPengambilanKrs11;
    }

    @Basic
    @Column(name = "keterangan_tambahan_pengambilan_krs12")
    public String getKeteranganTambahanPengambilanKrs12() {
        return keteranganTambahanPengambilanKrs12;
    }

    public void setKeteranganTambahanPengambilanKrs12(String keteranganTambahanPengambilanKrs12) {
        this.keteranganTambahanPengambilanKrs12 = keteranganTambahanPengambilanKrs12;
    }

    @Basic
    @Column(name = "keterangan_tambahan_pengambilan_krs13")
    public String getKeteranganTambahanPengambilanKrs13() {
        return keteranganTambahanPengambilanKrs13;
    }

    public void setKeteranganTambahanPengambilanKrs13(String keteranganTambahanPengambilanKrs13) {
        this.keteranganTambahanPengambilanKrs13 = keteranganTambahanPengambilanKrs13;
    }

    @Basic
    @Column(name = "keterangan_tambahan_pengambilan_krs14")
    public String getKeteranganTambahanPengambilanKrs14() {
        return keteranganTambahanPengambilanKrs14;
    }

    public void setKeteranganTambahanPengambilanKrs14(String keteranganTambahanPengambilanKrs14) {
        this.keteranganTambahanPengambilanKrs14 = keteranganTambahanPengambilanKrs14;
    }

    @Basic
    @Column(name = "keterangan_tambahan_pengambilan_krs15")
    public String getKeteranganTambahanPengambilanKrs15() {
        return keteranganTambahanPengambilanKrs15;
    }

    public void setKeteranganTambahanPengambilanKrs15(String keteranganTambahanPengambilanKrs15) {
        this.keteranganTambahanPengambilanKrs15 = keteranganTambahanPengambilanKrs15;
    }

    @Basic
    @Column(name = "keterangan_tambahan_pengambilan_krs16")
    public String getKeteranganTambahanPengambilanKrs16() {
        return keteranganTambahanPengambilanKrs16;
    }

    public void setKeteranganTambahanPengambilanKrs16(String keteranganTambahanPengambilanKrs16) {
        this.keteranganTambahanPengambilanKrs16 = keteranganTambahanPengambilanKrs16;
    }

    @Basic
    @Column(name = "keterangan_tambahan_pengambilan_krs17")
    public String getKeteranganTambahanPengambilanKrs17() {
        return keteranganTambahanPengambilanKrs17;
    }

    public void setKeteranganTambahanPengambilanKrs17(String keteranganTambahanPengambilanKrs17) {
        this.keteranganTambahanPengambilanKrs17 = keteranganTambahanPengambilanKrs17;
    }

    @Basic
    @Column(name = "keterangan_tambahan_pengambilan_krs18")
    public String getKeteranganTambahanPengambilanKrs18() {
        return keteranganTambahanPengambilanKrs18;
    }

    public void setKeteranganTambahanPengambilanKrs18(String keteranganTambahanPengambilanKrs18) {
        this.keteranganTambahanPengambilanKrs18 = keteranganTambahanPengambilanKrs18;
    }

    @Basic
    @Column(name = "keterangan_tambahan_pengambilan_krs19")
    public String getKeteranganTambahanPengambilanKrs19() {
        return keteranganTambahanPengambilanKrs19;
    }

    public void setKeteranganTambahanPengambilanKrs19(String keteranganTambahanPengambilanKrs19) {
        this.keteranganTambahanPengambilanKrs19 = keteranganTambahanPengambilanKrs19;
    }

    @Basic
    @Column(name = "keterangan_tambahan_pengambilan_krs2")
    public String getKeteranganTambahanPengambilanKrs2() {
        return keteranganTambahanPengambilanKrs2;
    }

    public void setKeteranganTambahanPengambilanKrs2(String keteranganTambahanPengambilanKrs2) {
        this.keteranganTambahanPengambilanKrs2 = keteranganTambahanPengambilanKrs2;
    }

    @Basic
    @Column(name = "keterangan_tambahan_pengambilan_krs20")
    public String getKeteranganTambahanPengambilanKrs20() {
        return keteranganTambahanPengambilanKrs20;
    }

    public void setKeteranganTambahanPengambilanKrs20(String keteranganTambahanPengambilanKrs20) {
        this.keteranganTambahanPengambilanKrs20 = keteranganTambahanPengambilanKrs20;
    }

    @Basic
    @Column(name = "keterangan_tambahan_pengambilan_krs21")
    public String getKeteranganTambahanPengambilanKrs21() {
        return keteranganTambahanPengambilanKrs21;
    }

    public void setKeteranganTambahanPengambilanKrs21(String keteranganTambahanPengambilanKrs21) {
        this.keteranganTambahanPengambilanKrs21 = keteranganTambahanPengambilanKrs21;
    }

    @Basic
    @Column(name = "keterangan_tambahan_pengambilan_krs22")
    public String getKeteranganTambahanPengambilanKrs22() {
        return keteranganTambahanPengambilanKrs22;
    }

    public void setKeteranganTambahanPengambilanKrs22(String keteranganTambahanPengambilanKrs22) {
        this.keteranganTambahanPengambilanKrs22 = keteranganTambahanPengambilanKrs22;
    }

    @Basic
    @Column(name = "keterangan_tambahan_pengambilan_krs23")
    public String getKeteranganTambahanPengambilanKrs23() {
        return keteranganTambahanPengambilanKrs23;
    }

    public void setKeteranganTambahanPengambilanKrs23(String keteranganTambahanPengambilanKrs23) {
        this.keteranganTambahanPengambilanKrs23 = keteranganTambahanPengambilanKrs23;
    }

    @Basic
    @Column(name = "keterangan_tambahan_pengambilan_krs24")
    public String getKeteranganTambahanPengambilanKrs24() {
        return keteranganTambahanPengambilanKrs24;
    }

    public void setKeteranganTambahanPengambilanKrs24(String keteranganTambahanPengambilanKrs24) {
        this.keteranganTambahanPengambilanKrs24 = keteranganTambahanPengambilanKrs24;
    }

    @Basic
    @Column(name = "keterangan_tambahan_pengambilan_krs25")
    public String getKeteranganTambahanPengambilanKrs25() {
        return keteranganTambahanPengambilanKrs25;
    }

    public void setKeteranganTambahanPengambilanKrs25(String keteranganTambahanPengambilanKrs25) {
        this.keteranganTambahanPengambilanKrs25 = keteranganTambahanPengambilanKrs25;
    }

    @Basic
    @Column(name = "keterangan_tambahan_pengambilan_krs3")
    public String getKeteranganTambahanPengambilanKrs3() {
        return keteranganTambahanPengambilanKrs3;
    }

    public void setKeteranganTambahanPengambilanKrs3(String keteranganTambahanPengambilanKrs3) {
        this.keteranganTambahanPengambilanKrs3 = keteranganTambahanPengambilanKrs3;
    }

    @Basic
    @Column(name = "keterangan_tambahan_pengambilan_krs4")
    public String getKeteranganTambahanPengambilanKrs4() {
        return keteranganTambahanPengambilanKrs4;
    }

    public void setKeteranganTambahanPengambilanKrs4(String keteranganTambahanPengambilanKrs4) {
        this.keteranganTambahanPengambilanKrs4 = keteranganTambahanPengambilanKrs4;
    }

    @Basic
    @Column(name = "keterangan_tambahan_pengambilan_krs5")
    public String getKeteranganTambahanPengambilanKrs5() {
        return keteranganTambahanPengambilanKrs5;
    }

    public void setKeteranganTambahanPengambilanKrs5(String keteranganTambahanPengambilanKrs5) {
        this.keteranganTambahanPengambilanKrs5 = keteranganTambahanPengambilanKrs5;
    }

    @Basic
    @Column(name = "keterangan_tambahan_pengambilan_krs6")
    public String getKeteranganTambahanPengambilanKrs6() {
        return keteranganTambahanPengambilanKrs6;
    }

    public void setKeteranganTambahanPengambilanKrs6(String keteranganTambahanPengambilanKrs6) {
        this.keteranganTambahanPengambilanKrs6 = keteranganTambahanPengambilanKrs6;
    }

    @Basic
    @Column(name = "keterangan_tambahan_pengambilan_krs7")
    public String getKeteranganTambahanPengambilanKrs7() {
        return keteranganTambahanPengambilanKrs7;
    }

    public void setKeteranganTambahanPengambilanKrs7(String keteranganTambahanPengambilanKrs7) {
        this.keteranganTambahanPengambilanKrs7 = keteranganTambahanPengambilanKrs7;
    }

    @Basic
    @Column(name = "keterangan_tambahan_pengambilan_krs8")
    public String getKeteranganTambahanPengambilanKrs8() {
        return keteranganTambahanPengambilanKrs8;
    }

    public void setKeteranganTambahanPengambilanKrs8(String keteranganTambahanPengambilanKrs8) {
        this.keteranganTambahanPengambilanKrs8 = keteranganTambahanPengambilanKrs8;
    }

    @Basic
    @Column(name = "keterangan_tambahan_pengambilan_krs9")
    public String getKeteranganTambahanPengambilanKrs9() {
        return keteranganTambahanPengambilanKrs9;
    }

    public void setKeteranganTambahanPengambilanKrs9(String keteranganTambahanPengambilanKrs9) {
        this.keteranganTambahanPengambilanKrs9 = keteranganTambahanPengambilanKrs9;
    }

    @Basic
    @Column(name = "nama")
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    @Basic
    @Column(name = "nim")
    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    @Basic
    @Column(name = "oleh")
    public String getOleh() {
        return oleh;
    }

    public void setOleh(String oleh) {
        this.oleh = oleh;
    }

    @Basic
    @Column(name = "pass")
    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    @Basic
    @Column(name = "program")
    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    @Basic
    @Column(name = "semester_mulai")
    public String getSemesterMulai() {
        return semesterMulai;
    }

    public void setSemesterMulai(String semesterMulai) {
        this.semesterMulai = semesterMulai;
    }

    @Basic
    @Column(name = "status_konversi")
    public Integer getStatusKonversi() {
        return statusKonversi;
    }

    public void setStatusKonversi(Integer statusKonversi) {
        this.statusKonversi = statusKonversi;
    }

    @Basic
    @Column(name = "tahunangkatan")
    public Integer getTahunangkatan() {
        return tahunangkatan;
    }

    public void setTahunangkatan(Integer tahunangkatan) {
        this.tahunangkatan = tahunangkatan;
    }

    @Basic
    @Column(name = "tanggal_lulus")
    public Date getTanggalLulus() {
        return tanggalLulus;
    }

    public void setTanggalLulus(Date tanggalLulus) {
        this.tanggalLulus = tanggalLulus;
    }

    @Basic
    @Column(name = "tanggal_dirubah")
    public Timestamp getTanggalDirubah() {
        return tanggalDirubah;
    }

    public void setTanggalDirubah(Timestamp tanggalDirubah) {
        this.tanggalDirubah = tanggalDirubah;
    }

    @Basic
    @Column(name = "tanggallahir")
    public Date getTanggallahir() {
        return tanggallahir;
    }

    public void setTanggallahir(Date tanggallahir) {
        this.tanggallahir = tanggallahir;
    }

    @Basic
    @Column(name = "telp")
    public String getTelp() {
        return telp;
    }

    public void setTelp(String telp) {
        this.telp = telp;
    }

    @Basic
    @Column(name = "tempatlahir")
    public String getTempatlahir() {
        return tempatlahir;
    }

    public void setTempatlahir(String tempatlahir) {
        this.tempatlahir = tempatlahir;
    }

    @Basic
    @Column(name = "tinggi_badan")
    public Integer getTinggiBadan() {
        return tinggiBadan;
    }

    public void setTinggiBadan(Integer tinggiBadan) {
        this.tinggiBadan = tinggiBadan;
    }

    @Basic
    @Column(name = "waktu_kuliah")
    public String getWaktuKuliah() {
        return waktuKuliah;
    }

    public void setWaktuKuliah(String waktuKuliah) {
        this.waktuKuliah = waktuKuliah;
    }

    @Basic
    @Column(name = "warganegara")
    public String getWarganegara() {
        return warganegara;
    }

    public void setWarganegara(String warganegara) {
        this.warganegara = warganegara;
    }

    @Basic
    @Column(name = "judul_skripsi")
    public String getJudulSkripsi() {
        return judulSkripsi;
    }

    public void setJudulSkripsi(String judulSkripsi) {
        this.judulSkripsi = judulSkripsi;
    }

    @Basic
    @Column(name = "no_akta1")
    public String getNoAkta1() {
        return noAkta1;
    }

    public void setNoAkta1(String noAkta1) {
        this.noAkta1 = noAkta1;
    }

    @Basic
    @Column(name = "no_akta2")
    public String getNoAkta2() {
        return noAkta2;
    }

    public void setNoAkta2(String noAkta2) {
        this.noAkta2 = noAkta2;
    }

    @Basic
    @Column(name = "no_ijazah1")
    public String getNoIjazah1() {
        return noIjazah1;
    }

    public void setNoIjazah1(String noIjazah1) {
        this.noIjazah1 = noIjazah1;
    }

    @Basic
    @Column(name = "no_ijazah2")
    public String getNoIjazah2() {
        return noIjazah2;
    }

    public void setNoIjazah2(String noIjazah2) {
        this.noIjazah2 = noIjazah2;
    }

    @Basic
    @Column(name = "tahun_wisuda")
    public Integer getTahunWisuda() {
        return tahunWisuda;
    }

    public void setTahunWisuda(Integer tahunWisuda) {
        this.tahunWisuda = tahunWisuda;
    }

    @Basic
    @Column(name = "tanggal_yudisium")
    public Date getTanggalYudisium() {
        return tanggalYudisium;
    }

    public void setTanggalYudisium(Date tanggalYudisium) {
        this.tanggalYudisium = tanggalYudisium;
    }

    @Basic
    @Column(name = "pass_ortu")
    public String getPassOrtu() {
        return passOrtu;
    }

    public void setPassOrtu(String passOrtu) {
        this.passOrtu = passOrtu;
    }

    @Basic
    @Column(name = "user_ortu")
    public String getUserOrtu() {
        return userOrtu;
    }

    public void setUserOrtu(String userOrtu) {
        this.userOrtu = userOrtu;
    }

    @Basic
    @Column(name = "warganegara_asli")
    public String getWarganegaraAsli() {
        return warganegaraAsli;
    }

    public void setWarganegaraAsli(String warganegaraAsli) {
        this.warganegaraAsli = warganegaraAsli;
    }

    @Basic
    @Column(name = "batas_studi")
    public String getBatasStudi() {
        return batasStudi;
    }

    public void setBatasStudi(String batasStudi) {
        this.batasStudi = batasStudi;
    }

    @Basic
    @Column(name = "jumlah_sks_penyetaraan")
    public Integer getJumlahSksPenyetaraan() {
        return jumlahSksPenyetaraan;
    }

    public void setJumlahSksPenyetaraan(Integer jumlahSksPenyetaraan) {
        this.jumlahSksPenyetaraan = jumlahSksPenyetaraan;
    }

    @Basic
    @Column(name = "pindahan_nim")
    public String getPindahanNim() {
        return pindahanNim;
    }

    public void setPindahanNim(String pindahanNim) {
        this.pindahanNim = pindahanNim;
    }

    @Basic
    @Column(name = "pindahan_perguruan_tinggi")
    public String getPindahanPerguruanTinggi() {
        return pindahanPerguruanTinggi;
    }

    public void setPindahanPerguruanTinggi(String pindahanPerguruanTinggi) {
        this.pindahanPerguruanTinggi = pindahanPerguruanTinggi;
    }

    @Basic
    @Column(name = "status_krs")
    public String getStatusKrs() {
        return statusKrs;
    }

    public void setStatusKrs(String statusKrs) {
        this.statusKrs = statusKrs;
    }

    @Basic
    @Column(name = "tanggal_masuk")
    public Timestamp getTanggalMasuk() {
        return tanggalMasuk;
    }

    public void setTanggalMasuk(Timestamp tanggalMasuk) {
        this.tanggalMasuk = tanggalMasuk;
    }

    @Basic
    @Column(name = "ktp")
    public String getKtp() {
        return ktp;
    }

    public void setKtp(String ktp) {
        this.ktp = ktp;
    }

    @Basic
    @Column(name = "semesterlulus")
    public Integer getSemesterlulus() {
        return semesterlulus;
    }

    public void setSemesterlulus(Integer semesterlulus) {
        this.semesterlulus = semesterlulus;
    }

    @Basic
    @Column(name = "tahunlulus")
    public Integer getTahunlulus() {
        return tahunlulus;
    }

    public void setTahunlulus(Integer tahunlulus) {
        this.tahunlulus = tahunlulus;
    }

    @Basic
    @Column(name = "pin")
    public Long getPin() {
        return pin;
    }

    public void setPin(Long pin) {
        this.pin = pin;
    }

    @Basic
    @Column(name = "keterangan_tambahan_pengambilan_krs1000")
    public String getKeteranganTambahanPengambilanKrs1000() {
        return keteranganTambahanPengambilanKrs1000;
    }

    public void setKeteranganTambahanPengambilanKrs1000(String keteranganTambahanPengambilanKrs1000) {
        this.keteranganTambahanPengambilanKrs1000 = keteranganTambahanPengambilanKrs1000;
    }

    @Basic
    @Column(name = "formatedtanggallahir")
    public String getFormatedtanggallahir() {
        return formatedtanggallahir;
    }

    public void setFormatedtanggallahir(String formatedtanggallahir) {
        this.formatedtanggallahir = formatedtanggallahir;
    }

    @Basic
    @Column(name = "currentsemester")
    public Integer getCurrentsemester() {
        return currentsemester;
    }

    public void setCurrentsemester(Integer currentsemester) {
        this.currentsemester = currentsemester;
    }

    @Basic
    @Column(name = "currenttahunakademik")
    public String getCurrenttahunakademik() {
        return currenttahunakademik;
    }

    public void setCurrenttahunakademik(String currenttahunakademik) {
        this.currenttahunakademik = currenttahunakademik;
    }

    @Basic
    @Column(name = "imageurl")
    public String getImageurl() {
        return imageurl;
    }

    public void setImageurl(String imageurl) {
        this.imageurl = imageurl;
    }

    @Basic
    @Column(name = "keterangan_tambahan_pengambilan_krs0")
    public String getKeteranganTambahanPengambilanKrs0() {
        return keteranganTambahanPengambilanKrs0;
    }

    public void setKeteranganTambahanPengambilanKrs0(String keteranganTambahanPengambilanKrs0) {
        this.keteranganTambahanPengambilanKrs0 = keteranganTambahanPengambilanKrs0;
    }

    @Basic
    @Column(name = "keteranganpindah")
    public String getKeteranganpindah() {
        return keteranganpindah;
    }

    public void setKeteranganpindah(String keteranganpindah) {
        this.keteranganpindah = keteranganpindah;
    }

    @Basic
    @Column(name = "keteranganpindahprodi")
    public String getKeteranganpindahprodi() {
        return keteranganpindahprodi;
    }

    public void setKeteranganpindahprodi(String keteranganpindahprodi) {
        this.keteranganpindahprodi = keteranganpindahprodi;
    }

    @Basic
    @Column(name = "merupakanalihprodi")
    public Boolean getMerupakanalihprodi() {
        return merupakanalihprodi;
    }

    public void setMerupakanalihprodi(Boolean merupakanalihprodi) {
        this.merupakanalihprodi = merupakanalihprodi;
    }

    @Basic
    @Column(name = "merupakanpindahan")
    public Boolean getMerupakanpindahan() {
        return merupakanpindahan;
    }

    public void setMerupakanpindahan(Boolean merupakanpindahan) {
        this.merupakanpindahan = merupakanpindahan;
    }

    @Basic
    @Column(name = "nimlamasebelumpindah")
    public String getNimlamasebelumpindah() {
        return nimlamasebelumpindah;
    }

    public void setNimlamasebelumpindah(String nimlamasebelumpindah) {
        this.nimlamasebelumpindah = nimlamasebelumpindah;
    }

    @Basic
    @Column(name = "pindahdarikampuslamadisemester")
    public Integer getPindahdarikampuslamadisemester() {
        return pindahdarikampuslamadisemester;
    }

    public void setPindahdarikampuslamadisemester(Integer pindahdarikampuslamadisemester) {
        this.pindahdarikampuslamadisemester = pindahdarikampuslamadisemester;
    }

    @Basic
    @Column(name = "pindahkekampusinimasuksemester")
    public Integer getPindahkekampusinimasuksemester() {
        return pindahkekampusinimasuksemester;
    }

    public void setPindahkekampusinimasuksemester(Integer pindahkekampusinimasuksemester) {
        this.pindahkekampusinimasuksemester = pindahkekampusinimasuksemester;
    }

    @Basic
    @Column(name = "pindahkeprodiinimasuksemester")
    public Integer getPindahkeprodiinimasuksemester() {
        return pindahkeprodiinimasuksemester;
    }

    public void setPindahkeprodiinimasuksemester(Integer pindahkeprodiinimasuksemester) {
        this.pindahkeprodiinimasuksemester = pindahkeprodiinimasuksemester;
    }

    @Basic
    @Column(name = "pindahandarikampus")
    public String getPindahandarikampus() {
        return pindahandarikampus;
    }

    public void setPindahandarikampus(String pindahandarikampus) {
        this.pindahandarikampus = pindahandarikampus;
    }

    @Basic
    @Column(name = "tanggalpindah")
    public Date getTanggalpindah() {
        return tanggalpindah;
    }

    public void setTanggalpindah(Date tanggalpindah) {
        this.tanggalpindah = tanggalpindah;
    }

    @Basic
    @Column(name = "tanggalpindahprodi")
    public Timestamp getTanggalpindahprodi() {
        return tanggalpindahprodi;
    }

    public void setTanggalpindahprodi(Timestamp tanggalpindahprodi) {
        this.tanggalpindahprodi = tanggalpindahprodi;
    }

    @Basic
    @Column(name = "biodata_calon_mahasiswa_long")
    public Long getBiodataCalonMahasiswaLong() {
        return biodataCalonMahasiswaLong;
    }

    public void setBiodataCalonMahasiswaLong(Long biodataCalonMahasiswaLong) {
        this.biodataCalonMahasiswaLong = biodataCalonMahasiswaLong;
    }

    @Basic
    @Column(name = "keteranganbeasiswa")
    public String getKeteranganbeasiswa() {
        return keteranganbeasiswa;
    }

    public void setKeteranganbeasiswa(String keteranganbeasiswa) {
        this.keteranganbeasiswa = keteranganbeasiswa;
    }

    @Basic
    @Column(name = "blnakhirbimbingan")
    public Date getBlnakhirbimbingan() {
        return blnakhirbimbingan;
    }

    public void setBlnakhirbimbingan(Date blnakhirbimbingan) {
        this.blnakhirbimbingan = blnakhirbimbingan;
    }

    @Basic
    @Column(name = "blnawalbimbingan")
    public Date getBlnawalbimbingan() {
        return blnawalbimbingan;
    }

    public void setBlnawalbimbingan(Date blnawalbimbingan) {
        this.blnawalbimbingan = blnawalbimbingan;
    }

    @Basic
    @Column(name = "feeder")
    public String getFeeder() {
        return feeder;
    }

    public void setFeeder(String feeder) {
        this.feeder = feeder;
    }

    @Basic
    @Column(name = "idregpd")
    public String getIdregpd() {
        return idregpd;
    }

    public void setIdregpd(String idregpd) {
        this.idregpd = idregpd;
    }

    @Basic
    @Column(name = "aktif")
    public Boolean getAktif() {
        return aktif;
    }

    public void setAktif(Boolean aktif) {
        this.aktif = aktif;
    }

    @Basic
    @Column(name = "nimbarupindah")
    public String getNimbarupindah() {
        return nimbarupindah;
    }

    public void setNimbarupindah(String nimbarupindah) {
        this.nimbarupindah = nimbarupindah;
    }

    @Basic
    @Column(name = "kodeperguruantinggipindah")
    public String getKodeperguruantinggipindah() {
        return kodeperguruantinggipindah;
    }

    public void setKodeperguruantinggipindah(String kodeperguruantinggipindah) {
        this.kodeperguruantinggipindah = kodeperguruantinggipindah;
    }

    @Basic
    @Column(name = "kodeprodipindah")
    public String getKodeprodipindah() {
        return kodeprodipindah;
    }

    public void setKodeprodipindah(String kodeprodipindah) {
        this.kodeprodipindah = kodeprodipindah;
    }

    @Basic
    @Column(name = "sksyangdiakui")
    public Integer getSksyangdiakui() {
        return sksyangdiakui;
    }

    public void setSksyangdiakui(Integer sksyangdiakui) {
        this.sksyangdiakui = sksyangdiakui;
    }

    @Basic
    @Column(name = "sksyangdiakuipindahprodi")
    public Integer getSksyangdiakuipindahprodi() {
        return sksyangdiakuipindahprodi;
    }

    public void setSksyangdiakuipindahprodi(Integer sksyangdiakuipindahprodi) {
        this.sksyangdiakuipindahprodi = sksyangdiakuipindahprodi;
    }

    @Basic
    @Column(name = "namaprodipindah")
    public String getNamaprodipindah() {
        return namaprodipindah;
    }

    public void setNamaprodipindah(String namaprodipindah) {
        this.namaprodipindah = namaprodipindah;
    }

    @Basic
    @Column(name = "nimkey")
    public String getNimkey() {
        return nimkey;
    }

    public void setNimkey(String nimkey) {
        this.nimkey = nimkey;
    }

    @Basic
    @Column(name = "anggotaperpustakaanid")
    public Long getAnggotaperpustakaanid() {
        return anggotaperpustakaanid;
    }

    public void setAnggotaperpustakaanid(Long anggotaperpustakaanid) {
        this.anggotaperpustakaanid = anggotaperpustakaanid;
    }

    @Basic
    @Column(name = "facebookid")
    public String getFacebookid() {
        return facebookid;
    }

    public void setFacebookid(String facebookid) {
        this.facebookid = facebookid;
    }

    @Basic
    @Column(name = "googleid")
    public String getGoogleid() {
        return googleid;
    }

    public void setGoogleid(String googleid) {
        this.googleid = googleid;
    }

    @Basic
    @Column(name = "twitterid")
    public String getTwitterid() {
        return twitterid;
    }

    public void setTwitterid(String twitterid) {
        this.twitterid = twitterid;
    }

    @Basic
    @Column(name = "linkedinid")
    public String getLinkedinid() {
        return linkedinid;
    }

    public void setLinkedinid(String linkedinid) {
        this.linkedinid = linkedinid;
    }

    @Basic
    @Column(name = "social_media_profile")
    public String getSocialMediaProfile() {
        return socialMediaProfile;
    }

    public void setSocialMediaProfile(String socialMediaProfile) {
        this.socialMediaProfile = socialMediaProfile;
    }

    @Basic
    @Column(name = "olehid")
    public String getOlehid() {
        return olehid;
    }

    public void setOlehid(String olehid) {
        this.olehid = olehid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Mahasiswa that = (Mahasiswa) o;

        if (id != that.id) return false;
        if (alamat != null ? !alamat.equals(that.alamat) : that.alamat != null) return false;
        if (beratBadan != null ? !beratBadan.equals(that.beratBadan) : that.beratBadan != null) return false;
        if (email != null ? !email.equals(that.email) : that.email != null) return false;
        if (golonganDarah != null ? !golonganDarah.equals(that.golonganDarah) : that.golonganDarah != null)
            return false;
        if (isEncripted != null ? !isEncripted.equals(that.isEncripted) : that.isEncripted != null) return false;
        if (kelamin != null ? !kelamin.equals(that.kelamin) : that.kelamin != null) return false;
        if (keterangan != null ? !keterangan.equals(that.keterangan) : that.keterangan != null) return false;
        if (keteranganTambahanPengambilanKrs1 != null ? !keteranganTambahanPengambilanKrs1.equals(that.keteranganTambahanPengambilanKrs1) : that.keteranganTambahanPengambilanKrs1 != null)
            return false;
        if (keteranganTambahanPengambilanKrs10 != null ? !keteranganTambahanPengambilanKrs10.equals(that.keteranganTambahanPengambilanKrs10) : that.keteranganTambahanPengambilanKrs10 != null)
            return false;
        if (keteranganTambahanPengambilanKrs11 != null ? !keteranganTambahanPengambilanKrs11.equals(that.keteranganTambahanPengambilanKrs11) : that.keteranganTambahanPengambilanKrs11 != null)
            return false;
        if (keteranganTambahanPengambilanKrs12 != null ? !keteranganTambahanPengambilanKrs12.equals(that.keteranganTambahanPengambilanKrs12) : that.keteranganTambahanPengambilanKrs12 != null)
            return false;
        if (keteranganTambahanPengambilanKrs13 != null ? !keteranganTambahanPengambilanKrs13.equals(that.keteranganTambahanPengambilanKrs13) : that.keteranganTambahanPengambilanKrs13 != null)
            return false;
        if (keteranganTambahanPengambilanKrs14 != null ? !keteranganTambahanPengambilanKrs14.equals(that.keteranganTambahanPengambilanKrs14) : that.keteranganTambahanPengambilanKrs14 != null)
            return false;
        if (keteranganTambahanPengambilanKrs15 != null ? !keteranganTambahanPengambilanKrs15.equals(that.keteranganTambahanPengambilanKrs15) : that.keteranganTambahanPengambilanKrs15 != null)
            return false;
        if (keteranganTambahanPengambilanKrs16 != null ? !keteranganTambahanPengambilanKrs16.equals(that.keteranganTambahanPengambilanKrs16) : that.keteranganTambahanPengambilanKrs16 != null)
            return false;
        if (keteranganTambahanPengambilanKrs17 != null ? !keteranganTambahanPengambilanKrs17.equals(that.keteranganTambahanPengambilanKrs17) : that.keteranganTambahanPengambilanKrs17 != null)
            return false;
        if (keteranganTambahanPengambilanKrs18 != null ? !keteranganTambahanPengambilanKrs18.equals(that.keteranganTambahanPengambilanKrs18) : that.keteranganTambahanPengambilanKrs18 != null)
            return false;
        if (keteranganTambahanPengambilanKrs19 != null ? !keteranganTambahanPengambilanKrs19.equals(that.keteranganTambahanPengambilanKrs19) : that.keteranganTambahanPengambilanKrs19 != null)
            return false;
        if (keteranganTambahanPengambilanKrs2 != null ? !keteranganTambahanPengambilanKrs2.equals(that.keteranganTambahanPengambilanKrs2) : that.keteranganTambahanPengambilanKrs2 != null)
            return false;
        if (keteranganTambahanPengambilanKrs20 != null ? !keteranganTambahanPengambilanKrs20.equals(that.keteranganTambahanPengambilanKrs20) : that.keteranganTambahanPengambilanKrs20 != null)
            return false;
        if (keteranganTambahanPengambilanKrs21 != null ? !keteranganTambahanPengambilanKrs21.equals(that.keteranganTambahanPengambilanKrs21) : that.keteranganTambahanPengambilanKrs21 != null)
            return false;
        if (keteranganTambahanPengambilanKrs22 != null ? !keteranganTambahanPengambilanKrs22.equals(that.keteranganTambahanPengambilanKrs22) : that.keteranganTambahanPengambilanKrs22 != null)
            return false;
        if (keteranganTambahanPengambilanKrs23 != null ? !keteranganTambahanPengambilanKrs23.equals(that.keteranganTambahanPengambilanKrs23) : that.keteranganTambahanPengambilanKrs23 != null)
            return false;
        if (keteranganTambahanPengambilanKrs24 != null ? !keteranganTambahanPengambilanKrs24.equals(that.keteranganTambahanPengambilanKrs24) : that.keteranganTambahanPengambilanKrs24 != null)
            return false;
        if (keteranganTambahanPengambilanKrs25 != null ? !keteranganTambahanPengambilanKrs25.equals(that.keteranganTambahanPengambilanKrs25) : that.keteranganTambahanPengambilanKrs25 != null)
            return false;
        if (keteranganTambahanPengambilanKrs3 != null ? !keteranganTambahanPengambilanKrs3.equals(that.keteranganTambahanPengambilanKrs3) : that.keteranganTambahanPengambilanKrs3 != null)
            return false;
        if (keteranganTambahanPengambilanKrs4 != null ? !keteranganTambahanPengambilanKrs4.equals(that.keteranganTambahanPengambilanKrs4) : that.keteranganTambahanPengambilanKrs4 != null)
            return false;
        if (keteranganTambahanPengambilanKrs5 != null ? !keteranganTambahanPengambilanKrs5.equals(that.keteranganTambahanPengambilanKrs5) : that.keteranganTambahanPengambilanKrs5 != null)
            return false;
        if (keteranganTambahanPengambilanKrs6 != null ? !keteranganTambahanPengambilanKrs6.equals(that.keteranganTambahanPengambilanKrs6) : that.keteranganTambahanPengambilanKrs6 != null)
            return false;
        if (keteranganTambahanPengambilanKrs7 != null ? !keteranganTambahanPengambilanKrs7.equals(that.keteranganTambahanPengambilanKrs7) : that.keteranganTambahanPengambilanKrs7 != null)
            return false;
        if (keteranganTambahanPengambilanKrs8 != null ? !keteranganTambahanPengambilanKrs8.equals(that.keteranganTambahanPengambilanKrs8) : that.keteranganTambahanPengambilanKrs8 != null)
            return false;
        if (keteranganTambahanPengambilanKrs9 != null ? !keteranganTambahanPengambilanKrs9.equals(that.keteranganTambahanPengambilanKrs9) : that.keteranganTambahanPengambilanKrs9 != null)
            return false;
        if (nama != null ? !nama.equals(that.nama) : that.nama != null) return false;
        if (nim != null ? !nim.equals(that.nim) : that.nim != null) return false;
        if (oleh != null ? !oleh.equals(that.oleh) : that.oleh != null) return false;
        if (pass != null ? !pass.equals(that.pass) : that.pass != null) return false;
        if (program != null ? !program.equals(that.program) : that.program != null) return false;
        if (semesterMulai != null ? !semesterMulai.equals(that.semesterMulai) : that.semesterMulai != null)
            return false;
        if (statusKonversi != null ? !statusKonversi.equals(that.statusKonversi) : that.statusKonversi != null)
            return false;
        if (tahunangkatan != null ? !tahunangkatan.equals(that.tahunangkatan) : that.tahunangkatan != null)
            return false;
        if (tanggalLulus != null ? !tanggalLulus.equals(that.tanggalLulus) : that.tanggalLulus != null) return false;
        if (tanggalDirubah != null ? !tanggalDirubah.equals(that.tanggalDirubah) : that.tanggalDirubah != null)
            return false;
        if (tanggallahir != null ? !tanggallahir.equals(that.tanggallahir) : that.tanggallahir != null) return false;
        if (telp != null ? !telp.equals(that.telp) : that.telp != null) return false;
        if (tempatlahir != null ? !tempatlahir.equals(that.tempatlahir) : that.tempatlahir != null) return false;
        if (tinggiBadan != null ? !tinggiBadan.equals(that.tinggiBadan) : that.tinggiBadan != null) return false;
        if (waktuKuliah != null ? !waktuKuliah.equals(that.waktuKuliah) : that.waktuKuliah != null) return false;
        if (warganegara != null ? !warganegara.equals(that.warganegara) : that.warganegara != null) return false;
        if (judulSkripsi != null ? !judulSkripsi.equals(that.judulSkripsi) : that.judulSkripsi != null) return false;
        if (noAkta1 != null ? !noAkta1.equals(that.noAkta1) : that.noAkta1 != null) return false;
        if (noAkta2 != null ? !noAkta2.equals(that.noAkta2) : that.noAkta2 != null) return false;
        if (noIjazah1 != null ? !noIjazah1.equals(that.noIjazah1) : that.noIjazah1 != null) return false;
        if (noIjazah2 != null ? !noIjazah2.equals(that.noIjazah2) : that.noIjazah2 != null) return false;
        if (tahunWisuda != null ? !tahunWisuda.equals(that.tahunWisuda) : that.tahunWisuda != null) return false;
        if (tanggalYudisium != null ? !tanggalYudisium.equals(that.tanggalYudisium) : that.tanggalYudisium != null)
            return false;
        if (passOrtu != null ? !passOrtu.equals(that.passOrtu) : that.passOrtu != null) return false;
        if (userOrtu != null ? !userOrtu.equals(that.userOrtu) : that.userOrtu != null) return false;
        if (warganegaraAsli != null ? !warganegaraAsli.equals(that.warganegaraAsli) : that.warganegaraAsli != null)
            return false;
        if (batasStudi != null ? !batasStudi.equals(that.batasStudi) : that.batasStudi != null) return false;
        if (jumlahSksPenyetaraan != null ? !jumlahSksPenyetaraan.equals(that.jumlahSksPenyetaraan) : that.jumlahSksPenyetaraan != null)
            return false;
        if (pindahanNim != null ? !pindahanNim.equals(that.pindahanNim) : that.pindahanNim != null) return false;
        if (pindahanPerguruanTinggi != null ? !pindahanPerguruanTinggi.equals(that.pindahanPerguruanTinggi) : that.pindahanPerguruanTinggi != null)
            return false;
        if (statusKrs != null ? !statusKrs.equals(that.statusKrs) : that.statusKrs != null) return false;
        if (tanggalMasuk != null ? !tanggalMasuk.equals(that.tanggalMasuk) : that.tanggalMasuk != null) return false;
        if (ktp != null ? !ktp.equals(that.ktp) : that.ktp != null) return false;
        if (semesterlulus != null ? !semesterlulus.equals(that.semesterlulus) : that.semesterlulus != null)
            return false;
        if (tahunlulus != null ? !tahunlulus.equals(that.tahunlulus) : that.tahunlulus != null) return false;
        if (pin != null ? !pin.equals(that.pin) : that.pin != null) return false;
        if (keteranganTambahanPengambilanKrs1000 != null ? !keteranganTambahanPengambilanKrs1000.equals(that.keteranganTambahanPengambilanKrs1000) : that.keteranganTambahanPengambilanKrs1000 != null)
            return false;
        if (formatedtanggallahir != null ? !formatedtanggallahir.equals(that.formatedtanggallahir) : that.formatedtanggallahir != null)
            return false;
        if (currentsemester != null ? !currentsemester.equals(that.currentsemester) : that.currentsemester != null)
            return false;
        if (currenttahunakademik != null ? !currenttahunakademik.equals(that.currenttahunakademik) : that.currenttahunakademik != null)
            return false;
        if (imageurl != null ? !imageurl.equals(that.imageurl) : that.imageurl != null) return false;
        if (keteranganTambahanPengambilanKrs0 != null ? !keteranganTambahanPengambilanKrs0.equals(that.keteranganTambahanPengambilanKrs0) : that.keteranganTambahanPengambilanKrs0 != null)
            return false;
        if (keteranganpindah != null ? !keteranganpindah.equals(that.keteranganpindah) : that.keteranganpindah != null)
            return false;
        if (keteranganpindahprodi != null ? !keteranganpindahprodi.equals(that.keteranganpindahprodi) : that.keteranganpindahprodi != null)
            return false;
        if (merupakanalihprodi != null ? !merupakanalihprodi.equals(that.merupakanalihprodi) : that.merupakanalihprodi != null)
            return false;
        if (merupakanpindahan != null ? !merupakanpindahan.equals(that.merupakanpindahan) : that.merupakanpindahan != null)
            return false;
        if (nimlamasebelumpindah != null ? !nimlamasebelumpindah.equals(that.nimlamasebelumpindah) : that.nimlamasebelumpindah != null)
            return false;
        if (pindahdarikampuslamadisemester != null ? !pindahdarikampuslamadisemester.equals(that.pindahdarikampuslamadisemester) : that.pindahdarikampuslamadisemester != null)
            return false;
        if (pindahkekampusinimasuksemester != null ? !pindahkekampusinimasuksemester.equals(that.pindahkekampusinimasuksemester) : that.pindahkekampusinimasuksemester != null)
            return false;
        if (pindahkeprodiinimasuksemester != null ? !pindahkeprodiinimasuksemester.equals(that.pindahkeprodiinimasuksemester) : that.pindahkeprodiinimasuksemester != null)
            return false;
        if (pindahandarikampus != null ? !pindahandarikampus.equals(that.pindahandarikampus) : that.pindahandarikampus != null)
            return false;
        if (tanggalpindah != null ? !tanggalpindah.equals(that.tanggalpindah) : that.tanggalpindah != null)
            return false;
        if (tanggalpindahprodi != null ? !tanggalpindahprodi.equals(that.tanggalpindahprodi) : that.tanggalpindahprodi != null)
            return false;
        if (biodataCalonMahasiswaLong != null ? !biodataCalonMahasiswaLong.equals(that.biodataCalonMahasiswaLong) : that.biodataCalonMahasiswaLong != null)
            return false;
        if (keteranganbeasiswa != null ? !keteranganbeasiswa.equals(that.keteranganbeasiswa) : that.keteranganbeasiswa != null)
            return false;
        if (blnakhirbimbingan != null ? !blnakhirbimbingan.equals(that.blnakhirbimbingan) : that.blnakhirbimbingan != null)
            return false;
        if (blnawalbimbingan != null ? !blnawalbimbingan.equals(that.blnawalbimbingan) : that.blnawalbimbingan != null)
            return false;
        if (feeder != null ? !feeder.equals(that.feeder) : that.feeder != null) return false;
        if (idregpd != null ? !idregpd.equals(that.idregpd) : that.idregpd != null) return false;
        if (aktif != null ? !aktif.equals(that.aktif) : that.aktif != null) return false;
        if (nimbarupindah != null ? !nimbarupindah.equals(that.nimbarupindah) : that.nimbarupindah != null)
            return false;
        if (kodeperguruantinggipindah != null ? !kodeperguruantinggipindah.equals(that.kodeperguruantinggipindah) : that.kodeperguruantinggipindah != null)
            return false;
        if (kodeprodipindah != null ? !kodeprodipindah.equals(that.kodeprodipindah) : that.kodeprodipindah != null)
            return false;
        if (sksyangdiakui != null ? !sksyangdiakui.equals(that.sksyangdiakui) : that.sksyangdiakui != null)
            return false;
        if (sksyangdiakuipindahprodi != null ? !sksyangdiakuipindahprodi.equals(that.sksyangdiakuipindahprodi) : that.sksyangdiakuipindahprodi != null)
            return false;
        if (namaprodipindah != null ? !namaprodipindah.equals(that.namaprodipindah) : that.namaprodipindah != null)
            return false;
        if (nimkey != null ? !nimkey.equals(that.nimkey) : that.nimkey != null) return false;
        if (anggotaperpustakaanid != null ? !anggotaperpustakaanid.equals(that.anggotaperpustakaanid) : that.anggotaperpustakaanid != null)
            return false;
        if (facebookid != null ? !facebookid.equals(that.facebookid) : that.facebookid != null) return false;
        if (googleid != null ? !googleid.equals(that.googleid) : that.googleid != null) return false;
        if (twitterid != null ? !twitterid.equals(that.twitterid) : that.twitterid != null) return false;
        if (linkedinid != null ? !linkedinid.equals(that.linkedinid) : that.linkedinid != null) return false;
        if (socialMediaProfile != null ? !socialMediaProfile.equals(that.socialMediaProfile) : that.socialMediaProfile != null)
            return false;
        if (olehid != null ? !olehid.equals(that.olehid) : that.olehid != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (alamat != null ? alamat.hashCode() : 0);
        result = 31 * result + (beratBadan != null ? beratBadan.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (golonganDarah != null ? golonganDarah.hashCode() : 0);
        result = 31 * result + (isEncripted != null ? isEncripted.hashCode() : 0);
        result = 31 * result + (kelamin != null ? kelamin.hashCode() : 0);
        result = 31 * result + (keterangan != null ? keterangan.hashCode() : 0);
        result = 31 * result + (keteranganTambahanPengambilanKrs1 != null ? keteranganTambahanPengambilanKrs1.hashCode() : 0);
        result = 31 * result + (keteranganTambahanPengambilanKrs10 != null ? keteranganTambahanPengambilanKrs10.hashCode() : 0);
        result = 31 * result + (keteranganTambahanPengambilanKrs11 != null ? keteranganTambahanPengambilanKrs11.hashCode() : 0);
        result = 31 * result + (keteranganTambahanPengambilanKrs12 != null ? keteranganTambahanPengambilanKrs12.hashCode() : 0);
        result = 31 * result + (keteranganTambahanPengambilanKrs13 != null ? keteranganTambahanPengambilanKrs13.hashCode() : 0);
        result = 31 * result + (keteranganTambahanPengambilanKrs14 != null ? keteranganTambahanPengambilanKrs14.hashCode() : 0);
        result = 31 * result + (keteranganTambahanPengambilanKrs15 != null ? keteranganTambahanPengambilanKrs15.hashCode() : 0);
        result = 31 * result + (keteranganTambahanPengambilanKrs16 != null ? keteranganTambahanPengambilanKrs16.hashCode() : 0);
        result = 31 * result + (keteranganTambahanPengambilanKrs17 != null ? keteranganTambahanPengambilanKrs17.hashCode() : 0);
        result = 31 * result + (keteranganTambahanPengambilanKrs18 != null ? keteranganTambahanPengambilanKrs18.hashCode() : 0);
        result = 31 * result + (keteranganTambahanPengambilanKrs19 != null ? keteranganTambahanPengambilanKrs19.hashCode() : 0);
        result = 31 * result + (keteranganTambahanPengambilanKrs2 != null ? keteranganTambahanPengambilanKrs2.hashCode() : 0);
        result = 31 * result + (keteranganTambahanPengambilanKrs20 != null ? keteranganTambahanPengambilanKrs20.hashCode() : 0);
        result = 31 * result + (keteranganTambahanPengambilanKrs21 != null ? keteranganTambahanPengambilanKrs21.hashCode() : 0);
        result = 31 * result + (keteranganTambahanPengambilanKrs22 != null ? keteranganTambahanPengambilanKrs22.hashCode() : 0);
        result = 31 * result + (keteranganTambahanPengambilanKrs23 != null ? keteranganTambahanPengambilanKrs23.hashCode() : 0);
        result = 31 * result + (keteranganTambahanPengambilanKrs24 != null ? keteranganTambahanPengambilanKrs24.hashCode() : 0);
        result = 31 * result + (keteranganTambahanPengambilanKrs25 != null ? keteranganTambahanPengambilanKrs25.hashCode() : 0);
        result = 31 * result + (keteranganTambahanPengambilanKrs3 != null ? keteranganTambahanPengambilanKrs3.hashCode() : 0);
        result = 31 * result + (keteranganTambahanPengambilanKrs4 != null ? keteranganTambahanPengambilanKrs4.hashCode() : 0);
        result = 31 * result + (keteranganTambahanPengambilanKrs5 != null ? keteranganTambahanPengambilanKrs5.hashCode() : 0);
        result = 31 * result + (keteranganTambahanPengambilanKrs6 != null ? keteranganTambahanPengambilanKrs6.hashCode() : 0);
        result = 31 * result + (keteranganTambahanPengambilanKrs7 != null ? keteranganTambahanPengambilanKrs7.hashCode() : 0);
        result = 31 * result + (keteranganTambahanPengambilanKrs8 != null ? keteranganTambahanPengambilanKrs8.hashCode() : 0);
        result = 31 * result + (keteranganTambahanPengambilanKrs9 != null ? keteranganTambahanPengambilanKrs9.hashCode() : 0);
        result = 31 * result + (nama != null ? nama.hashCode() : 0);
        result = 31 * result + (nim != null ? nim.hashCode() : 0);
        result = 31 * result + (oleh != null ? oleh.hashCode() : 0);
        result = 31 * result + (pass != null ? pass.hashCode() : 0);
        result = 31 * result + (program != null ? program.hashCode() : 0);
        result = 31 * result + (semesterMulai != null ? semesterMulai.hashCode() : 0);
        result = 31 * result + (statusKonversi != null ? statusKonversi.hashCode() : 0);
        result = 31 * result + (tahunangkatan != null ? tahunangkatan.hashCode() : 0);
        result = 31 * result + (tanggalLulus != null ? tanggalLulus.hashCode() : 0);
        result = 31 * result + (tanggalDirubah != null ? tanggalDirubah.hashCode() : 0);
        result = 31 * result + (tanggallahir != null ? tanggallahir.hashCode() : 0);
        result = 31 * result + (telp != null ? telp.hashCode() : 0);
        result = 31 * result + (tempatlahir != null ? tempatlahir.hashCode() : 0);
        result = 31 * result + (tinggiBadan != null ? tinggiBadan.hashCode() : 0);
        result = 31 * result + (waktuKuliah != null ? waktuKuliah.hashCode() : 0);
        result = 31 * result + (warganegara != null ? warganegara.hashCode() : 0);
        result = 31 * result + (judulSkripsi != null ? judulSkripsi.hashCode() : 0);
        result = 31 * result + (noAkta1 != null ? noAkta1.hashCode() : 0);
        result = 31 * result + (noAkta2 != null ? noAkta2.hashCode() : 0);
        result = 31 * result + (noIjazah1 != null ? noIjazah1.hashCode() : 0);
        result = 31 * result + (noIjazah2 != null ? noIjazah2.hashCode() : 0);
        result = 31 * result + (tahunWisuda != null ? tahunWisuda.hashCode() : 0);
        result = 31 * result + (tanggalYudisium != null ? tanggalYudisium.hashCode() : 0);
        result = 31 * result + (passOrtu != null ? passOrtu.hashCode() : 0);
        result = 31 * result + (userOrtu != null ? userOrtu.hashCode() : 0);
        result = 31 * result + (warganegaraAsli != null ? warganegaraAsli.hashCode() : 0);
        result = 31 * result + (batasStudi != null ? batasStudi.hashCode() : 0);
        result = 31 * result + (jumlahSksPenyetaraan != null ? jumlahSksPenyetaraan.hashCode() : 0);
        result = 31 * result + (pindahanNim != null ? pindahanNim.hashCode() : 0);
        result = 31 * result + (pindahanPerguruanTinggi != null ? pindahanPerguruanTinggi.hashCode() : 0);
        result = 31 * result + (statusKrs != null ? statusKrs.hashCode() : 0);
        result = 31 * result + (tanggalMasuk != null ? tanggalMasuk.hashCode() : 0);
        result = 31 * result + (ktp != null ? ktp.hashCode() : 0);
        result = 31 * result + (semesterlulus != null ? semesterlulus.hashCode() : 0);
        result = 31 * result + (tahunlulus != null ? tahunlulus.hashCode() : 0);
        result = 31 * result + (pin != null ? pin.hashCode() : 0);
        result = 31 * result + (keteranganTambahanPengambilanKrs1000 != null ? keteranganTambahanPengambilanKrs1000.hashCode() : 0);
        result = 31 * result + (formatedtanggallahir != null ? formatedtanggallahir.hashCode() : 0);
        result = 31 * result + (currentsemester != null ? currentsemester.hashCode() : 0);
        result = 31 * result + (currenttahunakademik != null ? currenttahunakademik.hashCode() : 0);
        result = 31 * result + (imageurl != null ? imageurl.hashCode() : 0);
        result = 31 * result + (keteranganTambahanPengambilanKrs0 != null ? keteranganTambahanPengambilanKrs0.hashCode() : 0);
        result = 31 * result + (keteranganpindah != null ? keteranganpindah.hashCode() : 0);
        result = 31 * result + (keteranganpindahprodi != null ? keteranganpindahprodi.hashCode() : 0);
        result = 31 * result + (merupakanalihprodi != null ? merupakanalihprodi.hashCode() : 0);
        result = 31 * result + (merupakanpindahan != null ? merupakanpindahan.hashCode() : 0);
        result = 31 * result + (nimlamasebelumpindah != null ? nimlamasebelumpindah.hashCode() : 0);
        result = 31 * result + (pindahdarikampuslamadisemester != null ? pindahdarikampuslamadisemester.hashCode() : 0);
        result = 31 * result + (pindahkekampusinimasuksemester != null ? pindahkekampusinimasuksemester.hashCode() : 0);
        result = 31 * result + (pindahkeprodiinimasuksemester != null ? pindahkeprodiinimasuksemester.hashCode() : 0);
        result = 31 * result + (pindahandarikampus != null ? pindahandarikampus.hashCode() : 0);
        result = 31 * result + (tanggalpindah != null ? tanggalpindah.hashCode() : 0);
        result = 31 * result + (tanggalpindahprodi != null ? tanggalpindahprodi.hashCode() : 0);
        result = 31 * result + (biodataCalonMahasiswaLong != null ? biodataCalonMahasiswaLong.hashCode() : 0);
        result = 31 * result + (keteranganbeasiswa != null ? keteranganbeasiswa.hashCode() : 0);
        result = 31 * result + (blnakhirbimbingan != null ? blnakhirbimbingan.hashCode() : 0);
        result = 31 * result + (blnawalbimbingan != null ? blnawalbimbingan.hashCode() : 0);
        result = 31 * result + (feeder != null ? feeder.hashCode() : 0);
        result = 31 * result + (idregpd != null ? idregpd.hashCode() : 0);
        result = 31 * result + (aktif != null ? aktif.hashCode() : 0);
        result = 31 * result + (nimbarupindah != null ? nimbarupindah.hashCode() : 0);
        result = 31 * result + (kodeperguruantinggipindah != null ? kodeperguruantinggipindah.hashCode() : 0);
        result = 31 * result + (kodeprodipindah != null ? kodeprodipindah.hashCode() : 0);
        result = 31 * result + (sksyangdiakui != null ? sksyangdiakui.hashCode() : 0);
        result = 31 * result + (sksyangdiakuipindahprodi != null ? sksyangdiakuipindahprodi.hashCode() : 0);
        result = 31 * result + (namaprodipindah != null ? namaprodipindah.hashCode() : 0);
        result = 31 * result + (nimkey != null ? nimkey.hashCode() : 0);
        result = 31 * result + (anggotaperpustakaanid != null ? anggotaperpustakaanid.hashCode() : 0);
        result = 31 * result + (facebookid != null ? facebookid.hashCode() : 0);
        result = 31 * result + (googleid != null ? googleid.hashCode() : 0);
        result = 31 * result + (twitterid != null ? twitterid.hashCode() : 0);
        result = 31 * result + (linkedinid != null ? linkedinid.hashCode() : 0);
        result = 31 * result + (socialMediaProfile != null ? socialMediaProfile.hashCode() : 0);
        result = 31 * result + (olehid != null ? olehid.hashCode() : 0);
        return result;
    }
}
