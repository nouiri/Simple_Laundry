package andr01.com.laundry.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Created by dony on 19/12/16.
 */

public class orang implements Serializable {
    @SerializedName("nama")String nama;
    @SerializedName("status")String status;
}
