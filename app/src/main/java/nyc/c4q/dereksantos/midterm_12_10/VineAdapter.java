package nyc.c4q.dereksantos.midterm_12_10;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

public class VineAdapter extends RecyclerView.Adapter<VineRecordViewHolder> {

    List<Record> vineList;

    public VineAdapter(List<Record> vineList) {
        this.vineList = vineList;
    }

    @Override
    public VineRecordViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.vine_record, parent, false);
        return new VineRecordViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(VineRecordViewHolder holder, int position) {
        Record vineRecord = vineList.get(position);
        holder.bind(vineRecord);
    }

    @Override
    public int getItemCount() {
        return vineList.size();
    }
}
