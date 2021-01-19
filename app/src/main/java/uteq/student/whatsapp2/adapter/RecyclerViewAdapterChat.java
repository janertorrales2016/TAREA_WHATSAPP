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
import uteq.student.whatsapp2.model.llamada;
import uteq.student.whatsapp2.model.mensajes;

public class RecyclerViewAdapterChat extends RecyclerView.Adapter<RecyclerViewAdapterChat.MyViewHolder>  {

    Context mContext;
    List<mensajes> mData;
    public RecyclerViewAdapterChat(Context mContext, List<mensajes> mData){
        this.mContext = mContext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public RecyclerViewAdapterChat.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(mContext).inflate(R.layout.item_chat, parent,false);
        RecyclerViewAdapterChat.MyViewHolder vHolder =  new RecyclerViewAdapterChat.MyViewHolder(v);
        return vHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewAdapterChat.MyViewHolder holder, int position) {
        holder.tv_Name.setText(mData.get(position).getNombre());
        holder.tv_hora.setText(mData.get(position).getHora());
        holder.tv_mensaje.setText(mData.get(position).getMensaje());
        holder.tv_cantidad_men.setText(mData.get(position).getCantidad());
        switch (mData.get(position).getEstado()){
            case 1:
                holder.estado.setImageResource(R.drawable.visto_1);
                break;
            case 2:
                holder.estado.setImageResource(R.drawable.visto_2);
                break;
            case 3:
                holder.estado.setImageResource(R.drawable.visto_3);
                break;
        }
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
        private TextView tv_mensaje;
        private TextView tv_cantidad_men;
        private ImageView perfil, estado ;
        public MyViewHolder(View itemView){
            super(itemView);
            tv_Name =(TextView) itemView.findViewById(R.id.name_contact);
            tv_hora =(TextView) itemView.findViewById(R.id.txt_hora);
            tv_mensaje =(TextView) itemView.findViewById(R.id.mensaje);
            tv_cantidad_men =(TextView) itemView.findViewById(R.id.cantidad_mensajes);
            perfil = (ImageView) itemView.findViewById(R.id.imageProfile);
            estado =(ImageView)itemView.findViewById(R.id.imageestado);
        }

    }
}
