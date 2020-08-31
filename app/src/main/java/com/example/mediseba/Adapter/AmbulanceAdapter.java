package com.example.mediseba.Adapter;

import android.Manifest;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


import androidx.annotation.NonNull;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mediseba.Activity.MainActivity;
import com.example.mediseba.R;

public class AmbulanceAdapter extends RecyclerView.Adapter<AmbulanceAdapter.ViewHolder> {

    Context context;
    String [] nameArray, phnArray, disArray;
    private static final int REQUEST_CALL = 1;

    public AmbulanceAdapter(Context context, String[] nameArray, String[] phnArray, String[] disArray) {
        this.context = context;
        this.nameArray = nameArray;
        this.phnArray = phnArray;
        this.disArray = disArray;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.ambulance_sample, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, final int position) {
        holder.name.setText(nameArray[position]);
        holder.phn.setText(phnArray[position]);
        holder.dis.setText(disArray[position]);
        holder.callView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel:"+phnArray[position]));

                if (ContextCompat.checkSelfPermission(context,
                        Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions((Activity) context,
                            new String[]{Manifest.permission.CALL_PHONE}, REQUEST_CALL);
                }else {
                    context.startActivity(intent);
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return nameArray.length;
    }


    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView name, phn, dis;
        ImageView callView;

        public ViewHolder(View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.ambulance_name);
            phn = itemView.findViewById(R.id.ambulance_phone);
            dis = itemView.findViewById(R.id.ambulance_district);
            callView = itemView.findViewById(R.id.ambulance_call_icon);
        }
    }

}
