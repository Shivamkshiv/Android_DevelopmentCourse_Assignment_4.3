package mr_auspicious.shivam_kr_shiv.com.adapters3;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;

import java.util.List;

/**
 * Created by shivam on 22-01-2017.
 */
public class ImageAdapter extends ArrayAdapter<Image> {

    public ImageAdapter(Context context,  List<Image> arr) {
        super(context,0, arr);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if(listItemView == null){
            listItemView  = LayoutInflater.from(getContext()).inflate(R.layout.grdlist_design,parent,false);
        }

        Image shiv = getItem(position);
        ImageView image = (ImageView) listItemView.findViewById(R.id.img);
        image.setImageResource(shiv.getimageId());
        return listItemView;
    }
}
