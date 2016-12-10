package nyc.c4q.dereksantos.midterm_12_10;

import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

public class VineRecordViewHolder extends RecyclerView.ViewHolder {
    private final TextView usernameView;
    private final TextView likedView;
    private final View view;

    public VineRecordViewHolder(View itemView) {
        super(itemView);
        usernameView = (TextView) itemView.findViewById(R.id.vine_username);
        likedView = (TextView) itemView.findViewById(R.id.vine_liked);
        view = (View) itemView.findViewById(R.id.vine_view);
    }


    public void bind(Record vineRecord) {
//        if (!vineRecord.getUser().getUsername().isEmpty()) {
//            usernameView.setText(vineRecord.getUser().getUsername());
//        } else {
//            usernameView.setText("no username");
//        }

        usernameView.setText(vineRecord.getUsername());
        likedView.setText(vineRecord.getLiked());
//        itemView.setBackgroundColor(Color.parseColor(vineRecord.getProfileBackground()));
//        itemView.setBackgroundColor(5276389);
    }
}
