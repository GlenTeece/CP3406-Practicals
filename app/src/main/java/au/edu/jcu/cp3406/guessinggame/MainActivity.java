package au.edu.jcu.cp3406.guessinggame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.view.View;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    Game game = new Game();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void checkGuess(View view){
        TextView inputNumber = findViewById(R.id.editText);
        String str = inputNumber.getText().toString();
        int inputGuess = Integer.parseInt(str);

        if (game.check(inputGuess)){
            Toast.makeText(getApplicationContext(),"You Guest Correctly",Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(getApplicationContext(),"You Guest Incorrectly",Toast.LENGTH_SHORT).show();
        }
    }
}
