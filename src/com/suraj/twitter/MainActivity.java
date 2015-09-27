package com.suraj.twitter;



import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity implements OnClickListener{
	EditText userName,password;
	Button login;
	String u="suraj";
	String p="prasad";
	String inputUser;
	String inputPass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        userName =(EditText)findViewById(R.id.editTextUser);
        password=(EditText) findViewById(R.id.editTextPass);
        
        login=(Button) findViewById(R.id.buttonLogin);
        login.setOnClickListener((OnClickListener) this);}
   
@Override
public void onClick(View arg0) {
	inputUser=userName.getText().toString();
	inputPass=password.getText().toString();
	
	if(u.equalsIgnoreCase(inputUser)&&p.equalsIgnoreCase(inputPass)){
		Toast.makeText(this, "login pass", Toast.LENGTH_SHORT).show();
	}
	else{Toast.makeText(this, "login failed", Toast.LENGTH_SHORT).show();}
	
}


}
