package a1407229.lundy.com.movie_lundy;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class GridPresidentAdapter extends RecyclerView.Adapter<GridPresidentAdapter.GridViewHolder> {
    private Context context;
    private ArrayList<Film > listPresident;
    private ArrayList<Film> getListPresident() {
        return listPresident;
    }
    void setListPresident(ArrayList<Film> listPresident) {
        this.listPresident = listPresident;
    }
    GridPresidentAdapter(Context context) {
        this.context = context;
    }
    @Override
    public GridViewHolder onCreateViewHolder(ViewGroup parent, int
            viewType) {
        View view =
                LayoutInflater.from(parent.getContext()).inflate(R.layout.item_grid_film, parent, false);
        return new GridViewHolder(view);}@Override
    public void onBindViewHolder(GridViewHolder holder, int position) {
        Glide.with(context)
                .load(getListPresident().get(position).getPhoto())
                .override(350, 550)
                .into(holder.imgPhoto);
    }
    @Override
    public int getItemCount() {
        return getListPresident().size();
    }
    class GridViewHolder extends RecyclerView.ViewHolder{
        ImageView imgPhoto;
        GridViewHolder(View itemView) {
            super(itemView);
            imgPhoto =
                    (ImageView)itemView.findViewById(R.id.img_item_photo);
        }
    }
}
