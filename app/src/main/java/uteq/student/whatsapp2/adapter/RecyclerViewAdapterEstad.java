package uteq.student.whatsapp2.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;

import uteq.student.whatsapp2.R;
import uteq.student.whatsapp2.model.estados;
import uteq.student.whatsapp2.model.llamada;

public class RecyclerViewAdapterEstad extends RecyclerView.Adapter<RecyclerViewAdapterEstad.MyViewHolder>{
    Context mContext;
    List<estados> mData;
    public RecyclerViewAdapterEstad(Context mContext, List<estados> mData){
        this.mContext = mContext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(mContext).inflate(R.layout.item_estad, parent,false);
        RecyclerViewAdapterEstad.MyViewHolder vHolder =  new RecyclerViewAdapterEstad.MyViewHolder(v);
        return vHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.tv_Name.setText(mData.get(position).getNombre());
        holder.tv_hora.setText(mData.get(position).getHora());
        Glide.with(mContext)
                .load(mData.get(position).getFoto())
                .into(holder.perfil);
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }


    public static class MyViewHolder extends RecyclerView.ViewHolder{
        private TextView tv_Name;
        private TextView tv_hora;
        private ImageView perfil;
        public MyViewHolder(View itemView){
            super(itemView);
            tv_Name =(TextView) itemView.findViewById(R.id.name_contact);
            tv_hora =(TextView) itemView.findViewById(R.id.hora_llamada);
            perfil = (ImageView) itemView.findViewById(R.id.imageProfile);
        }
    }
}
