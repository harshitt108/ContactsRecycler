package com.example.contactsrecycler;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>{
    private static final String TAG = "RecyclerViewAdapter";

    private ArrayList<String> mName = new ArrayList <> (  );
    private ArrayList<String> mNumber = new ArrayList <> (  );
    private Context mContext;

    public RecyclerViewAdapter(Context context,ArrayList<String> name , ArrayList<String> number  ) {
        mName = name;
        mNumber = number;
        mContext = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent , int viewType) {
        View view = LayoutInflater.from ( parent.getContext () ).inflate(R.layout.layout_listitem,parent,false);
        ViewHolder holder  =new ViewHolder ( view );
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder , final int position) {
        Log.d(TAG,"onBindView Holder called");
        holder.contactName.setText (mName.get ( position ));
        holder.contactNumber.setText ( mNumber.get ( position ) );
        holder.parentLayout.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick(View v) {
                Log.d ( TAG,"onClick: clicked on:"+mName.get(position) );
                Toast.makeText ( mContext,mNumber.get(position),Toast.LENGTH_SHORT ).show ();
            }
        } );



    }

    @Override
    public int getItemCount() {
        return mName.size ();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        CircleImageView image;
        TextView contactName;
        TextView contactNumber;
        RelativeLayout parentLayout;

        public ViewHolder(@NonNull View itemView) {
            super ( itemView );
            image = itemView.findViewById ( R.id.image );
            contactName =itemView.findViewById ( R.id.nameView );
            contactNumber = itemView.findViewById ( R.id.numberView );
            parentLayout = itemView.findViewById ( R.id.parent_layout );


        }
    }

}
