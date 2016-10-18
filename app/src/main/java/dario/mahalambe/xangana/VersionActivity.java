package dario.mahalambe.xangana;


import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.webkit.WebView;
import android.widget.LinearLayout;
import android.widget.TextView;


public class VersionActivity extends AppCompatActivity {
    private LinearLayout linearLayout;
    private TextView tv_versao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_version);

        tv_versao = (TextView) findViewById(R.id.tv_versao);
        String versionName = BuildConfig.VERSION_NAME;

        tv_versao.setText("Versão" + " "+versionName);
        linearLayout = (LinearLayout) findViewById(R.id.layout_version);
        Drawable dr = new BitmapDrawable(getResources(),decodeSampledBitmapFromResource(getResources(),R.drawable.backgroundsobre,320,320));
        linearLayout.setBackground( dr);
    }


    public static Bitmap decodeSampledBitmapFromResource(Resources res, int resId, int reqWidth, int reqHeight) {

        // First decode with inJustDecodeBounds=true to check dimensions
        final BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeResource(res, resId, options);

        // Calculate inSampleSize
        options.inSampleSize = calculateInSampleSize(options, reqWidth, reqHeight);

        // Decode bitmap with inSampleSize set
        options.inJustDecodeBounds = false;
        return BitmapFactory.decodeResource(res, resId, options);
    }

    public static int calculateInSampleSize(  BitmapFactory.Options options, int reqWidth, int reqHeight) {
        // Raw height and width of image
        final int height = options.outHeight;
        final int width = options.outWidth;
        int inSampleSize = 1;

        if (height > reqHeight || width > reqWidth) {

            final int halfHeight = height / 2;
            final int halfWidth = width / 2;

            // Calculate the largest inSampleSize value that is a power of 2 and keeps both
            // height and width larger than the requested height and width.
            while ((halfHeight / inSampleSize) >= reqHeight
                    && (halfWidth / inSampleSize) >= reqWidth) {
                inSampleSize *= 2;
            }
        }

        return inSampleSize;
    }

    public void onLincenca(View view) {


        WebView content = (WebView) LayoutInflater.from(this).inflate(R.layout.layout_web_licenca, null);
        content.loadUrl("https://api.backendless.com/FEE14788-7CB6-42BA-FF98-E8B3F9600D00/v1/files/web/licenca.html");
        AlertDialog.Builder builder =
                new AlertDialog.Builder(this, R.style.Theme_AppCompat_Light_Dialog_Alert);
                builder.setTitle(getString(R.string.open_licences));
                builder.setView(content);

        builder.setPositiveButton(getString(R.string.dialog_fechar), null);
                builder.show();

    }
}
