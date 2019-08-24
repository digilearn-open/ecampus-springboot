package com.hendyirawan.ecampusapi.core;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;

@Entity
@Table(name = "biodata_mahasiswa", schema = "public", catalog = "iainbukittinggi")
public class BiodataMahasiswa {
    private long id;
    private String alamat;
    private String alamatAsalSd;
    private String alamatAsalSma;
    private String alamatAsalSmp;
    private String asalSd;
    private String asalSma;
    private String asalSmp;
    private Integer beratBadan;
    private String golonganDarah;
    private String hobi;
    private String hp;
    private String kemampuanBahasa1;
    private String kemampuanBahasa2;
    private String kemampuanBahasa3;
    private String kendaraanKuliah;
    private String kewarganegaraan;
    private String minatSeni;
    private String namaAyah;
    private String namaIbu;
    private String namaOrganisasi;
    private String namaUntukIjazah;
    private String noIjazah;
    private String oleh;
    private String pekerjaanAyah;
    private String pekerjaanIbu;
    private Integer pernahMemimpinOrganisasi;
    private Integer pernahMenetapDiLuarNegeri;
    private Integer statusNikah;
    private String suratIzinMengemudi;
    private Timestamp tanggalDirubah;
    private String teleponRumah;
    private Integer tinggiBadan;
    private String ukuranJaket;
    private String penghasilanayah;
    private String penghasilanibu;
    private String kodeBiayaStudi;
    private String kodeKerjaan;
    private String kodeTempatKerjaPs;
    private String kodeTempatKerjaPt;
    private String nidnKopromotor1;
    private String nidnKopromotor2;
    private String nidnKopromotor3;
    private String nidnKopromotor4;
    private String nidnPromotor;
    private String tempatKerja;
    private Integer bersaudara;
    private String noRekBri;
    private Long penghasilanOrangTua;
    private String cabangBri;
    private String noKk;
    private String kecamatan;
    private String kelurahan;
    private String kodepos;
    private String rt;
    private String rw;
    private String dusun;
    private String noidentitas;
    private String email;
    private String namawali;
    private Date tanggallahirayah;
    private Date tanggallahiribu;
    private Date tanggallahirwali;
    private Boolean apakahpernahpaud;
    private Boolean apakahpernahtk;
    private String parametertambahan;
    private String parametertambahaninds;
    private String nikayah;
    private String nikibu;
    private String nisn;
    private String npwp;
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
    @Column(name = "alamat_asal_sd")
    public String getAlamatAsalSd() {
        return alamatAsalSd;
    }

    public void setAlamatAsalSd(String alamatAsalSd) {
        this.alamatAsalSd = alamatAsalSd;
    }

    @Basic
    @Column(name = "alamat_asal_sma")
    public String getAlamatAsalSma() {
        return alamatAsalSma;
    }

    public void setAlamatAsalSma(String alamatAsalSma) {
        this.alamatAsalSma = alamatAsalSma;
    }

    @Basic
    @Column(name = "alamat_asal_smp")
    public String getAlamatAsalSmp() {
        return alamatAsalSmp;
    }

    public void setAlamatAsalSmp(String alamatAsalSmp) {
        this.alamatAsalSmp = alamatAsalSmp;
    }

    @Basic
    @Column(name = "asal_sd")
    public String getAsalSd() {
        return asalSd;
    }

    public void setAsalSd(String asalSd) {
        this.asalSd = asalSd;
    }

    @Basic
    @Column(name = "asal_sma")
    public String getAsalSma() {
        return asalSma;
    }

    public void setAsalSma(String asalSma) {
        this.asalSma = asalSma;
    }

    @Basic
    @Column(name = "asal_smp")
    public String getAsalSmp() {
        return asalSmp;
    }

