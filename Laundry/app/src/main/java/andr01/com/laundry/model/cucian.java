package andr01.com.laundry.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.sql.Date;

/**
 * Created by dony on 19/12/16.
 */

public class cucian implements Serializable {
    @SerializedName("Berat") int berat;
    @SerializedName("Jumlah") float total;
    @SerializedName("Tanggal") Date tanggal;
}
