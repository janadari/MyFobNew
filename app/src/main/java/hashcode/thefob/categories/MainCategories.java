package hashcode.thefob.categories;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import hashcode.thefob.R;

public class MainCategories extends AppCompatActivity {

    ListView list;
    String[] itemname = {
            "Social", "Email", "Shopping Cart", "Cloud"
    };

    Integer[] imgid = {
            R.drawable.facebook, R.drawable.email, R.drawable.cart, R.drawable.cloud
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_categories);
        CustomListAdapter adapter = new CustomListAdapter(this, itemname, imgid);
        list = (ListView) findViewById(R.id.list);
        list.setAdapter(adapter);

        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> listView, View v, int position, long id) {
                if (position == 0) {
                    Intent intent = new Intent(MainCategories.this, Category1.class);
                    startActivity(intent);

                }
                if (position == 1) {
                    Intent intent = new Intent(MainCategories.this,Category2 .class);
                    startActivity(intent);

                }
                if (position == 2) {
                    Intent intent = new Intent(MainCategories.this, Category3.class);
                    startActivity(intent);

                }
                if (position == 3) {
                    Intent intent = new Intent(MainCategories.this,  Category4.class);
                    startActivity(intent);

                }
            }

        };
        ListView list = (ListView) findViewById(R.id.list);
        list.setOnItemClickListener(itemClickListener);
    }

    public boolean onCreateOptionMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.option_menu, menu);
        return super.onCreateOptionsMenu(menu);

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.option_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


}


