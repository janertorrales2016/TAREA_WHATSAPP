package uteq.student.whatsapp2.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.android.volley.RequestQueue;
import com.bumptech.glide.Glide;

import java.util.List;

import uteq.student.whatsapp2.R;
import uteq.student.whatsapp2.model.llamada;

public class RecyclerViewAdaptercall extends RecyclerView.Adapter<RecyclerViewAdaptercall.MyViewHolder> {

    Context mContext;
    List<llamada> mData;
    public RecyclerViewAdaptercall(Context mContext, List<llamada> mData){
        this.mContext = mContext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(mContext).inflate(R.layout.item_call, parent,false);
        MyViewHolder vHolder =  new MyViewHolder(v);
        return vHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.tv_Name.setText(mData.get(position).getName());
        holder.tv_hora.setText(mData.get(position).getHora());
        if(mData.get(position).getEstado()=="entro"){
            holder.estado.setImageResource(R.drawable.call_recibe);
        }else{holder.estado.setImageResource(R.drawable.call_perdida);}
        if(mData.get(position).getCallvideo()=="video"){
            holder.tipo.setImageResource(R.drawable.iconvideo);
        }else{  holder.tipo.setImageResource(R.drawable.iconcelular);}
        Glide.with(mContext)
                .load(mData.get(position).getPhoto())
                .into(holder.perfil);
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{
        private TextView tv_Name;
        private TextView tv_hora;
        private ImageView perfil, estado, tipo;

        public MyViewHolder(View itemView){
            super(itemView);
            tv_Name =(TextView) itemView.findViewById(R.id.name_contact);
            tv_hora =(TextView) itemView.findViewById(R.id.hora_llamada);
            perfil = (ImageView) itemView.findViewById(R.id.imageProfile);
            estado =(ImageView)itemView.findViewById(R.id.imageestado);
            tipo = (ImageView)itemView.findViewById(R.id.img_tipo);

        }

    }
}
