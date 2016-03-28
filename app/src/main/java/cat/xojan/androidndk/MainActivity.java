package cat.xojan.androidndk;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private native Car getCarFromJNI();

    static {
        System.loadLibrary("app");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Car car = getCarFromJNI();

        if (car != null) {
            ((TextView) findViewById(R.id.card_brand)).setText(car.getBrand());
            ((TextView) findViewById(R.id.num_doors)).setText(String.valueOf(car.getNumDoors()));
        }
    }
}
