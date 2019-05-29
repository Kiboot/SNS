package eyana.uic.edu.ph.sns;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button login1,login2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        login1 = findViewById(R.id.btn_login);
        login2 = findViewById(R.id.btn_login2);

        login1.setOnClickListener(this);
        login2.setOnClickListener(this);
    }

    @Override
    public void onClick(View arg0){

        switch (arg0.getId()) {
            case R.id.btn_login:
                Intent myIntent = new Intent(this, loginconfirm.class);
                startActivity(myIntent);
                break;
            case R.id.btn_login2:
                Intent myIntent2 = new Intent(this, codelogin.class);
                startActivity(myIntent2);
                break;
        }
    }
}