    public void setAsalSmp(String asalSmp) {
        this.asalSmp = asalSmp;
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
    @Column(name = "golongan_darah")
    public String getGolonganDarah() {
        return golonganDarah;
    }

    public void setGolonganDarah(String golonganDarah) {
        this.golonganDarah = golonganDarah;
    }

    @Basic
    @Column(name = "hobi")
    public String getHobi() {
        return hobi;
    }

    public void setHobi(String hobi) {
        this.hobi = hobi;
    }

    @Basic
    @Column(name = "hp")
    public String getHp() {
        return hp;
    }

    public void setHp(String hp) {
        this.hp = hp;
    }

    @Basic
    @Column(name = "kemampuan_bahasa1")
    public String getKemampuanBahasa1() {
        return kemampuanBahasa1;
    }

    public void setKemampuanBahasa1(String kemampuanBahasa1) {
        this.kemampuanBahasa1 = kemampuanBahasa1;
    }

    @Basic
    @Column(name = "kemampuan_bahasa2")
    public String getKemampuanBahasa2() {
        return kemampuanBahasa2;
    }

    public void setKemampuanBahasa2(String kemampuanBahasa2) {
        this.kemampuanBahasa2 = kemampuanBahasa2;
    }

    @Basic
    @Column(name = "kemampuan_bahasa3")
    public String getKemampuanBahasa3() {
        return kemampuanBahasa3;
    }

    public void setKemampuanBahasa3(String kemampuanBahasa3) {
        this.kemampuanBahasa3 = kemampuanBahasa3;
    }

    @Basic
    @Column(name = "kendaraan_kuliah")
    public String getKendaraanKuliah() {
        return kendaraanKuliah;
    }

    public void setKendaraanKuliah(String kendaraanKuliah) {
        this.kendaraanKuliah = kendaraanKuliah;
    }

    @Basic
    @Column(name = "kewarganegaraan")
    public String getKewarganegaraan() {
        return kewarganegaraan;
    }

    public void setKewarganegaraan(String kewarganegaraan) {
        this.kewarganegaraan = kewarganegaraan;
    }

    @Basic
    @Column(name = "minat_seni")
    public String getMinatSeni() {
        return minatSeni;
    }

    public void setMinatSeni(String minatSeni) {
        this.minatSeni = minatSeni;
    }

    @Basic
    @Column(name = "nama_ayah")
    public String getNamaAyah() {
        return namaAyah;
    }

    public void setNamaAyah(String namaAyah) {
        this.namaAyah = namaAyah;
    }

    @Basic
    @Column(name = "nama_ibu")
    public String getNamaIbu() {
        return namaIbu;
    }

    public void setNamaIbu(String namaIbu) {
        this.namaIbu = namaIbu;
    }

    @Basic
    @Column(name = "nama_organisasi")
    public String getNamaOrganisasi() {
        return namaOrganisasi;
    }

    public void setNamaOrganisasi(String namaOrganisasi) {
        this.namaOrganisasi = namaOrganisasi;
    }

    @Basic
    @Column(name = "nama_untuk_ijazah")
    public String getNamaUntukIjazah() {
        return namaUntukIjazah;
    }

    public void setNamaUntukIjazah(String namaUntukIjazah) {
        this.namaUntukIjazah = namaUntukIjazah;
    }

    @Basic
    @Column(name = "no_ijazah")
    public String getNoIjazah() {
        return noIjazah;
    }

    public void setNoIjazah(String noIjazah) {
        this.noIjazah = noIjazah;
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
    @Column(name = "pekerjaan_ayah")
    public String getPekerjaanAyah() {
        return pekerjaanAyah;
    }

    public void setPekerjaanAyah(String pekerjaanAyah) {
        this.pekerjaanAyah = pekerjaanAyah;
    }

    @Basic
    @Column(name = "pekerjaan_ibu")
    public String getPekerjaanIbu() {
        return pekerjaanIbu;
    }

    public void setPekerjaanIbu(String pekerjaanIbu) {
        this.pekerjaanIbu = pekerjaanIbu;
    }

    @Basic
    @Column(name = "pernah_memimpin_organisasi")
    public Integer getPernahMemimpinOrganisasi() {
        return pernahMemimpinOrganisasi;
    }

    public void setPernahMemimpinOrganisasi(Integer pernahMemimpinOrganisasi) {
        this.pernahMemimpinOrganisasi = pernahMemimpinOrganisasi;
    }

    @Basic
    @Column(name = "pernah_menetap_di_luar_negeri")
    public Integer getPernahMenetapDiLuarNegeri() {
        return pernahMenetapDiLuarNegeri;
    }

    public void setPernahMenetapDiLuarNegeri(Integer pernahMenetapDiLuarNegeri) {
        this.pernahMenetapDiLuarNegeri = pernahMenetapDiLuarNegeri;
    }

    @Basic
    @Column(name = "status_nikah")
    public Integer getStatusNikah() {
        return statusNikah;
    }

    public void setStatusNikah(Integer statusNikah) {
        this.statusNikah = statusNikah;
    }

    @Basic
    @Column(name = "surat_izin_mengemudi")
    public String getSuratIzinMengemudi() {
        return suratIzinMengemudi;
    }

    public void setSuratIzinMengemudi(String suratIzinMengemudi) {
        this.suratIzinMengemudi = suratIzinMengemudi;
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
    @Column(name = "telepon_rumah")
    public String getTeleponRumah() {
        return teleponRumah;
    }

    public void setTeleponRumah(String teleponRumah) {
        this.teleponRumah = teleponRumah;
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
    @Column(name = "ukuran_jaket")
    public String getUkuranJaket() {
        return ukuranJaket;
    }

    public void setUkuranJaket(String ukuranJaket) {
        this.ukuranJaket = ukuranJaket;
    }

    @Basic
    @Column(name = "penghasilanayah")
    public String getPenghasilanayah() {
        return penghasilanayah;
    }

    public void setPenghasilanayah(String penghasilanayah) {
        this.penghasilanayah = penghasilanayah;
    }

    @Basic
    @Column(name = "penghasilanibu")
    public String getPenghasilanibu() {
        return penghasilanibu;
    }

    public void setPenghasilanibu(String penghasilanibu) {
        this.penghasilanibu = penghasilanibu;
    }

    @Basic
    @Column(name = "kode_biaya_studi")
    public String getKodeBiayaStudi() {
        return kodeBiayaStudi;
    }

    public void setKodeBiayaStudi(String kodeBiayaStudi) {
        this.kodeBiayaStudi = kodeBiayaStudi;
    }

    @Basic
    @Column(name = "kode_kerjaan")
    public String getKodeKerjaan() {
        return kodeKerjaan;
    }

    public void setKodeKerjaan(String kodeKerjaan) {
        this.kodeKerjaan = kodeKerjaan;
    }

    @Basic
    @Column(name = "kode_tempat_kerja_ps")
    public String getKodeTempatKerjaPs() {
        return kodeTempatKerjaPs;
    }

    public void setKodeTempatKerjaPs(String kodeTempatKerjaPs) {
        this.kodeTempatKerjaPs = kodeTempatKerjaPs;
    }

    @Basic
    @Column(name = "kode_tempat_kerja_pt")
    public String getKodeTempatKerjaPt() {
        return kodeTempatKerjaPt;
    }

    public void setKodeTempatKerjaPt(String kodeTempatKerjaPt) {
        this.kodeTempatKerjaPt = kodeTempatKerjaPt;
    }

    @Basic
    @Column(name = "nidn_kopromotor1")
    public String getNidnKopromotor1() {
        return nidnKopromotor1;
    }

    public void setNidnKopromotor1(String nidnKopromotor1) {
        this.nidnKopromotor1 = nidnKopromotor1;
    }

    @Basic
    @Column(name = "nidn_kopromotor2")
    public String getNidnKopromotor2() {
        return nidnKopromotor2;
    }

    public void setNidnKopromotor2(String nidnKopromotor2) {
        this.nidnKopromotor2 = nidnKopromotor2;
    }

    @Basic
    @Column(name = "nidn_kopromotor3")
    public String getNidnKopromotor3() {
        return nidnKopromotor3;
    }

    public void setNidnKopromotor3(String nidnKopromotor3) {
        this.nidnKopromotor3 = nidnKopromotor3;
    }

    @Basic
    @Column(name = "nidn_kopromotor4")
    public String getNidnKopromotor4() {
        return nidnKopromotor4;
    }

    public void setNidnKopromotor4(String nidnKopromotor4) {
        this.nidnKopromotor4 = nidnKopromotor4;
    }

    @Basic
    @Column(name = "nidn_promotor")
    public String getNidnPromotor() {
        return nidnPromotor;
    }

    public void setNidnPromotor(String nidnPromotor) {
        this.nidnPromotor = nidnPromotor;
    }

    @Basic
    @Column(name = "tempat_kerja")
    public String getTempatKerja() {
        return tempatKerja;
    }

    public void setTempatKerja(String tempatKerja) {
        this.tempatKerja = tempatKerja;
    }

    @Basic
    @Column(name = "bersaudara")
    public Integer getBersaudara() {
        return bersaudara;
    }

    public void setBersaudara(Integer bersaudara) {
        this.bersaudara = bersaudara;
    }

    @Basic
    @Column(name = "no_rek_bri")
    public String getNoRekBri() {
        return noRekBri;
    }

    public void setNoRekBri(String noRekBri) {
        this.noRekBri = noRekBri;
    }

    @Basic
    @Column(name = "penghasilan_orang_tua")
    public Long getPenghasilanOrangTua() {
        return penghasilanOrangTua;
    }

    public void setPenghasilanOrangTua(Long penghasilanOrangTua) {
        this.penghasilanOrangTua = penghasilanOrangTua;
    }

    @Basic
    @Column(name = "cabang_bri")
    public String getCabangBri() {
        return cabangBri;
    }

    public void setCabangBri(String cabangBri) {
        this.cabangBri = cabangBri;
    }

    @Basic
    @Column(name = "no_kk")
    public String getNoKk() {
        return noKk;
    }

    public void setNoKk(String noKk) {
        this.noKk = noKk;
    }

    @Basic
    @Column(name = "kecamatan")
    public String getKecamatan() {
        return kecamatan;
    }

    public void setKecamatan(String kecamatan) {
        this.kecamatan = kecamatan;
    }

    @Basic
    @Column(name = "kelurahan")
    public String getKelurahan() {
        return kelurahan;
    }

    public void setKelurahan(String kelurahan) {
        this.kelurahan = kelurahan;
    }

    @Basic
    @Column(name = "kodepos")
    public String getKodepos() {
        return kodepos;
    }

    public void setKodepos(String kodepos) {
        this.kodepos = kodepos;
    }

    @Basic
    @Column(name = "rt")
    public String getRt() {
        return rt;
    }

    public void setRt(String rt) {
        this.rt = rt;
    }

    @Basic
    @Column(name = "rw")
    public String getRw() {
        return rw;
    }

    public void setRw(String rw) {
        this.rw = rw;
    }

    @Basic
    @Column(name = "dusun")
    public String getDusun() {
        return dusun;
    }

    public void setDusun(String dusun) {
        this.dusun = dusun;
    }

    @Basic
    @Column(name = "noidentitas")
    public String getNoidentitas() {
        return noidentitas;
    }

    public void setNoidentitas(String noidentitas) {
        this.noidentitas = noidentitas;
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
    @Column(name = "namawali")
    public String getNamawali() {
        return namawali;
    }

    public void setNamawali(String namawali) {
        this.namawali = namawali;
    }

    @Basic
    @Column(name = "tanggallahirayah")
    public Date getTanggallahirayah() {
        return tanggallahirayah;
    }

    public void setTanggallahirayah(Date tanggallahirayah) {
        this.tanggallahirayah = tanggallahirayah;
    }

    @Basic
    @Column(name = "tanggallahiribu")
    public Date getTanggallahiribu() {
        return tanggallahiribu;
    }

    public void setTanggallahiribu(Date tanggallahiribu) {
        this.tanggallahiribu = tanggallahiribu;
    }

    @Basic
    @Column(name = "tanggallahirwali")
    public Date getTanggallahirwali() {
        return tanggallahirwali;
    }

    public void setTanggallahirwali(Date tanggallahirwali) {
        this.tanggallahirwali = tanggallahirwali;
    }

    @Basic
    @Column(name = "apakahpernahpaud")
    public Boolean getApakahpernahpaud() {
        return apakahpernahpaud;
    }

    public void setApakahpernahpaud(Boolean apakahpernahpaud) {
        this.apakahpernahpaud = apakahpernahpaud;
    }

    @Basic
    @Column(name = "apakahpernahtk")
    public Boolean getApakahpernahtk() {
        return apakahpernahtk;
    }

    public void setApakahpernahtk(Boolean apakahpernahtk) {
        this.apakahpernahtk = apakahpernahtk;
    }

    @Basic
    @Column(name = "parametertambahan")
    public String getParametertambahan() {
        return parametertambahan;
    }

    public void setParametertambahan(String parametertambahan) {
        this.parametertambahan = parametertambahan;
    }

    @Basic
    @Column(name = "parametertambahaninds")
    public String getParametertambahaninds() {
        return parametertambahaninds;
    }

    public void setParametertambahaninds(String parametertambahaninds) {
        this.parametertambahaninds = parametertambahaninds;
    }

    @Basic
    @Column(name = "nikayah")
    public String getNikayah() {
        return nikayah;
    }

    public void setNikayah(String nikayah) {
        this.nikayah = nikayah;
    }

    @Basic
    @Column(name = "nikibu")
    public String getNikibu() {
        return nikibu;
    }

    public void setNikibu(String nikibu) {
        this.nikibu = nikibu;
    }

    @Basic
    @Column(name = "nisn")
    public String getNisn() {
        return nisn;
    }

    public void setNisn(String nisn) {
        this.nisn = nisn;
    }

    @Basic
    @Column(name = "npwp")
    public String getNpwp() {
        return npwp;
    }

    public void setNpwp(String npwp) {
        this.npwp = npwp;
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

        BiodataMahasiswa that = (BiodataMahasiswa) o;

        if (id != that.id) return false;
        if (alamat != null ? !alamat.equals(that.alamat) : that.alamat != null) return false;
        if (alamatAsalSd != null ? !alamatAsalSd.equals(that.alamatAsalSd) : that.alamatAsalSd != null) return false;
        if (alamatAsalSma != null ? !alamatAsalSma.equals(that.alamatAsalSma) : that.alamatAsalSma != null)
            return false;
        if (alamatAsalSmp != null ? !alamatAsalSmp.equals(that.alamatAsalSmp) : that.alamatAsalSmp != null)
            return false;
        if (asalSd != null ? !asalSd.equals(that.asalSd) : that.asalSd != null) return false;
        if (asalSma != null ? !asalSma.equals(that.asalSma) : that.asalSma != null) return false;
        if (asalSmp != null ? !asalSmp.equals(that.asalSmp) : that.asalSmp != null) return false;
        if (beratBadan != null ? !beratBadan.equals(that.beratBadan) : that.beratBadan != null) return false;
        if (golonganDarah != null ? !golonganDarah.equals(that.golonganDarah) : that.golonganDarah != null)
            return false;
        if (hobi != null ? !hobi.equals(that.hobi) : that.hobi != null) return false;
        if (hp != null ? !hp.equals(that.hp) : that.hp != null) return false;
        if (kemampuanBahasa1 != null ? !kemampuanBahasa1.equals(that.kemampuanBahasa1) : that.kemampuanBahasa1 != null)
            return false;
        if (kemampuanBahasa2 != null ? !kemampuanBahasa2.equals(that.kemampuanBahasa2) : that.kemampuanBahasa2 != null)
            return false;
        if (kemampuanBahasa3 != null ? !kemampuanBahasa3.equals(that.kemampuanBahasa3) : that.kemampuanBahasa3 != null)
            return false;
        if (kendaraanKuliah != null ? !kendaraanKuliah.equals(that.kendaraanKuliah) : that.kendaraanKuliah != null)
            return false;
        if (kewarganegaraan != null ? !kewarganegaraan.equals(that.kewarganegaraan) : that.kewarganegaraan != null)
            return false;
        if (minatSeni != null ? !minatSeni.equals(that.minatSeni) : that.minatSeni != null) return false;
        if (namaAyah != null ? !namaAyah.equals(that.namaAyah) : that.namaAyah != null) return false;
        if (namaIbu != null ? !namaIbu.equals(that.namaIbu) : that.namaIbu != null) return false;
        if (namaOrganisasi != null ? !namaOrganisasi.equals(that.namaOrganisasi) : that.namaOrganisasi != null)
            return false;
        if (namaUntukIjazah != null ? !namaUntukIjazah.equals(that.namaUntukIjazah) : that.namaUntukIjazah != null)
            return false;
        if (noIjazah != null ? !noIjazah.equals(that.noIjazah) : that.noIjazah != null) return false;
        if (oleh != null ? !oleh.equals(that.oleh) : that.oleh != null) return false;
        if (pekerjaanAyah != null ? !pekerjaanAyah.equals(that.pekerjaanAyah) : that.pekerjaanAyah != null)
            return false;
        if (pekerjaanIbu != null ? !pekerjaanIbu.equals(that.pekerjaanIbu) : that.pekerjaanIbu != null) return false;
        if (pernahMemimpinOrganisasi != null ? !pernahMemimpinOrganisasi.equals(that.pernahMemimpinOrganisasi) : that.pernahMemimpinOrganisasi != null)
            return false;
        if (pernahMenetapDiLuarNegeri != null ? !pernahMenetapDiLuarNegeri.equals(that.pernahMenetapDiLuarNegeri) : that.pernahMenetapDiLuarNegeri != null)
            return false;
        if (statusNikah != null ? !statusNikah.equals(that.statusNikah) : that.statusNikah != null) return false;
        if (suratIzinMengemudi != null ? !suratIzinMengemudi.equals(that.suratIzinMengemudi) : that.suratIzinMengemudi != null)
            return false;
        if (tanggalDirubah != null ? !tanggalDirubah.equals(that.tanggalDirubah) : that.tanggalDirubah != null)
            return false;
        if (teleponRumah != null ? !teleponRumah.equals(that.teleponRumah) : that.teleponRumah != null) return false;
        if (tinggiBadan != null ? !tinggiBadan.equals(that.tinggiBadan) : that.tinggiBadan != null) return false;
        if (ukuranJaket != null ? !ukuranJaket.equals(that.ukuranJaket) : that.ukuranJaket != null) return false;
        if (penghasilanayah != null ? !penghasilanayah.equals(that.penghasilanayah) : that.penghasilanayah != null)
            return false;
        if (penghasilanibu != null ? !penghasilanibu.equals(that.penghasilanibu) : that.penghasilanibu != null)
            return false;
        if (kodeBiayaStudi != null ? !kodeBiayaStudi.equals(that.kodeBiayaStudi) : that.kodeBiayaStudi != null)
            return false;
        if (kodeKerjaan != null ? !kodeKerjaan.equals(that.kodeKerjaan) : that.kodeKerjaan != null) return false;
        if (kodeTempatKerjaPs != null ? !kodeTempatKerjaPs.equals(that.kodeTempatKerjaPs) : that.kodeTempatKerjaPs != null)
            return false;
        if (kodeTempatKerjaPt != null ? !kodeTempatKerjaPt.equals(that.kodeTempatKerjaPt) : that.kodeTempatKerjaPt != null)
            return false;
        if (nidnKopromotor1 != null ? !nidnKopromotor1.equals(that.nidnKopromotor1) : that.nidnKopromotor1 != null)
            return false;
        if (nidnKopromotor2 != null ? !nidnKopromotor2.equals(that.nidnKopromotor2) : that.nidnKopromotor2 != null)
            return false;
        if (nidnKopromotor3 != null ? !nidnKopromotor3.equals(that.nidnKopromotor3) : that.nidnKopromotor3 != null)
            return false;
        if (nidnKopromotor4 != null ? !nidnKopromotor4.equals(that.nidnKopromotor4) : that.nidnKopromotor4 != null)
            return false;
        if (nidnPromotor != null ? !nidnPromotor.equals(that.nidnPromotor) : that.nidnPromotor != null) return false;
        if (tempatKerja != null ? !tempatKerja.equals(that.tempatKerja) : that.tempatKerja != null) return false;
        if (bersaudara != null ? !bersaudara.equals(that.bersaudara) : that.bersaudara != null) return false;
        if (noRekBri != null ? !noRekBri.equals(that.noRekBri) : that.noRekBri != null) return false;
        if (penghasilanOrangTua != null ? !penghasilanOrangTua.equals(that.penghasilanOrangTua) : that.penghasilanOrangTua != null)
            return false;
        if (cabangBri != null ? !cabangBri.equals(that.cabangBri) : that.cabangBri != null) return false;
        if (noKk != null ? !noKk.equals(that.noKk) : that.noKk != null) return false;
        if (kecamatan != null ? !kecamatan.equals(that.kecamatan) : that.kecamatan != null) return false;
        if (kelurahan != null ? !kelurahan.equals(that.kelurahan) : that.kelurahan != null) return false;
        if (kodepos != null ? !kodepos.equals(that.kodepos) : that.kodepos != null) return false;
        if (rt != null ? !rt.equals(that.rt) : that.rt != null) return false;
        if (rw != null ? !rw.equals(that.rw) : that.rw != null) return false;
        if (dusun != null ? !dusun.equals(that.dusun) : that.dusun != null) return false;
        if (noidentitas != null ? !noidentitas.equals(that.noidentitas) : that.noidentitas != null) return false;
        if (email != null ? !email.equals(that.email) : that.email != null) return false;
        if (namawali != null ? !namawali.equals(that.namawali) : that.namawali != null) return false;
        if (tanggallahirayah != null ? !tanggallahirayah.equals(that.tanggallahirayah) : that.tanggallahirayah != null)
            return false;
        if (tanggallahiribu != null ? !tanggallahiribu.equals(that.tanggallahiribu) : that.tanggallahiribu != null)
            return false;
        if (tanggallahirwali != null ? !tanggallahirwali.equals(that.tanggallahirwali) : that.tanggallahirwali != null)
            return false;
        if (apakahpernahpaud != null ? !apakahpernahpaud.equals(that.apakahpernahpaud) : that.apakahpernahpaud != null)
            return false;
        if (apakahpernahtk != null ? !apakahpernahtk.equals(that.apakahpernahtk) : that.apakahpernahtk != null)
            return false;
        if (parametertambahan != null ? !parametertambahan.equals(that.parametertambahan) : that.parametertambahan != null)
            return false;
        if (parametertambahaninds != null ? !parametertambahaninds.equals(that.parametertambahaninds) : that.parametertambahaninds != null)
            return false;
        if (nikayah != null ? !nikayah.equals(that.nikayah) : that.nikayah != null) return false;
        if (nikibu != null ? !nikibu.equals(that.nikibu) : that.nikibu != null) return false;
        if (nisn != null ? !nisn.equals(that.nisn) : that.nisn != null) return false;
        if (npwp != null ? !npwp.equals(that.npwp) : that.npwp != null) return false;
        if (olehid != null ? !olehid.equals(that.olehid) : that.olehid != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (alamat != null ? alamat.hashCode() : 0);
        result = 31 * result + (alamatAsalSd != null ? alamatAsalSd.hashCode() : 0);
        result = 31 * result + (alamatAsalSma != null ? alamatAsalSma.hashCode() : 0);
        result = 31 * result + (alamatAsalSmp != null ? alamatAsalSmp.hashCode() : 0);
        result = 31 * result + (asalSd != null ? asalSd.hashCode() : 0);
        result = 31 * result + (asalSma != null ? asalSma.hashCode() : 0);
        result = 31 * result + (asalSmp != null ? asalSmp.hashCode() : 0);
        result = 31 * result + (beratBadan != null ? beratBadan.hashCode() : 0);
        result = 31 * result + (golonganDarah != null ? golonganDarah.hashCode() : 0);
        result = 31 * result + (hobi != null ? hobi.hashCode() : 0);
        result = 31 * result + (hp != null ? hp.hashCode() : 0);
        result = 31 * result + (kemampuanBahasa1 != null ? kemampuanBahasa1.hashCode() : 0);
        result = 31 * result + (kemampuanBahasa2 != null ? kemampuanBahasa2.hashCode() : 0);
        result = 31 * result + (kemampuanBahasa3 != null ? kemampuanBahasa3.hashCode() : 0);
        result = 31 * result + (kendaraanKuliah != null ? kendaraanKuliah.hashCode() : 0);
        result = 31 * result + (kewarganegaraan != null ? kewarganegaraan.hashCode() : 0);
        result = 31 * result + (minatSeni != null ? minatSeni.hashCode() : 0);
        result = 31 * result + (namaAyah != null ? namaAyah.hashCode() : 0);
        result = 31 * result + (namaIbu != null ? namaIbu.hashCode() : 0);
        result = 31 * result + (namaOrganisasi != null ? namaOrganisasi.hashCode() : 0);
        result = 31 * result + (namaUntukIjazah != null ? namaUntukIjazah.hashCode() : 0);
        result = 31 * result + (noIjazah != null ? noIjazah.hashCode() : 0);
        result = 31 * result + (oleh != null ? oleh.hashCode() : 0);
        result = 31 * result + (pekerjaanAyah != null ? pekerjaanAyah.hashCode() : 0);
        result = 31 * result + (pekerjaanIbu != null ? pekerjaanIbu.hashCode() : 0);
        result = 31 * result + (pernahMemimpinOrganisasi != null ? pernahMemimpinOrganisasi.hashCode() : 0);
        result = 31 * result + (pernahMenetapDiLuarNegeri != null ? pernahMenetapDiLuarNegeri.hashCode() : 0);
        result = 31 * result + (statusNikah != null ? statusNikah.hashCode() : 0);
        result = 31 * result + (suratIzinMengemudi != null ? suratIzinMengemudi.hashCode() : 0);
        result = 31 * result + (tanggalDirubah != null ? tanggalDirubah.hashCode() : 0);
        result = 31 * result + (teleponRumah != null ? teleponRumah.hashCode() : 0);
        result = 31 * result + (tinggiBadan != null ? tinggiBadan.hashCode() : 0);
        result = 31 * result + (ukuranJaket != null ? ukuranJaket.hashCode() : 0);
        result = 31 * result + (penghasilanayah != null ? penghasilanayah.hashCode() : 0);
        result = 31 * result + (penghasilanibu != null ? penghasilanibu.hashCode() : 0);
        result = 31 * result + (kodeBiayaStudi != null ? kodeBiayaStudi.hashCode() : 0);
        result = 31 * result + (kodeKerjaan != null ? kodeKerjaan.hashCode() : 0);
        result = 31 * result + (kodeTempatKerjaPs != null ? kodeTempatKerjaPs.hashCode() : 0);
        result = 31 * result + (kodeTempatKerjaPt != null ? kodeTempatKerjaPt.hashCode() : 0);
        result = 31 * result + (nidnKopromotor1 != null ? nidnKopromotor1.hashCode() : 0);
        result = 31 * result + (nidnKopromotor2 != null ? nidnKopromotor2.hashCode() : 0);
        result = 31 * result + (nidnKopromotor3 != null ? nidnKopromotor3.hashCode() : 0);
        result = 31 * result + (nidnKopromotor4 != null ? nidnKopromotor4.hashCode() : 0);
        result = 31 * result + (nidnPromotor != null ? nidnPromotor.hashCode() : 0);
        result = 31 * result + (tempatKerja != null ? tempatKerja.hashCode() : 0);
        result = 31 * result + (bersaudara != null ? bersaudara.hashCode() : 0);
        result = 31 * result + (noRekBri != null ? noRekBri.hashCode() : 0);
        result = 31 * result + (penghasilanOrangTua != null ? penghasilanOrangTua.hashCode() : 0);
        result = 31 * result + (cabangBri != null ? cabangBri.hashCode() : 0);
        result = 31 * result + (noKk != null ? noKk.hashCode() : 0);
        result = 31 * result + (kecamatan != null ? kecamatan.hashCode() : 0);
        result = 31 * result + (kelurahan != null ? kelurahan.hashCode() : 0);
        result = 31 * result + (kodepos != null ? kodepos.hashCode() : 0);
        result = 31 * result + (rt != null ? rt.hashCode() : 0);
        result = 31 * result + (rw != null ? rw.hashCode() : 0);
        result = 31 * result + (dusun != null ? dusun.hashCode() : 0);
        result = 31 * result + (noidentitas != null ? noidentitas.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (namawali != null ? namawali.hashCode() : 0);
        result = 31 * result + (tanggallahirayah != null ? tanggallahirayah.hashCode() : 0);
        result = 31 * result + (tanggallahiribu != null ? tanggallahiribu.hashCode() : 0);
        result = 31 * result + (tanggallahirwali != null ? tanggallahirwali.hashCode() : 0);
        result = 31 * result + (apakahpernahpaud != null ? apakahpernahpaud.hashCode() : 0);
        result = 31 * result + (apakahpernahtk != null ? apakahpernahtk.hashCode() : 0);
        result = 31 * result + (parametertambahan != null ? parametertambahan.hashCode() : 0);
        result = 31 * result + (parametertambahaninds != null ? parametertambahaninds.hashCode() : 0);
        result = 31 * result + (nikayah != null ? nikayah.hashCode() : 0);
        result = 31 * result + (nikibu != null ? nikibu.hashCode() : 0);
        result = 31 * result + (nisn != null ? nisn.hashCode() : 0);
        result = 31 * result + (npwp != null ? npwp.hashCode() : 0);
        result = 31 * result + (olehid != null ? olehid.hashCode() : 0);
        return result;
    }
}
