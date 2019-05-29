package eyana.uic.edu.ph.sns;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class codelogin extends Activity implements View.OnClickListener {

    Button login3;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.codelogin);

        login3 = findViewById(R.id.btn_login3);
        login3.setOnClickListener(this);
    }

    @Override
    public void onClick(View arg0) {

        // Start NewActivity.class
        Intent myIntent = new Intent(this, loginconfirm.class);
        startActivity(myIntent);
    }




}
