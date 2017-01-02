package andr01.com.laundry.presenter;

import android.content.Context;

/**
 * Created by Dony.A.Nuransyah on 29/12/16.
 * Email : dony.nuransyah@gmail.com
 */


public interface LoginPresenter {
    public void login(String username,String password);
    public boolean haslogin(Class to);
    public void forgetpass(Context c);
}
