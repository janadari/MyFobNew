package hashcode.thefob.categories;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import hashcode.thefob.R;

/**
 * Created by shehani on 9/13/2018.
 */

public class CustomListAdapter extends ArrayAdapter<String> {

private final Activity context;
private final String[] itemname;
private final Integer[] imgid;
public CustomListAdapter(Activity context, String[] itemname, Integer[] imgid){
        super(context, R.layout.mylist,itemname);
        this.context=context;
        this.itemname=itemname;
        this.imgid=imgid;
        }
public View getView(int position, View view, ViewGroup parent){
        LayoutInflater inflater= context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.mylist,null,true);

        TextView txtTitle=(TextView)rowView.findViewById(R.id.item);
        ImageView imageView=(ImageView)rowView.findViewById(R.id.icon);


        txtTitle.setText(itemname[position]);
        imageView.setImageResource(imgid[position]);

        return rowView;
        };
        }

