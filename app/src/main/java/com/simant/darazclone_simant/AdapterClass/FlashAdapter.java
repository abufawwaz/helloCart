package com.simant.darazclone_simant.AdapterClass;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.simant.darazclone_simant.ModalClass.FlashModalClass;
import com.simant.darazclone_simant.R;
import com.squareup.picasso.Picasso;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class FlashAdapter extends RecyclerView.Adapter<FlashAdapter.ContactsViewHolder>{

    Context mContext;
    List<FlashModalClass> flashModalClassList;

    public FlashAdapter(Context mContext, List<FlashModalClass> flashModalClassList) {
        this.mContext = mContext;
        this.flashModalClassList = flashModalClassList;
    }

    @NonNull
    @Override
    public ContactsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).
                inflate(R.layout.list_flash_layout,parent,false);
        return new ContactsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ContactsViewHolder holder, final int position) {
        final FlashModalClass FlashModalClass = flashModalClassList.get(position);

        Picasso.get()
                .load(FlashModalClass.getSaleImage())
                .placeholder(R.drawable.ic_launcher_background)
                .resize(180, 180)
                .centerCrop()
                .into(holder.img_flash_image);

        holder.txt_sold_number.setText(FlashModalClass.getSold());
        holder.txt_flash_amount.setText(FlashModalClass.getAmount());

    }

    @Override
    public int getItemCount() {
        return flashModalClassList.size();

    }

    public class ContactsViewHolder extends RecyclerView.ViewHolder{

        ImageView img_flash_image;
        TextView txt_sold_number, txt_flash_amount;
        public ContactsViewHolder(@NonNull View itemView) {
            super(itemView);

            img_flash_image = itemView.findViewById(R.id.img_flash);
            txt_sold_number = itemView.findViewById(R.id.txtSold);
            txt_flash_amount = itemView.findViewById(R.id.txtAmount);

        }

    }

}
