package andr01.com.laundry.spreference;

import android.app.Application;
import android.content.Context;

/**
 * Created by Dony.A.Nuransyah on 23/12/16.
 * Email : dony.nuransyah@gmail.com
 */


public class App extends Application {

    private static Context context;

    @Override public void onCreate() {
        super.onCreate();
        context = getApplicationContext();
    }

    public static synchronized Context getContext() {
        return context;
    }

}