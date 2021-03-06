package hashcode.thefob.login;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import net.sqlcipher.database.SQLiteDatabase;
import net.sqlcipher.database.SQLiteException;

import hashcode.thefob.dataRepository.SQLiteDatabaseHelper;

import hashcode.thefob.R;

/**
 * A login screen that offers login via password.
 */
public class LoginActivity extends AppCompatActivity
{


    private android.R.attr R;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        SQLiteDatabase.loadLibs(this);
        try
        {
            SQLiteDatabase db = connectDataBase("");
            setContentView(R.layout.register_layout);
            db.close();
        }
        catch(SQLiteException e)
        {
            setContentView(R.layout.login_without_finger);
        }


    }

    public SQLiteDatabase connectDataBase(String password)
    {
        return SQLiteDatabaseHelper.getInstance(this).getWritableDatabase(password);

    }

    public void openSignupForm(View view)
    {
        Intent intent = new Intent(this,SignUpActivity.class);
        startActivity(intent);
    }
}

