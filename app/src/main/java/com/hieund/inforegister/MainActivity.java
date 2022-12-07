package com.hieund.inforegister;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText firstName;
    private EditText lastName;
    private RadioGroup genGroup;
    private EditText birthday;
    private EditText address;
    private EditText email;
    private Button btn_reg;
    private CheckBox checkTerm;
    private TextView text1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstName = findViewById(R.id.firstName);
        lastName = findViewById(R.id.lastName);
        genGroup = findViewById(R.id.genGroup);
        birthday = findViewById(R.id.birthday);
        address = findViewById(R.id.address);
        email = findViewById(R.id.email);
        btn_reg = findViewById(R.id.btn_reg);
        checkTerm = findViewById(R.id.checkTerm);
        text1 = findViewById(R.id.text1);

        btn_reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String sfirstName = firstName.getText().toString();
                String slastName = lastName.getText().toString();
                int igenGroup = genGroup.getCheckedRadioButtonId();
                String sbirthday = birthday.getText().toString();
                String saddress = address.getText().toString();
                String semail = email.getText().toString();
                boolean icheckTerm = checkTerm.isChecked();

                text1.setText("");

                if (sfirstName.isEmpty() || slastName.isEmpty() || igenGroup == -1 ||
                        sbirthday.isEmpty() || saddress.isEmpty() || semail.isEmpty() || !icheckTerm) {
                    if (sfirstName.isEmpty()) {
                        text1.append("First Name ");
                    }
                    if (slastName.isEmpty()) {
                        text1.append("Last Name ");
                    }
                    if (igenGroup == -1) {
                        text1.append("Gender ");
                    }
                    if (sbirthday.isEmpty()) {
                        text1.append("Birthday ");
                    }
                    if (saddress.isEmpty()) {
                        text1.append("Address ");
                    }
                    if (semail.isEmpty()) {
                        text1.append("Email ");
                    }
                    if (!icheckTerm) {
                        text1.append("Terms ");
                    }
                    text1.append("is empty!");
                } else {
                    text1.setText("");
                    Toast.makeText(MainActivity.this, "Register Success!", Toast.LENGTH_SHORT).show();
                }
        }
    });
}
}