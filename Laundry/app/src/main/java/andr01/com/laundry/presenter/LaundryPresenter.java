package andr01.com.laundry.presenter;

import org.json.JSONObject;

/**
 * Created by Dony.A.Nuransyah on 28/12/16.
 * Email : dony.nuransyah@gmail.com
 */


public interface LaundryPresenter {
    /*

     */
    public void antrian(JSONObject data);
    public void location(int cordinat);
    public void promo(boolean promo);
    public void generateqr();
}

