package adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ignite.R;

import java.util.ArrayList;

import Models.dashboard_bill_model;

public class dashboard_list_adapter extends RecyclerView.Adapter<dashboard_list_adapter.viewHolde> {


    ArrayList<dashboard_bill_model> list;
    Context context;
    public dashboard_list_adapter(ArrayList<dashboard_bill_model> list, Context context) {
        this.list = list;
        this.context = context;
    }




    @NonNull
    @Override
    public viewHolde onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.customer_detail,parent,false);
        return new viewHolde(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolde holder, int position) {

         dashboard_bill_model model = list.get(position);

         holder.namev.setText(model.getName());
         holder.billv.setText(model.getBill());
         holder.emailv.setText(model.getEmail());
         holder.phonev.setText(model.getPhone());
         holder.remarkv.setText(model.getRemark());

    }

    @Override
    public int getItemCount() {
        return (list==null)?0: list.size();
    }

    public class viewHolde extends RecyclerView.ViewHolder{

        TextView namev, phonev, emailv, remarkv, billv;

        public viewHolde(@NonNull View itemView) {
            super(itemView);

            namev = itemView.findViewById(R.id.idCustomerName);
            phonev = itemView.findViewById(R.id.idPhone);
            emailv = itemView.findViewById(R.id.idEmail);
            remarkv = itemView.findViewById(R.id.idremark);
            billv = itemView.findViewById(R.id.bill_id);

        }
    }



}
