package hjs.zhi.com.swichbutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import hjs.zhi.com.swichbutton.widght.PopupButton;
import hjs.zhi.com.swichbutton.widght.PopupCircleView;

public class MainActivity extends AppCompatActivity {
    PopupCircleView ppView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ppView = findViewById(R.id.pcv);

        ppView.setmOnMenuEventListener(new PopupCircleView.OnMenuEventListener() {
            @Override
            public void onMenuToggle(PopupButton popupButton) {

                switch (popupButton.getId()) {
                    case R.id.pb_favorite:
                        if (popupButton.isChecked()) {
                            Toast.makeText(MainActivity.this, "收藏", Toast.LENGTH_SHORT).show();
                        } else {
                            Toast.makeText(MainActivity.this, "取消收藏", Toast.LENGTH_SHORT).show();
                        }
                        break;
                    case R.id.pb_like:
                        if (popupButton.isChecked()) {
                            Toast.makeText(MainActivity.this, "赞", Toast.LENGTH_SHORT).show();
                        } else {
                            Toast.makeText(MainActivity.this, "取消赞", Toast.LENGTH_SHORT).show();
                        }
                        break;
                    case R.id.pb_share:
                        Toast.makeText(MainActivity.this, "分享", Toast.LENGTH_SHORT).show();
                        break;
                }
            }
        });
    }
}
