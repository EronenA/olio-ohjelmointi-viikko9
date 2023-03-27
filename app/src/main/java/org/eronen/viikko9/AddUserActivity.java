package org.eronen.viikko9;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;

public class AddUserActivity extends AppCompatActivity {

    private EditText textFirstName;
    private EditText textLastName;
    private EditText textEmail;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_user);

        textFirstName = findViewById(R.id.editTextFirstName);
        textLastName = findViewById(R.id.editTextLastName);
        textEmail = findViewById(R.id.editTextEmail);

    }

    public void addUser(View view) {

        RadioGroup rgDegreeProgram = findViewById(R.id.rgDegreeProgram);

        switch (rgDegreeProgram.getCheckedRadioButtonId()) {
            case R.id.rbTietotekniikka:
                UserStorage.getInstance().addUser(new User(textFirstName.getText().toString(), textLastName.getText().toString(), textEmail.getText().toString(), "Tietotekniikka"));
                break;
            case R.id.rbTuotantotalous:
                UserStorage.getInstance().addUser(new User(textFirstName.getText().toString(), textLastName.getText().toString(), textEmail.getText().toString(), "Tuotantotalous"));
                break;
            case R.id.rbLaskennallinen:
                UserStorage.getInstance().addUser(new User(textFirstName.getText().toString(), textLastName.getText().toString(), textEmail.getText().toString(), "Laskennallinen tekniikka"));
                break;
            case R.id.rbSähkötekniikka:
                UserStorage.getInstance().addUser(new User(textFirstName.getText().toString(), textLastName.getText().toString(), textEmail.getText().toString(), "Sähkötekniikka"));
                break;
        }

    }

}