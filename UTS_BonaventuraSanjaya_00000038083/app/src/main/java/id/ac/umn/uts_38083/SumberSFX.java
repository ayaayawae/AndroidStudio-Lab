package id.ac.umn.uts_38083;

import java.io.Serializable;

public class SumberSFX implements Serializable {
    private String judul, keterangan, soundURI;

    public SumberSFX(String judul, String keterangan, String soundURI) {
        this.judul = judul;
        this.keterangan = keterangan;
        this.soundURI = soundURI;
    }

    public String getJudul() {
        return judul;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public String getSoundURI() {
        return soundURI;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }

    public void setSoundURI(String soundURI) {
        this.soundURI = soundURI;
    }
}
