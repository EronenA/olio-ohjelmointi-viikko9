package org.eronen.viikko9;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class UserViewHolder extends RecyclerView.ViewHolder {

    TextView userName, userDegreeProgram, userEmail;

    public UserViewHolder(@NonNull View itemView) {
        super(itemView);
        userName = itemView.findViewById(R.id.txtUserName);
        userDegreeProgram = itemView.findViewById(R.id.txtDegreeProgram);
        userEmail = itemView.findViewById(R.id.txtEmail);

    }

}
