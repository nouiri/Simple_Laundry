package andr01.com.laundry.presenter;

import org.json.JSONObject;

import andr01.com.laundry.view.LaundryView;

/**
 * Created by Dony.A.Nuransyah on 29/12/16.
 * Email : dony.nuransyah@gmail.com
 */


public class LaundryPresenterImp implements LaundryPresenter {
  LaundryView view;

    public LaundryPresenterImp(LaundryView view) {
        this.view = view;
    }

    @Override
    public void antrian(JSONObject data) {

    }

    @Override
    public void location(int cordinat) {

    }

    @Override
    public void promo(boolean promo) {

    }

    @Override
    public void generateqr() {

    }
}
