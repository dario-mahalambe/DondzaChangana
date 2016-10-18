package googleAnalytics;

import android.app.Application;
import com.google.android.gms.analytics.GoogleAnalytics;
import com.google.android.gms.analytics.Tracker;
import com.google.android.gms.analytics.Logger.LogLevel;
import dario.mahalambe.xangana.R;

/**
 * Created by user on 7/30/2016.
 */

public class AnalyticsApplication extends Application {


    public Tracker mTracker;


  public void startTracking(){


      if (mTracker==null){
          GoogleAnalytics ga = GoogleAnalytics.getInstance(this);

          mTracker= ga.newTracker(R.xml.track_app);


          ga.enableAutoActivityReports(this);



          GoogleAnalytics.getInstance(this).getLogger().setLogLevel(LogLevel.VERBOSE);
      }

  }



}