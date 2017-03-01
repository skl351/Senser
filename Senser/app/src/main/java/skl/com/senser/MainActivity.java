package skl.com.senser;

import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.List;

//查看手机自带的传感器
public class MainActivity extends AppCompatActivity {
    private TextView android_sensor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        android_sensor= (TextView) findViewById(R.id.android_sensor);
        SensorManager sensorManager= (SensorManager) getSystemService(SENSOR_SERVICE);
        List<Sensor> sensors=sensorManager.getSensorList(Sensor.TYPE_ALL);
        for (Sensor sensor:sensors){
            android_sensor.append(sensor.getName()+"\n");
        }
    }
}
