package com.example.yhislaraf.myemail;

import android.content.Context;
import android.database.DataSetObserver;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.support.v7.widget.RecyclerView;
import android.test.suitebuilder.TestMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by yhislaraf on 23-05-17.
 */

public class EmailAdapter extends BaseAdapter {

    private Context context;
    private int layout;
    private List<Email> list;
    private int SUBJECT_MAX_LENGHT = 40;
    private int MESSAGE_MAX_LENGHT = 80;

    public EmailAdapter(Context context, int layout, List<Email> list) {
        this.context = context;
        this.layout = layout;
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Email getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int id) {
        return id;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup viewGroup) {

        ViewHolder holder;

        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(layout, null);
            holder = new ViewHolder();
            holder.subject = (TextView) convertView.findViewById(R.id.textViewListSubject);
            holder.message = (TextView) convertView.findViewById(R.id.textViewListMessage);
            holder.sender = (TextView) convertView.findViewById(R.id.textViewListSenderName);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }


        Email currentMail = getItem(position);

        // Si el título del correo es más corto de 40 letras, lo dejamos igual, si es más largo,
        // lo cortamos y le añadimos puntos suspensivos al final
        String shortSubject;
        if (currentMail.getSubject().length() > SUBJECT_MAX_LENGHT) {
            shortSubject = currentMail.getSubject().substring(0, SUBJECT_MAX_LENGHT) + "...";
        } else {
            shortSubject = currentMail.getSubject();
        }
        holder.subject.setText(shortSubject);


        // Si el mensaje de correo es más corto de 80 letras, lo dejamos igual, si es más largo,
        // lo cortamos y le añadimos puntos suspensivos al final
        String shortMessage;
        if (currentMail.getMessage().length() > MESSAGE_MAX_LENGHT) {
            shortMessage = currentMail.getMessage().substring(0, MESSAGE_MAX_LENGHT) + "...";
        } else {
            shortMessage = currentMail.getMessage();
        }
        holder.message.setText(shortMessage);

        // Cogemos sólo la primera letra del correo
        holder.sender.setText(currentMail.getSenderName().substring(0, 1));
        // Obtenemos el backround que es un drawable, y le cambiamos el color con el random color
        holder.sender.getBackground().setColorFilter(Color.parseColor("#" + currentMail.getColor()), PorterDuff.Mode.SRC);

        return convertView;
    }

    static class ViewHolder {
        private TextView subject;
        private TextView message;
        private TextView sender;
    }
}